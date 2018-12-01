# Overview
This filter is the gatekeeper in allowing services to access the service through either RESTful or Thrift endpoints.

## Prerequisites

- To support access controls, [two-Way SSL must be enabled.](TwoWaySSL.md)

## Step-by-step guide

### Enabling ACL

- A microservice project

#### Microservice project

- Go to __some-microservice/server/src/main/package/etc__ and create a file called __accessControlList.txt__ ( The name can be whatever you want it to be )
- Within the __accessControlList.txt__ add the __PKI__ certificate DNs that are able to access this service.
- Edit __some-microservice/server/src/main/package/etc/parameters.config__ ![See](Config.md)

Add:

#### Enable ACL

    -com.deciphernow.server.config.acl.whitelist.file=etc/whitelist.txt      


Update the service class to enable ACL. This example below enables the AclRestFilter to enforce ACL at REST. See [AclRestFilter](AclRestFilter.md) documentation to understand what it is doing.

      package com.acme
      
      import java.io.File
      
      import com.acme.rest.MyFirstMicroserviceRestController
      import com.acme.thrift.MyFirstMicroserviceThriftService
      
      import com.deciphernow.server.{GMFabricServer, RestServer, ThriftServer}
      import com.deciphernow.server.Implicits._
      
      import scala.concurrent.duration.Duration
      
      /**
        *
        */
      object MyFirstMicroservice extends GMFabricServer {
      
        //
        // All logic that requires parameters from 'Config' make sure to instantiate either as the last
        // instantiations inside of 'premain' or instantiate right after 'premain'.
        var myFirstMicroserviceManager : MyFirstMicroserviceManager = _
      
        // When using impersonating security filters, we need an access manager
        var accessManager: FileWhitelistImpersonationAccessManager = _
      
        // The access manager will require a whitelist file.  This is one way to use configuration for the file path.
        // Old attribute is: "acl.whitelist.file"
        val whitelistFile = flag[File]("com.deciphernow.server.config.acl.whitelist.file", "ACL whitelist file for user impersonation")
        
        premain {
      
          accessManager = new FileWhitelistImpersonationAccessManager(
             whitelistFile(), Duration(1, "minute")
          )
      
          //
          // Decryptor plugin - retrieve instance here.
          // val decryptor = DecryptorManager.getInstance
      
          //
          // Instantiate all business logic after the decryptor instantiation.
          myFirstMicroserviceManager = new MyFirstMicroserviceManager
        }
      
        /*
          Assign None to server if no server is going to be defined.
          def thrift = None
         */
        def thrift = Some(new ThriftServer(
          Seq(new WhitelistClientFilter(accessManager)),
          new MyFirstMicroserviceThriftService(myFirstMicroserviceManager)
        ))
      
        /*
          A rest server is always required since the admin server is
          instantiated here.
       */
        def rest = Some(new RestServer(
          Seq(new AclRestFilter(accessManager)),
          Seq(new MyFirstMicroserviceRestController(myFirstMicroserviceManager))
        ))
      
      }
  
    
### Testing the service

Start the MS and echo logs to the terminal

    $ cd my-first-microservice
    $ mvn clean package
    $ cd server/target/some-microservice-0.1.0-SNAPSHOT-app/some-microservice-0.1.0-SNAPSHOT
    $ bin/some-microservice console

## Verify ACL is working

Set `info` setting in etc/logback.xml to `debug` or remove the etc/logback.xml file. See [AclRestFilter](AclRestFilter.md).

### Normal request pattern ( non-impersonation )

If the request accessing the service is a normal (non-impersonation) request, the service will adhere to the normal request pattern.  This type of request does not require the DN to be on the ACL.  The log entry below will be generated based on this request type.

    12:37:31.154 [finagle/netty3-2] INFO  c.t.f.h.filters.AccessLoggingFilter - 127.0.0.1 - - [16/Jun/2016:16:37:31 +0000] "GET /ping HTTP/1.1" 200 4 7 "Apache-HttpClient/4.3.5 (java 1.5)"
    12:41:35.387 [finagle/netty3-9] INFO  g.i.c.server.security.AclRestFilter - Transaction: NORMAL VALID! UserAuthentication.current: CN=Bob Ward  transport: HTTPS user_dn: [not-provided]  ssl_client_s_dn: [cn=bob ward] external_sys_dn: [not-provided] 
    12:41:35.389 [finagle/netty3-9] INFO  c.t.f.h.filters.AccessLoggingFilter - 0:0:0:0:0:0:0:1 - - [16/Jun/2016:16:41:35 +0000] "GET /ping HTTP/1.1" 200 4 1 "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.11; rv:47.0) Gecko/20100101 Firefox/47.0"


### Impersonation request pattern
    
If the request accessing the service is impersonating a user and on the ACL, the service will adhere to the impersonation request pattern.  The log entry below will be generated based on this request type.

    12:37:31.143 [finagle/netty3-2] DEBUG g.i.c.s.s.FileWhitelistImpersonationAccessManager - Client cn=assertion-server
    12:37:31.144 [finagle/netty3-2] INFO  g.i.c.server.security.AclRestFilter - Transaction: IMPERSONATION VALID! UserAuthentication.current: cn=bob ward  transport: HTTP user_dn: [cn=bob ward] ssl_client_s_dn: [cn=assertion-server] external_sys_dn: [not-provided] 
    12:37:31.154 [finagle/netty3-2] INFO  c.t.f.h.filters.AccessLoggingFilter - 127.0.0.1 - - [16/Jun/2016:16:37:31 +0000] "GET /ping HTTP/1.1" 200 4 7 "Apache-HttpClient/4.3.5 (java 1.5)"

If the impersonation DN is not in the ACL file then the request will be rejected at `FileWhitelistImpersonationManager` looking like:

The return message is:

    Status  = 401
    Message = Unauthorized: The ssl_client_s_dn is not authorized to impersonate or have access.

The logs look like:

    12:44:47.750 [finagle/netty3-10] DEBUG g.i.c.s.s.FileWhitelistImpersonationAccessManager - Client cn=some-server-not-registered-in-whitelist is denied! Unable to impersonate cn=bob ward
    12:44:47.751 [finagle/netty3-10] INFO  g.i.c.server.security.AclRestFilter - Transaction: IMPERSONATION INVALID! transport: HTTP user_dn: [cn=bob ward] ssl_client_s_dn: [cn=some-server-not-registered-in-whitelist] external_sys_dn: [not-provided]  Unauthorized: The ssl_client_s_dn is not authorized to impersonate or have access.


#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}

import java.io.File

import ${package}.rest.${appName}RestController
import ${package}.thrift.${appName}ThriftService

// Uncomment if using Whitelist enforcement.
//import com.deciphernow.server.security.FileWhitelistImpersonationAccessManager

import com.deciphernow.server.{GMFabricServer, RestServer, ThriftServer}
import com.deciphernow.server.Implicits._

import scala.concurrent.duration.Duration

/**
  *
  */
object ${appName} extends GMFabricServer {

  //
  // All logic that requires parameters from 'Config' make sure to instantiate either as the last
  // instantiations inside of 'premain' or instantiate right after 'premain'.
  var ${appName.substring(0,1).toLowerCase()}${appName.substring(1)}Manager : ${appName}Manager = _

  // When using impersonating security filters, we need an access manager
  //var accessManager: FileWhitelistImpersonationAccessManager = _

  // The access manager will require a whitelist file.  This is one way to use configuration for the file path.
  // Old attribute is: "acl.whitelist.file"
  //val whitelistFile = flag[File]("com.deciphernow.server.config.acl.whitelist.file", "ACL whitelist file for user impersonation")

  premain {

    //accessManager = new FileWhitelistImpersonationAccessManager(
    //   whitelistFile(), Duration(1, "minute")
    //)

    //
    // Decryptor plugin - retrieve instance here.
    // val decryptor = DecryptorManager.getInstance

    //
    // Instantiate all business logic after the decryptor instantiation.
    ${appName.substring(0,1).toLowerCase()}${appName.substring(1)}Manager = new ${appName}Manager
  }

  /*
    Assign None to server if no server is going to be defined.
    def thrift = None
   */
  def thrift = Some(new ThriftServer(
    Nil,
    new ${appName}ThriftService(${appName.substring(0,1).toLowerCase()}${appName.substring(1)}Manager)
  ))

  /*
    A rest server is always required since the admin server is
    instantiated here.
 */
  def rest = Some(new RestServer(
    Nil,
    Seq(new ${appName}RestController(${appName.substring(0,1).toLowerCase()}${appName.substring(1)}Manager))
  ))

}


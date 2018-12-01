# Overview
This document is a live example of roughly what you will see when you generate your first microservice and execute it using the latest release of the framework.

# Creating my first microservice.

## Generation command

The following command will create your microservice.

    $ mvn archetype:generate -DarchetypeGroupId=com.deciphernow -DarchetypeArtifactId=gm-fabric-archetype -DarchetypeVersion=0.2.8
    
### Captured output

The following output is close to what to expect when you generate your microservice. In this example we have defined the __groupId__ as __com.acme__ and __artifactId__ as __myfirstmicroservice__. When the question "Define value for property 'package' __com.acme__: : " we hit enter to keep the same package name. Now for the next question, we change the __appName__ casing from __myfirstmicroservice__ to __MyFirstMicroservice__.


    Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=512m; support was removed in 8.0
    
    [INFO] Scanning for projects...
    [INFO]                                                                         
    [INFO] ------------------------------------------------------------------------
    [INFO] Building Maven Stub Project (No POM) 1
    [INFO] ------------------------------------------------------------------------
    [INFO] 
    [INFO] >>> maven-archetype-plugin:3.0.1:generate (default-cli) > generate-sources @ standalone-pom >>>
    [INFO] 
    [INFO] <<< maven-archetype-plugin:3.0.1:generate (default-cli) < generate-sources @ standalone-pom <<<
    [INFO] 
    [INFO] --- maven-archetype-plugin:3.0.1:generate (default-cli) @ standalone-pom ---
    [INFO] Generating project in Interactive mode
    [INFO] 
    Define value for property 'groupId': com.acme
    Define value for property 'artifactId': myfirstmicroservice
    [INFO] Using property: version = 0.1.0-SNAPSHOT
    Define value for property 'package' com.acme: : 
    Define value for property 'appName': MyFirstMicroservice
    [INFO] Using property: serviceFrameworkVersion = 0.2.8
    Confirm properties configuration:
    groupId: com.acme
    artifactId: myfirstmicroservice
    version: 0.1.0-SNAPSHOT
    package: com.acme
    appName: MyFirstMicroservice
    serviceFrameworkVersion: 0.2.8
     Y: : 
    [INFO] ----------------------------------------------------------------------------
    [INFO] Using following parameters for creating project from Archetype: gm-fabric-archetype:0.2.8
    [INFO] ----------------------------------------------------------------------------
    [INFO] Parameter: groupId, Value: com.acme
    [INFO] Parameter: artifactId, Value: myfirstmicroservice
    [INFO] Parameter: version, Value: 0.1.0-SNAPSHOT
    [INFO] Parameter: package, Value: com.acme
    [INFO] Parameter: packageInPathFormat, Value: com/acme
    [INFO] Parameter: appName, Value: MyFirstMicroservice
    [INFO] Parameter: serviceFrameworkVersion, Value: 0.2.8
    [INFO] Parameter: package, Value: com.acme
    [INFO] Parameter: version, Value: 0.1.0-SNAPSHOT
    [INFO] Parameter: groupId, Value: com.acme
    [INFO] Parameter: artifactId, Value: myfirstmicroservice
    [INFO] Parent element not overwritten in /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/config/pom.xml
    [INFO] Parent element not overwritten in /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/business/pom.xml
    [INFO] Parent element not overwritten in /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/client/pom.xml
    [INFO] Parent element not overwritten in /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/model/pom.xml
    [INFO] Parent element not overwritten in /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/pom.xml
    [INFO] Project created from Archetype in dir: /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time: 16.065 s
    [INFO] Finished at: 2018-01-26T13:41:52-05:00
    [INFO] Final Memory: 27M/477M
    [INFO] ------------------------------------------------------------------------
    

    
## Compiling MyFirstMicroservice
    
Time to compile our microservice.    
    
    $ cd myfirstmicroservice
    $ mvn clean generate-sources package
    
### Compiled output
    
    Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=512m; support was removed in 8.0
    
    [INFO] Scanning for projects...
    [INFO] ------------------------------------------------------------------------
    [INFO] Reactor Build Order:
    [INFO] 
    [INFO] myfirstmicroservice [Root]
    [INFO] myfirstmicroservice-config [Config]
    [INFO] myfirstmicroservice-model [Model]
    [INFO] myfirstmicroservice-client [Client]
    [INFO] myfirstmicroservice-business [Business]
    [INFO] myfirstmicroservice-server [Server]
    [INFO]                                                                         
    [INFO] ------------------------------------------------------------------------
    [INFO] Building myfirstmicroservice [Root] 0.1.0-SNAPSHOT
    [INFO] ------------------------------------------------------------------------
    [INFO] 
    [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ myfirstmicroservice ---
    [INFO] 
    [INFO] --- maven-install-plugin:2.4:install (default-install) @ myfirstmicroservice ---
    [INFO] Installing /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/pom.xml to /home/developer/.m2/repository/com/acme/myfirstmicroservice/0.1.0-SNAPSHOT/myfirstmicroservice-0.1.0-SNAPSHOT.pom
    [INFO]                                                                         
    [INFO] ------------------------------------------------------------------------
    [INFO] Building myfirstmicroservice-config [Config] 0.1.0-SNAPSHOT
    [INFO] ------------------------------------------------------------------------
    [INFO] 
    [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ myfirstmicroservice-config ---
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-pre-install) @ myfirstmicroservice-config ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/config/src/main/package/rpm
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-post-install) @ myfirstmicroservice-config ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/config/src/main/package/rpm
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-pre-remove) @ myfirstmicroservice-config ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/config/src/main/package/rpm
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-pre-install) @ myfirstmicroservice-config ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/config/src/main/package/rpm
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-post-install) @ myfirstmicroservice-config ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/config/src/main/package/rpm
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-pre-remove) @ myfirstmicroservice-config ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/config/src/main/package/rpm
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:resources (default-resources) @ myfirstmicroservice-config ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/config/src/main/resources
    [INFO] 
    [INFO] --- scala-maven-plugin:3.1.0:add-source (scala-compile-first) @ myfirstmicroservice-config ---
    [INFO] Add Source directory: /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/config/src/main/scala
    [INFO] Add Test Source directory: /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/config/src/test/scala
    [INFO] 
    [INFO] --- scala-maven-plugin:3.1.0:compile (scala-compile-first) @ myfirstmicroservice-config ---
    [INFO] /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/config/src/main/scala:-1: info: compiling
    [INFO] Compiling 1 source files to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/config/target/classes at 1516992123670
    [INFO] prepare-compile in 0 s
    [INFO] compile in 1 s
    [INFO] 
    [INFO] --- maven-compiler-plugin:3.7.0:compile (default-compile) @ myfirstmicroservice-config ---
    [INFO] Nothing to compile - all classes are up to date
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:testResources (default-testResources) @ myfirstmicroservice-config ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/config/src/test/resources
    [INFO] 
    [INFO] --- scala-maven-plugin:3.1.0:testCompile (scala-test-compile) @ myfirstmicroservice-config ---
    [WARNING] No source files found.
    [INFO] 
    [INFO] --- maven-compiler-plugin:3.7.0:testCompile (default-testCompile) @ myfirstmicroservice-config ---
    [INFO] No sources to compile
    [INFO] 
    [INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ myfirstmicroservice-config ---
    [INFO] No tests to run.
    [INFO] 
    [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ myfirstmicroservice-config ---
    [INFO] Building jar: /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/config/target/myfirstmicroservice-config-0.1.0-SNAPSHOT.jar
    [INFO] 
    [INFO] >>> scala-maven-plugin:3.1.0:doc-jar (scala-attach-scaladocs) > generate-sources @ myfirstmicroservice-config >>>
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-pre-install) @ myfirstmicroservice-config ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/config/src/main/package/rpm
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-post-install) @ myfirstmicroservice-config ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/config/src/main/package/rpm
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-pre-remove) @ myfirstmicroservice-config ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/config/src/main/package/rpm
    [INFO] 
    [INFO] <<< scala-maven-plugin:3.1.0:doc-jar (scala-attach-scaladocs) < generate-sources @ myfirstmicroservice-config <<<
    [INFO] 
    [INFO] --- scala-maven-plugin:3.1.0:doc-jar (scala-attach-scaladocs) @ myfirstmicroservice-config ---
    model contains 1 documentable templates
    [INFO] Building jar: /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/config/target/myfirstmicroservice-config-0.1.0-SNAPSHOT-javadoc.jar
    [INFO] 
    [INFO] --- maven-install-plugin:2.4:install (default-install) @ myfirstmicroservice-config ---
    [INFO] Installing /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/config/target/myfirstmicroservice-config-0.1.0-SNAPSHOT.jar to /home/developer/.m2/repository/com/acme/myfirstmicroservice-config/0.1.0-SNAPSHOT/myfirstmicroservice-config-0.1.0-SNAPSHOT.jar
    [INFO] Installing /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/config/pom.xml to /home/developer/.m2/repository/com/acme/myfirstmicroservice-config/0.1.0-SNAPSHOT/myfirstmicroservice-config-0.1.0-SNAPSHOT.pom
    [INFO] Installing /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/config/target/myfirstmicroservice-config-0.1.0-SNAPSHOT-javadoc.jar to /home/developer/.m2/repository/com/acme/myfirstmicroservice-config/0.1.0-SNAPSHOT/myfirstmicroservice-config-0.1.0-SNAPSHOT-javadoc.jar
    [INFO]                                                                         
    [INFO] ------------------------------------------------------------------------
    [INFO] Building myfirstmicroservice-model [Model] 0.1.0-SNAPSHOT
    [INFO] ------------------------------------------------------------------------
    [INFO] 
    [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ myfirstmicroservice-model ---
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-pre-install) @ myfirstmicroservice-model ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/model/src/main/package/rpm
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-post-install) @ myfirstmicroservice-model ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/model/src/main/package/rpm
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-pre-remove) @ myfirstmicroservice-model ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/model/src/main/package/rpm
    [INFO] 
    [INFO] --- scrooge-maven-plugin:4.14.0:compile (thrift-sources) @ myfirstmicroservice-model ---
    [INFO] finding thrift files in dependencies
    [INFO] finding thrift files in referenced (reactor) projects
    [INFO] compiling thrift files [/media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/model/src/main/thrift/MyFirstMicroservice.thrift] with Scrooge
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-pre-install) @ myfirstmicroservice-model ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/model/src/main/package/rpm
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-post-install) @ myfirstmicroservice-model ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/model/src/main/package/rpm
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-pre-remove) @ myfirstmicroservice-model ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/model/src/main/package/rpm
    [INFO] 
    [INFO] --- scrooge-maven-plugin:4.14.0:compile (thrift-sources) @ myfirstmicroservice-model ---
    [INFO] finding thrift files in dependencies
    [INFO] finding thrift files in referenced (reactor) projects
    [INFO] Generated thrift files up to date, skipping compile.
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:resources (default-resources) @ myfirstmicroservice-model ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/model/src/main/resources
    [INFO] Copying 1 resource
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/model/target/generated-resources
    [INFO] Copying 1 resource
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/model/target/generated-resources
    [INFO] 
    [INFO] --- maven-compiler-plugin:3.7.0:compile (default-compile) @ myfirstmicroservice-model ---
    [INFO] Changes detected - recompiling the module!
    [INFO] Compiling 1 source file to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/model/target/classes
    [INFO] /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/model/target/generated-sources/thrift/scrooge/com/acme/thrift/MyFirstMicroservice.java: /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/model/target/generated-sources/thrift/scrooge/com/acme/thrift/MyFirstMicroservice.java uses unchecked or unsafe operations.
    [INFO] /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/model/target/generated-sources/thrift/scrooge/com/acme/thrift/MyFirstMicroservice.java: Recompile with -Xlint:unchecked for details.
    [INFO] 
    [INFO] --- scrooge-maven-plugin:4.14.0:testCompile (thrift-test-sources) @ myfirstmicroservice-model ---
    [INFO] finding thrift files in dependencies
    [INFO] finding thrift files in referenced (reactor) projects
    [INFO] No thrift files to compile.
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:testResources (default-testResources) @ myfirstmicroservice-model ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/model/src/test/resources
    [INFO] 
    [INFO] --- maven-compiler-plugin:3.7.0:testCompile (default-testCompile) @ myfirstmicroservice-model ---
    [INFO] No sources to compile
    [INFO] 
    [INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ myfirstmicroservice-model ---
    [INFO] No tests to run.
    [INFO] 
    [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ myfirstmicroservice-model ---
    [INFO] Building jar: /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/model/target/myfirstmicroservice-model-0.1.0-SNAPSHOT.jar
    [INFO] 
    [INFO] --- maven-install-plugin:2.4:install (default-install) @ myfirstmicroservice-model ---
    [INFO] Installing /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/model/target/myfirstmicroservice-model-0.1.0-SNAPSHOT.jar to /home/developer/.m2/repository/com/acme/myfirstmicroservice-model/0.1.0-SNAPSHOT/myfirstmicroservice-model-0.1.0-SNAPSHOT.jar
    [INFO] Installing /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/model/pom.xml to /home/developer/.m2/repository/com/acme/myfirstmicroservice-model/0.1.0-SNAPSHOT/myfirstmicroservice-model-0.1.0-SNAPSHOT.pom
    [INFO]                                                                         
    [INFO] ------------------------------------------------------------------------
    [INFO] Building myfirstmicroservice-client [Client] 0.1.0-SNAPSHOT
    [INFO] ------------------------------------------------------------------------
    [INFO] 
    [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ myfirstmicroservice-client ---
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-pre-install) @ myfirstmicroservice-client ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/client/src/main/package/rpm
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-post-install) @ myfirstmicroservice-client ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/client/src/main/package/rpm
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-pre-remove) @ myfirstmicroservice-client ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/client/src/main/package/rpm
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-pre-install) @ myfirstmicroservice-client ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/client/src/main/package/rpm
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-post-install) @ myfirstmicroservice-client ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/client/src/main/package/rpm
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-pre-remove) @ myfirstmicroservice-client ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/client/src/main/package/rpm
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:resources (default-resources) @ myfirstmicroservice-client ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/client/src/main/resources
    [INFO] 
    [INFO] --- scala-maven-plugin:3.1.0:add-source (scala-compile-first) @ myfirstmicroservice-client ---
    [INFO] Add Source directory: /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/client/src/main/scala
    [INFO] Add Test Source directory: /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/client/src/test/scala
    [INFO] 
    [INFO] --- scala-maven-plugin:3.1.0:compile (scala-compile-first) @ myfirstmicroservice-client ---
    [INFO] /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/client/src/main/java:-1: info: compiling
    [INFO] /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/client/src/main/scala:-1: info: compiling
    [INFO] Compiling 1 source files to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/client/target/classes at 1516992129186
    [INFO] prepare-compile in 0 s
    [INFO] compile in 1 s
    [INFO] 
    [INFO] --- maven-compiler-plugin:3.7.0:compile (default-compile) @ myfirstmicroservice-client ---
    [INFO] Nothing to compile - all classes are up to date
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:testResources (default-testResources) @ myfirstmicroservice-client ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/client/src/test/resources
    [INFO] 
    [INFO] --- scala-maven-plugin:3.1.0:testCompile (scala-test-compile) @ myfirstmicroservice-client ---
    [WARNING] No source files found.
    [INFO] 
    [INFO] --- maven-compiler-plugin:3.7.0:testCompile (default-testCompile) @ myfirstmicroservice-client ---
    [INFO] Nothing to compile - all classes are up to date
    [INFO] 
    [INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ myfirstmicroservice-client ---
    [INFO] No tests to run.
    [INFO] 
    [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ myfirstmicroservice-client ---
    [INFO] Building jar: /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/client/target/myfirstmicroservice-client-0.1.0-SNAPSHOT.jar
    [INFO] 
    [INFO] >>> scala-maven-plugin:3.1.0:doc-jar (scala-attach-scaladocs) > generate-sources @ myfirstmicroservice-client >>>
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-pre-install) @ myfirstmicroservice-client ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/client/src/main/package/rpm
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-post-install) @ myfirstmicroservice-client ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/client/src/main/package/rpm
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-pre-remove) @ myfirstmicroservice-client ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/client/src/main/package/rpm
    [INFO] 
    [INFO] <<< scala-maven-plugin:3.1.0:doc-jar (scala-attach-scaladocs) < generate-sources @ myfirstmicroservice-client <<<
    [INFO] 
    [INFO] --- scala-maven-plugin:3.1.0:doc-jar (scala-attach-scaladocs) @ myfirstmicroservice-client ---
    model contains 6 documentable templates
    [INFO] Building jar: /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/client/target/myfirstmicroservice-client-0.1.0-SNAPSHOT-javadoc.jar
    [INFO] 
    [INFO] --- maven-install-plugin:2.4:install (default-install) @ myfirstmicroservice-client ---
    [INFO] Installing /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/client/target/myfirstmicroservice-client-0.1.0-SNAPSHOT.jar to /home/developer/.m2/repository/com/acme/myfirstmicroservice-client/0.1.0-SNAPSHOT/myfirstmicroservice-client-0.1.0-SNAPSHOT.jar
    [INFO] Installing /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/client/pom.xml to /home/developer/.m2/repository/com/acme/myfirstmicroservice-client/0.1.0-SNAPSHOT/myfirstmicroservice-client-0.1.0-SNAPSHOT.pom
    [INFO] Installing /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/client/target/myfirstmicroservice-client-0.1.0-SNAPSHOT-javadoc.jar to /home/developer/.m2/repository/com/acme/myfirstmicroservice-client/0.1.0-SNAPSHOT/myfirstmicroservice-client-0.1.0-SNAPSHOT-javadoc.jar
    [INFO]                                                                         
    [INFO] ------------------------------------------------------------------------
    [INFO] Building myfirstmicroservice-business [Business] 0.1.0-SNAPSHOT
    [INFO] ------------------------------------------------------------------------
    [INFO] 
    [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ myfirstmicroservice-business ---
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-pre-install) @ myfirstmicroservice-business ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/business/src/main/package/rpm
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-post-install) @ myfirstmicroservice-business ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/business/src/main/package/rpm
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-pre-remove) @ myfirstmicroservice-business ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/business/src/main/package/rpm
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-pre-install) @ myfirstmicroservice-business ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/business/src/main/package/rpm
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-post-install) @ myfirstmicroservice-business ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/business/src/main/package/rpm
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-pre-remove) @ myfirstmicroservice-business ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/business/src/main/package/rpm
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:resources (default-resources) @ myfirstmicroservice-business ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/business/src/main/resources
    [INFO] 
    [INFO] --- scala-maven-plugin:3.1.0:add-source (scala-compile-first) @ myfirstmicroservice-business ---
    [INFO] Add Source directory: /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/business/src/main/scala
    [INFO] Add Test Source directory: /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/business/src/test/scala
    [INFO] 
    [INFO] --- scala-maven-plugin:3.1.0:compile (scala-compile-first) @ myfirstmicroservice-business ---
    [INFO] /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/business/src/main/java:-1: info: compiling
    [INFO] /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/business/src/main/scala:-1: info: compiling
    [INFO] Compiling 1 source files to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/business/target/classes at 1516992133189
    [INFO] prepare-compile in 0 s
    [INFO] compile in 1 s
    [INFO] 
    [INFO] --- maven-compiler-plugin:3.7.0:compile (default-compile) @ myfirstmicroservice-business ---
    [INFO] Nothing to compile - all classes are up to date
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:testResources (default-testResources) @ myfirstmicroservice-business ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/business/src/test/resources
    [INFO] 
    [INFO] --- scala-maven-plugin:3.1.0:testCompile (scala-test-compile) @ myfirstmicroservice-business ---
    [WARNING] No source files found.
    [INFO] 
    [INFO] --- maven-compiler-plugin:3.7.0:testCompile (default-testCompile) @ myfirstmicroservice-business ---
    [INFO] No sources to compile
    [INFO] 
    [INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ myfirstmicroservice-business ---
    [INFO] No tests to run.
    [INFO] 
    [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ myfirstmicroservice-business ---
    [INFO] Building jar: /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/business/target/myfirstmicroservice-business-0.1.0-SNAPSHOT.jar
    [INFO] 
    [INFO] >>> scala-maven-plugin:3.1.0:doc-jar (scala-attach-scaladocs) > generate-sources @ myfirstmicroservice-business >>>
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-pre-install) @ myfirstmicroservice-business ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/business/src/main/package/rpm
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-post-install) @ myfirstmicroservice-business ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/business/src/main/package/rpm
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-pre-remove) @ myfirstmicroservice-business ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/business/src/main/package/rpm
    [INFO] 
    [INFO] <<< scala-maven-plugin:3.1.0:doc-jar (scala-attach-scaladocs) < generate-sources @ myfirstmicroservice-business <<<
    [INFO] 
    [INFO] --- scala-maven-plugin:3.1.0:doc-jar (scala-attach-scaladocs) @ myfirstmicroservice-business ---
    model contains 4 documentable templates
    [INFO] Building jar: /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/business/target/myfirstmicroservice-business-0.1.0-SNAPSHOT-javadoc.jar
    [INFO] 
    [INFO] --- maven-install-plugin:2.4:install (default-install) @ myfirstmicroservice-business ---
    [INFO] Installing /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/business/target/myfirstmicroservice-business-0.1.0-SNAPSHOT.jar to /home/developer/.m2/repository/com/acme/myfirstmicroservice-business/0.1.0-SNAPSHOT/myfirstmicroservice-business-0.1.0-SNAPSHOT.jar
    [INFO] Installing /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/business/pom.xml to /home/developer/.m2/repository/com/acme/myfirstmicroservice-business/0.1.0-SNAPSHOT/myfirstmicroservice-business-0.1.0-SNAPSHOT.pom
    [INFO] Installing /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/business/target/myfirstmicroservice-business-0.1.0-SNAPSHOT-javadoc.jar to /home/developer/.m2/repository/com/acme/myfirstmicroservice-business/0.1.0-SNAPSHOT/myfirstmicroservice-business-0.1.0-SNAPSHOT-javadoc.jar
    [INFO]                                                                         
    [INFO] ------------------------------------------------------------------------
    [INFO] Building myfirstmicroservice-server [Server] 0.1.0-SNAPSHOT
    [INFO] ------------------------------------------------------------------------
    [INFO] 
    [INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ myfirstmicroservice-server ---
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-pre-install) @ myfirstmicroservice-server ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] Copying 1 resource
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-post-install) @ myfirstmicroservice-server ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] Copying 1 resource
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-pre-remove) @ myfirstmicroservice-server ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] Copying 1 resource
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-pre-install) @ myfirstmicroservice-server ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] Copying 1 resource
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-post-install) @ myfirstmicroservice-server ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] Copying 1 resource
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-pre-remove) @ myfirstmicroservice-server ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] Copying 1 resource
    [INFO] 
    [INFO] --- buildnumber-maven-plugin:1.4:create (default) @ myfirstmicroservice-server ---
    [INFO] Storing buildNumber: 1.201801261342 at timestamp: 1516992136671
    [WARNING] Cannot get the branch information from the git repository: 
    Detecting the current branch failed: fatal: Not a git repository (or any parent up to mount point /media)
    Stopping at filesystem boundary (GIT_DISCOVERY_ACROSS_FILESYSTEM not set).
    
    [INFO] Executing: /bin/sh -c cd '/media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server' && 'git' 'rev-parse' '--verify' 'HEAD'
    [INFO] Working directory: /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server
    [INFO] Storing buildScmBranch: UNKNOWN_BRANCH
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:resources (default-resources) @ myfirstmicroservice-server ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] Copying 0 resource
    [INFO] 
    [INFO] --- scala-maven-plugin:3.1.0:add-source (scala-compile-first) @ myfirstmicroservice-server ---
    [INFO] Add Source directory: /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/src/main/scala
    [INFO] Add Test Source directory: /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/src/test/scala
    [INFO] 
    [INFO] --- scala-maven-plugin:3.1.0:compile (scala-compile-first) @ myfirstmicroservice-server ---
    [INFO] /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/src/main/java:-1: info: compiling
    [INFO] /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/src/main/scala:-1: info: compiling
    [INFO] Compiling 3 source files to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/classes at 1516992136910
    [INFO] prepare-compile in 0 s
    [INFO] compile in 2 s
    [INFO] 
    [INFO] --- maven-compiler-plugin:3.7.0:compile (default-compile) @ myfirstmicroservice-server ---
    [INFO] Changes detected - recompiling the module!
    [INFO] Compiling 1 source file to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/classes
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:testResources (default-testResources) @ myfirstmicroservice-server ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] skip non existing resourceDirectory /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/src/test/resources
    [INFO] 
    [INFO] --- scala-maven-plugin:3.1.0:testCompile (scala-test-compile) @ myfirstmicroservice-server ---
    [INFO] /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/src/test/java:-1: info: compiling
    [INFO] /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/src/test/scala:-1: info: compiling
    [INFO] Compiling 1 source files to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/test-classes at 1516992139629
    [INFO] prepare-compile in 0 s
    [INFO] compile in 2 s
    [INFO] 
    [INFO] --- maven-compiler-plugin:3.7.0:testCompile (default-testCompile) @ myfirstmicroservice-server ---
    [INFO] Nothing to compile - all classes are up to date
    [INFO] 
    [INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ myfirstmicroservice-server ---
    [INFO] 
    [INFO] --- scalatest-maven-plugin:1.0:test (test) @ myfirstmicroservice-server ---
    [36mDiscovery starting.[0m
    Jan 26, 2018 6:42:23 PM com.twitter.finagle.http.HttpMuxer$$anonfun$4 apply
    INFO: HttpMuxer[/admin/metrics.json] = com.twitter.finagle.stats.MetricsExporter(<function1>)
    Jan 26, 2018 6:42:23 PM com.twitter.finagle.http.HttpMuxer$$anonfun$4 apply
    INFO: HttpMuxer[/admin/per_host_metrics.json] = com.twitter.finagle.stats.HostMetricsExporter(<function1>)
    18:42:23.599 [ScalaTest-main] INFO  c.t.i.logging.Slf4jBridgeUtility$ - org.slf4j.bridge.SLF4JBridgeHandler installed.
    [36mDiscovery completed in 1 second, 537 milliseconds.[0m
    [36mRun starting. Expected test count is: 1[0m
    [32mMyFirstMicroserviceRestControllerSpec:[0m
    
    Starting com.acme.rest.FakeServer with args: -admin.port=127.0.0.1:0 -http.port=127.0.0.1:0 -log.level=WARNING
    18:42:24.444 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - Process started
    Waiting for warmup phases to complete...
    18:42:24.647 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer -  => com.twitter.server.handler.AdminRedirectHandler
    18:42:24.647 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin => com.twitter.server.handler.SummaryHandler
    18:42:24.648 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/server_info => com.twitter.finagle.Filter$$anon$1
    18:42:24.648 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/contention => com.twitter.finagle.Filter$$anon$1
    18:42:24.648 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/lint => com.twitter.server.handler.LintHandler
    18:42:24.648 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/lint.json => com.twitter.server.handler.LintHandler
    18:42:24.648 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/failedlint => com.twitter.server.handler.FailedLintRuleHandler
    18:42:24.649 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/threads => com.twitter.server.handler.ThreadsHandler
    18:42:24.649 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/threads.json => com.twitter.server.handler.ThreadsHandler
    18:42:24.649 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/announcer => com.twitter.finagle.Filter$$anon$1
    18:42:24.649 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/dtab => com.twitter.finagle.Filter$$anon$1
    18:42:24.649 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/pprof/heap => com.twitter.server.handler.HeapResourceHandler
    18:42:24.649 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/pprof/profile => com.twitter.server.handler.ProfileResourceHandler
    18:42:24.650 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/pprof/contention => com.twitter.server.handler.ProfileResourceHandler
    18:42:24.650 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/ping => com.twitter.server.handler.ReplyHandler
    18:42:24.650 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/shutdown => com.twitter.server.handler.ShutdownHandler
    18:42:24.650 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/tracing => com.twitter.server.handler.TracingHandler
    18:42:24.650 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/events => com.twitter.server.handler.EventsHandler
    18:42:24.651 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/events/record/ => com.twitter.server.handler.EventRecordingHandler
    18:42:24.651 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/logging => com.twitter.server.handler.LoggingHandler
    18:42:24.651 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/metrics => com.twitter.server.handler.MetricQueryHandler
    18:42:24.651 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/clients/ => com.twitter.server.handler.ClientRegistryHandler
    18:42:24.651 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/servers/ => com.twitter.server.handler.ServerRegistryHandler
    18:42:24.651 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/files/ => com.twitter.server.handler.ResourceHandler
    18:42:24.651 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/registry.json => com.twitter.server.handler.RegistryHandler
    18:42:24.652 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/toggles => com.twitter.server.handler.ToggleHandler
    18:42:24.652 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/toggles/ => com.twitter.server.handler.ToggleHandler
    18:42:24.652 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /favicon.ico => com.twitter.server.handler.ResourceHandler
    18:42:24.652 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/histograms => com.twitter.server.handler.HistogramQueryHandler
    18:42:24.652 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/histograms.json => com.twitter.server.handler.HistogramQueryHandler
    18:42:24.655 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - Serving admin http on localhost/127.0.0.1:0
    18:42:24.809 [Embedded com.acme.rest.FakeServer-1] INFO  com.twitter.finagle - Finagle version 6.42.0 (rev=f48520b6809792d8cb87c5d81a13075fd01c051d) built at 20170203-165908
    18:42:24.931 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.u.i.l.InternalLoggerFactory - Using SLF4J as the default logging framework
    18:42:24.931 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.util.internal.PlatformDependent - -Dio.netty.noUnsafe: false
    18:42:24.934 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.util.internal.PlatformDependent0 - java.nio.Buffer.address: available
    18:42:24.934 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.util.internal.PlatformDependent0 - sun.misc.Unsafe.theUnsafe: available
    18:42:24.935 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.util.internal.PlatformDependent0 - sun.misc.Unsafe.copyMemory: available
    18:42:24.935 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.util.internal.PlatformDependent0 - direct buffer constructor: available
    18:42:24.936 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.util.internal.PlatformDependent0 - java.nio.Bits.unaligned: available, true
    18:42:24.936 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.util.internal.PlatformDependent0 - java.nio.DirectByteBuffer.<init>(long, int): available
    18:42:24.936 [Embedded com.acme.rest.FakeServer-1] DEBUG io.netty.util.internal.Cleaner0 - java.nio.ByteBuffer.cleaner(): available
    18:42:24.937 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.util.internal.PlatformDependent - Java version: 8
    18:42:24.937 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.util.internal.PlatformDependent - sun.misc.Unsafe: available
    18:42:24.937 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.util.internal.PlatformDependent - -Dio.netty.noJavassist: false
    18:42:24.938 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.util.internal.PlatformDependent - Javassist: unavailable
    18:42:24.938 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.util.internal.PlatformDependent - You don't have Javassist in your class path or you don't have enough permission to load dynamically generated classes.  Please check the configuration for better performance.
    18:42:24.938 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.util.internal.PlatformDependent - -Dio.netty.tmpdir: /tmp (java.io.tmpdir)
    18:42:24.938 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.util.internal.PlatformDependent - -Dio.netty.bitMode: 64 (sun.arch.data.model)
    18:42:24.938 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.util.internal.PlatformDependent - -Dio.netty.noPreferDirect: false
    18:42:24.938 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.util.internal.PlatformDependent - io.netty.maxDirectMemory: 7486832640 bytes
    18:42:24.967 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.c.MultithreadEventLoopGroup - -Dio.netty.eventLoopThreads: 16
    18:42:24.980 [Embedded com.acme.rest.FakeServer-1] DEBUG io.netty.channel.nio.NioEventLoop - -Dio.netty.noKeySetOptimization: false
    18:42:24.981 [Embedded com.acme.rest.FakeServer-1] DEBUG io.netty.channel.nio.NioEventLoop - -Dio.netty.selectorAutoRebuildThreshold: 512
    18:42:24.982 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.util.internal.PlatformDependent - org.jctools-core.MpscChunkedArrayQueue: available
    18:42:25.007 [Embedded com.acme.rest.FakeServer-1] DEBUG io.netty.channel.DefaultChannelId - -Dio.netty.processId: 22687 (auto-detected)
    18:42:25.008 [Embedded com.acme.rest.FakeServer-1] DEBUG io.netty.util.NetUtil - -Djava.net.preferIPv4Stack: false
    18:42:25.009 [Embedded com.acme.rest.FakeServer-1] DEBUG io.netty.util.NetUtil - -Djava.net.preferIPv6Addresses: false
    18:42:25.010 [Embedded com.acme.rest.FakeServer-1] DEBUG io.netty.util.NetUtil - Loopback interface: lo (lo, 0:0:0:0:0:0:0:1%lo)
    18:42:25.011 [Embedded com.acme.rest.FakeServer-1] DEBUG io.netty.util.NetUtil - /proc/sys/net/core/somaxconn: 128
    18:42:25.011 [Embedded com.acme.rest.FakeServer-1] DEBUG io.netty.channel.DefaultChannelId - -Dio.netty.machineId: f0:d5:bf:ff:fe:cd:87:2d (auto-detected)
    18:42:25.013 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.util.internal.ThreadLocalRandom - -Dio.netty.initialSeedUniquifier: 0xc8c67423c4a85d8f
    18:42:25.022 [Embedded com.acme.rest.FakeServer-1] DEBUG io.netty.util.ResourceLeakDetector - -Dio.netty.leakDetection.level: simple
    18:42:25.023 [Embedded com.acme.rest.FakeServer-1] DEBUG io.netty.util.ResourceLeakDetector - -Dio.netty.leakDetection.maxRecords: 4
    18:42:25.033 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.buffer.PooledByteBufAllocator - -Dio.netty.allocator.numHeapArenas: 16
    18:42:25.033 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.buffer.PooledByteBufAllocator - -Dio.netty.allocator.numDirectArenas: 16
    18:42:25.033 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.buffer.PooledByteBufAllocator - -Dio.netty.allocator.pageSize: 8192
    18:42:25.033 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.buffer.PooledByteBufAllocator - -Dio.netty.allocator.maxOrder: 4
    18:42:25.033 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.buffer.PooledByteBufAllocator - -Dio.netty.allocator.chunkSize: 131072
    18:42:25.033 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.buffer.PooledByteBufAllocator - -Dio.netty.allocator.tinyCacheSize: 512
    18:42:25.033 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.buffer.PooledByteBufAllocator - -Dio.netty.allocator.smallCacheSize: 256
    18:42:25.033 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.buffer.PooledByteBufAllocator - -Dio.netty.allocator.normalCacheSize: 64
    18:42:25.033 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.buffer.PooledByteBufAllocator - -Dio.netty.allocator.maxCachedBufferCapacity: 32768
    18:42:25.033 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.buffer.PooledByteBufAllocator - -Dio.netty.allocator.cacheTrimInterval: 8192
    18:42:25.033 [Embedded com.acme.rest.FakeServer-1] DEBUG i.n.buffer.PooledByteBufAllocator - -Dio.netty.allocator.useCacheForAllThreads: true
    18:42:25.039 [Embedded com.acme.rest.FakeServer-1] DEBUG io.netty.buffer.ByteBufUtil - -Dio.netty.allocator.type: pooled
    18:42:25.039 [Embedded com.acme.rest.FakeServer-1] DEBUG io.netty.buffer.ByteBufUtil - -Dio.netty.threadLocalDirectBufferSize: 65536
    18:42:25.040 [Embedded com.acme.rest.FakeServer-1] DEBUG io.netty.buffer.ByteBufUtil - -Dio.netty.maxThreadLocalCharBufferSize: 16384
    18:42:25.041 [Embedded com.acme.rest.FakeServer-1] WARN  io.netty.bootstrap.ServerBootstrap - Unknown channel option 'SO_LINGER' for channel '[id: 0xb7769ac4]'
    18:42:25.282 [Embedded com.acme.rest.FakeServer-1] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: shutdown.time = 1.minutes
    18:42:25.283 [Embedded com.acme.rest.FakeServer-1] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: log.level = WARNING
    18:42:25.283 [Embedded com.acme.rest.FakeServer-1] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: local.doc.root = 
    18:42:25.283 [Embedded com.acme.rest.FakeServer-1] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: https.port = 
    18:42:25.283 [Embedded com.acme.rest.FakeServer-1] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: mustache.templates.dir = templates
    18:42:25.284 [Embedded com.acme.rest.FakeServer-1] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: log.async = true
    18:42:25.284 [Embedded com.acme.rest.FakeServer-1] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: cert.path = 
    18:42:25.284 [Embedded com.acme.rest.FakeServer-1] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: http.name = http
    18:42:25.284 [Embedded com.acme.rest.FakeServer-1] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: maxRequestSize = 5242880.bytes
    18:42:25.284 [Embedded com.acme.rest.FakeServer-1] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: log.rollPolicy = Never
    18:42:25.285 [Embedded com.acme.rest.FakeServer-1] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: help = false
    18:42:25.285 [Embedded com.acme.rest.FakeServer-1] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: log.output = /dev/stderr
    18:42:25.285 [Embedded com.acme.rest.FakeServer-1] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: http.port = 127.0.0.1:0
    18:42:25.285 [Embedded com.acme.rest.FakeServer-1] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: log.async.maxsize = 4096
    18:42:25.286 [Embedded com.acme.rest.FakeServer-1] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: https.name = https
    18:42:25.286 [Embedded com.acme.rest.FakeServer-1] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: http.response.charset.enabled = true
    18:42:25.286 [Embedded com.acme.rest.FakeServer-1] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: log.rotateCount = -1
    18:42:25.286 [Embedded com.acme.rest.FakeServer-1] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: doc.root = 
    18:42:25.286 [Embedded com.acme.rest.FakeServer-1] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: log.async.inferClassNames = false
    18:42:25.287 [Embedded com.acme.rest.FakeServer-1] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: key.path = 
    18:42:25.287 [Embedded com.acme.rest.FakeServer-1] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: log.append = true
    18:42:25.287 [Embedded com.acme.rest.FakeServer-1] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: admin.port = localhost/127.0.0.1:0
    18:42:25.366 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - Resolving Finagle clients before warmup
    18:42:25.372 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - Done resolving clients: [].
    18:42:25.374 [Embedded com.acme.rest.FakeServer-1] INFO  c.t.s.internal.FinagleBuildRevision$ - Resolved Finagle build revision: (rev=f48520b6809792d8cb87c5d81a13075fd01c051d)
    Waiting for warmup phases to complete...
    18:42:25.513 [Embedded com.acme.rest.FakeServer-1] DEBUG c.t.f.h.modules.MessageBodyModule$ - Configuring MessageBodyManager
    18:42:25.524 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - Warming up.
    18:42:25.621 [Embedded com.acme.rest.FakeServer-1] INFO  c.t.finatra.http.routing.HttpRouter - Adding routes
    GET     /ping
    18:42:25.624 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer -  => com.twitter.server.handler.AdminRedirectHandler
    18:42:25.624 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin => com.twitter.server.handler.SummaryHandler
    18:42:25.624 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/server_info => com.twitter.finagle.Filter$$anon$1
    18:42:25.624 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/contention => com.twitter.finagle.Filter$$anon$1
    18:42:25.624 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/lint => com.twitter.server.handler.LintHandler
    18:42:25.625 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/lint.json => com.twitter.server.handler.LintHandler
    18:42:25.625 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/failedlint => com.twitter.server.handler.FailedLintRuleHandler
    18:42:25.625 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/threads => com.twitter.server.handler.ThreadsHandler
    18:42:25.625 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/threads.json => com.twitter.server.handler.ThreadsHandler
    18:42:25.625 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/announcer => com.twitter.finagle.Filter$$anon$1
    18:42:25.625 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/dtab => com.twitter.finagle.Filter$$anon$1
    18:42:25.625 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/pprof/heap => com.twitter.server.handler.HeapResourceHandler
    18:42:25.625 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/pprof/profile => com.twitter.server.handler.ProfileResourceHandler
    18:42:25.625 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/pprof/contention => com.twitter.server.handler.ProfileResourceHandler
    18:42:25.625 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/ping => com.twitter.server.handler.ReplyHandler
    18:42:25.625 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/shutdown => com.twitter.server.handler.ShutdownHandler
    18:42:25.626 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/tracing => com.twitter.server.handler.TracingHandler
    18:42:25.626 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/events => com.twitter.server.handler.EventsHandler
    18:42:25.626 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/events/record/ => com.twitter.server.handler.EventRecordingHandler
    18:42:25.626 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/logging => com.twitter.server.handler.LoggingHandler
    18:42:25.626 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/metrics => com.twitter.server.handler.MetricQueryHandler
    18:42:25.626 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/clients/ => com.twitter.server.handler.ClientRegistryHandler
    18:42:25.626 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/servers/ => com.twitter.server.handler.ServerRegistryHandler
    18:42:25.626 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/files/ => com.twitter.server.handler.ResourceHandler
    18:42:25.626 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/registry.json => com.twitter.server.handler.RegistryHandler
    18:42:25.626 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/toggles => com.twitter.server.handler.ToggleHandler
    18:42:25.626 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/toggles/ => com.twitter.server.handler.ToggleHandler
    18:42:25.627 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /favicon.ico => com.twitter.server.handler.ResourceHandler
    18:42:25.627 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/histograms => com.twitter.server.handler.HistogramQueryHandler
    18:42:25.627 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - /admin/histograms.json => com.twitter.server.handler.HistogramQueryHandler
    18:42:25.704 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - http server started on port: 45269
    18:42:25.705 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - Enabling health endpoint on port 36727
    18:42:25.706 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - com.acme.rest.FakeServer started.
    18:42:25.706 [Embedded com.acme.rest.FakeServer-1] INFO  com.acme.rest.FakeServer - Startup complete, server ready.
    Waiting for warmup phases to complete...
    
    
    ===========================================================================
    Server Started: com.acme.rest.FakeServer
    ===========================================================================
    AdminHttp      -> http://127.0.0.1:36727/admin
    ExternalHttp   -> http://127.0.0.1:45269
    
    
    ===========================================================================
    HTTP GET /ping
    [Header]	Host -> 127.0.0.1:45269
    ===========================================================================
    ---------------------------------------------------------------------------
    [Status]	Status(200)
    [Header]	Content-Length -> 5
    pong
    
    
    [32m-  /ping will return pong [0m
    
    
    ===========================================================================
    com.acme.rest.FakeServer Stats
    ===========================================================================
    http/handletime_us                                                     = 4593.0 = [4593.0]
    http/request_latency_ms                                                = 7.0 = [7.0]
    http/request_payload_bytes                                             = 0.0 = [0.0]
    http/response_payload_bytes                                            = 5.0 = [5.0]
    http/transit_latency_ms                                                = 40.0 = [40.0]
    
    Counters:
    http/connects                                                          = 1
    http/received_bytes                                                    = 172
    http/requests                                                          = 1
    http/sent_bytes                                                        = 43
    http/success                                                           = 1
    
    Gauges:
    finagle/build/revision                                                 = 1.05020555E12
    http/connections                                                       = 1.0
    http/pending                                                           = 0.0
    
    
    ===========================================================================
    Closing EmbeddedHttpServer: com.acme.rest.FakeServer
    ===========================================================================
    [36mRun completed in 3 seconds, 941 milliseconds.[0m
    [36mTotal number of tests run: 1[0m
    [36mSuites: completed 2, aborted 0[0m
    [36mTests: succeeded 1, failed 0, canceled 0, ignored 0, pending 0[0m
    [32mAll tests passed.[0m
    [INFO] 
    [INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ myfirstmicroservice-server ---
    [INFO] Building jar: /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/myfirstmicroservice-server-0.1.0-SNAPSHOT.jar
    [INFO] 
    [INFO] --- maven-dependency-plugin:2.9:unpack (default) @ myfirstmicroservice-server ---
    [INFO] Configured Artifact: tanukisoft:wrapper-delta-pack:?:tar.gz
    [INFO] Unpacking /home/developer/.m2/repository/tanukisoft/wrapper-delta-pack/3.5.25/wrapper-delta-pack-3.5.25.tar.gz to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target with includes "" and excludes ""
    [INFO] Expanding: /home/developer/.m2/repository/tanukisoft/wrapper-delta-pack/3.5.25/wrapper-delta-pack-3.5.25.tar.gz into /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target
    [INFO] 
    [INFO] --- maven-dependency-plugin:2.9:copy-dependencies (default) @ myfirstmicroservice-server ---
    [INFO] Copying util-0.0.121.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/util-0.0.121.jar
    [INFO] Copying args-core-0.1.37.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/args-core-0.1.37.jar
    [INFO] Copying util-hashing_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/util-hashing_2.11-6.41.0.jar
    [INFO] Copying netty-common-4.1.8.Final.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/netty-common-4.1.8.Final.jar
    [INFO] Copying finatra-utils_2.11-2.8.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/finatra-utils_2.11-2.8.0.jar
    [INFO] Copying aopalliance-1.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/aopalliance-1.0.jar
    [INFO] Copying twitter-server_2.11-1.27.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/twitter-server_2.11-1.27.0.jar
    [INFO] Copying guice-4.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/guice-4.0.jar
    [INFO] Copying util-lint_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/util-lint_2.11-6.41.0.jar
    [INFO] Copying paranamer-2.8.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/paranamer-2.8.jar
    [INFO] Copying finatra-slf4j_2.11-2.8.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/finatra-slf4j_2.11-2.8.0.jar
    [INFO] Copying inject-app_2.11-2.8.0-tests.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/inject-app_2.11-2.8.0-tests.jar
    [INFO] Copying util-executor-service-shutdown-0.0.67.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/util-executor-service-shutdown-0.0.67.jar
    [INFO] Copying scala-logging-api_2.11-2.1.2.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/scala-logging-api_2.11-2.1.2.jar
    [INFO] Copying util-system-mocks-0.0.104.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/util-system-mocks-0.0.104.jar
    [INFO] Copying gson-2.3.1.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/gson-2.3.1.jar
    [INFO] Copying finagle-base-http_2.11-6.42.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/finagle-base-http_2.11-6.42.0.jar
    [INFO] Copying stats-registry-0.0.1.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/stats-registry-0.0.1.jar
    [INFO] Copying commons-io-2.4.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/commons-io-2.4.jar
    [INFO] Copying netty-handler-4.1.8.Final.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/netty-handler-4.1.8.Final.jar
    [INFO] Copying wrapper-delta-pack-3.5.25.tar.gz to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/wrapper-delta-pack-3.5.25.tar.gz
    [INFO] Copying scala-reflect-2.11.8.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/scala-reflect-2.11.8.jar
    [INFO] Copying finatra-jackson_2.11-2.8.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/finatra-jackson_2.11-2.8.0.jar
    [INFO] Copying inject-app_2.11-2.8.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/inject-app_2.11-2.8.0.jar
    [INFO] Copying scalatest_2.11-3.0.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/scalatest_2.11-3.0.0.jar
    [INFO] Copying finagle-zipkin-core_2.11-6.42.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/finagle-zipkin-core_2.11-6.42.0.jar
    [INFO] Copying finagle-stats_2.11-6.42.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/finagle-stats_2.11-6.42.0.jar
    [INFO] Copying inject-thrift_2.11-2.8.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/inject-thrift_2.11-2.8.0.jar
    [INFO] Copying finagle-core_2.11-6.42.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/finagle-core_2.11-6.42.0.jar
    [INFO] Copying commons-fileupload-1.3.1.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/commons-fileupload-1.3.1.jar
    [INFO] Copying jackson-core-2.8.4.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/jackson-core-2.8.4.jar
    [INFO] Copying slf4j-api-1.7.9.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/slf4j-api-1.7.9.jar
    [INFO] Copying zookeeper-3.5.0-alpha.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/zookeeper-3.5.0-alpha.jar
    [INFO] Copying bijection-core_2.11-0.9.4.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/bijection-core_2.11-0.9.4.jar
    [INFO] Copying caffeine-2.3.4.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/caffeine-2.3.4.jar
    [INFO] Copying logback-classic-1.1.2.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/logback-classic-1.1.2.jar
    [INFO] Copying jcl-over-slf4j-1.7.21.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/jcl-over-slf4j-1.7.21.jar
    [INFO] Copying finagle-netty4-http_2.11-6.42.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/finagle-netty4-http_2.11-6.42.0.jar
    [INFO] Copying util-events_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/util-events_2.11-6.41.0.jar
    [INFO] Copying bijection-util_2.11-0.9.4.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/bijection-util_2.11-0.9.4.jar
    [INFO] Copying guice-multibindings-4.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/guice-multibindings-4.0.jar
    [INFO] Copying util-logging_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/util-logging_2.11-6.41.0.jar
    [INFO] Copying scala-guice_2.11-4.1.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/scala-guice_2.11-4.1.0.jar
    [INFO] Copying finagle-toggle_2.11-6.42.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/finagle-toggle_2.11-6.42.0.jar
    [INFO] Copying jackson-module-scala_2.11-2.8.4.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/jackson-module-scala_2.11-2.8.4.jar
    [INFO] Copying log4j-1.2.15.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/log4j-1.2.15.jar
    [INFO] Copying io-json-0.0.54.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/io-json-0.0.54.jar
    [INFO] Copying util-zk-common_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/util-zk-common_2.11-6.41.0.jar
    [INFO] Copying finatra-thrift_2.11-2.8.0-tests.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/finatra-thrift_2.11-2.8.0-tests.jar
    [INFO] Copying commons-lang-2.6.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/commons-lang-2.6.jar
    [INFO] Copying activation-1.1.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/activation-1.1.jar
    [INFO] Copying quantity-0.0.99.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/quantity-0.0.99.jar
    [INFO] Copying snakeyaml-1.12.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/snakeyaml-1.12.jar
    [INFO] Copying grizzled-slf4j_2.11-1.3.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/grizzled-slf4j_2.11-1.3.0.jar
    [INFO] Copying net-util-0.0.102.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/net-util-0.0.102.jar
    [INFO] Copying io-0.0.68.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/io-0.0.68.jar
    [INFO] Copying util-function_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/util-function_2.11-6.41.0.jar
    [INFO] Copying gm-fabric-core-0.2.8.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/gm-fabric-core-0.2.8.jar
    [INFO] Copying javax.inject-1.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/javax.inject-1.jar
    [INFO] Copying collections-0.0.110.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/collections-0.0.110.jar
    [INFO] Copying finagle-thrift_2.11-6.42.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/finagle-thrift_2.11-6.42.0.jar
    [INFO] Copying service-thrift-1.0.55.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/service-thrift-1.0.55.jar
    [INFO] Copying jackson-databind-2.8.4.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/jackson-databind-2.8.4.jar
    [INFO] Copying stat-0.0.74.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/stat-0.0.74.jar
    [INFO] Copying finatra-thrift_2.11-2.8.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/finatra-thrift_2.11-2.8.0.jar
    [INFO] Copying finagle-exp_2.11-6.42.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/finagle-exp_2.11-6.42.0.jar
    [INFO] Copying inject-core_2.11-2.8.0-tests.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/inject-core_2.11-2.8.0-tests.jar
    [INFO] Copying stats-0.0.115.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/stats-0.0.115.jar
    [INFO] Copying util-security_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/util-security_2.11-6.41.0.jar
    [INFO] Copying base-0.0.115.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/base-0.0.115.jar
    [INFO] Copying netty-codec-socks-4.1.8.Final.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/netty-codec-socks-4.1.8.Final.jar
    [INFO] Copying servlet-api-2.5.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/servlet-api-2.5.jar
    [INFO] Copying netty-resolver-4.1.8.Final.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/netty-resolver-4.1.8.Final.jar
    [INFO] Copying netty-handler-proxy-4.1.8.Final.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/netty-handler-proxy-4.1.8.Final.jar
    [INFO] Copying util-jvm_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/util-jvm_2.11-6.41.0.jar
    [INFO] Copying scala-compiler-2.11.8.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/scala-compiler-2.11.8.jar
    [INFO] Copying metrics-0.0.38.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/metrics-0.0.38.jar
    [INFO] Copying hamcrest-core-1.1.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/hamcrest-core-1.1.jar
    [INFO] Copying myfirstmicroservice-client-0.1.0-SNAPSHOT.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/myfirstmicroservice-client-0.1.0-SNAPSHOT.jar
    [INFO] Copying jackson-annotations-2.8.4.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/jackson-annotations-2.8.4.jar
    [INFO] Copying jsr305-2.0.1.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/jsr305-2.0.1.jar
    [INFO] Copying javacc-5.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/javacc-5.0.jar
    [INFO] Copying finatra-http_2.11-2.8.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/finatra-http_2.11-2.8.0.jar
    [INFO] Copying finagle-netty4_2.11-6.42.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/finagle-netty4_2.11-6.42.0.jar
    [INFO] Copying compiler-0.8.18.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/compiler-0.8.18.jar
    [INFO] Copying scala-library-2.11.8.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/scala-library-2.11.8.jar
    [INFO] Copying netty-buffer-4.1.8.Final.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/netty-buffer-4.1.8.Final.jar
    [INFO] Copying inject-core_2.11-2.8.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/inject-core_2.11-2.8.0.jar
    [INFO] Copying netty-codec-http-4.1.8.Final.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/netty-codec-http-4.1.8.Final.jar
    [INFO] Copying mail-1.4.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/mail-1.4.jar
    [INFO] Copying scrooge-core_2.11-4.14.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/scrooge-core_2.11-4.14.0.jar
    [INFO] Copying jackson-datatype-joda-2.8.4.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/jackson-datatype-joda-2.8.4.jar
    [INFO] Copying application-action-0.0.90.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/application-action-0.0.90.jar
    [INFO] Copying scala-xml_2.11-1.0.4.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/scala-xml_2.11-1.0.4.jar
    [INFO] Copying netty-3.10.1.Final.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/netty-3.10.1.Final.jar
    [INFO] Copying util-sampler-0.0.78.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/util-sampler-0.0.78.jar
    [INFO] Copying scalactic_2.11-3.0.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/scalactic_2.11-3.0.0.jar
    [INFO] Copying finagle-thriftmux_2.11-6.42.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/finagle-thriftmux_2.11-6.42.0.jar
    [INFO] Copying httpcore-4.3.2.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/httpcore-4.3.2.jar
    [INFO] Copying logback-core-1.1.2.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/logback-core-1.1.2.jar
    [INFO] Copying inject-modules_2.11-2.8.0-tests.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/inject-modules_2.11-2.8.0-tests.jar
    [INFO] Copying util-stats_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/util-stats_2.11-6.41.0.jar
    [INFO] Copying stats-provider-0.0.93.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/stats-provider-0.0.93.jar
    [INFO] Copying args-0.2.41.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/args-0.2.41.jar
    [INFO] Copying jul-to-slf4j-1.7.9.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/jul-to-slf4j-1.7.9.jar
    [INFO] Copying util-core_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/util-core_2.11-6.41.0.jar
    [INFO] Copying libthrift-0.5.0-7.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/libthrift-0.5.0-7.jar
    [INFO] Copying guava-16.0.1.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/guava-16.0.1.jar
    [INFO] Copying dynamic-host-set-0.0.56.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/dynamic-host-set-0.0.56.jar
    [INFO] Copying finatra-http_2.11-2.8.0-tests.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/finatra-http_2.11-2.8.0-tests.jar
    [INFO] Copying commons-codec-1.6.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/commons-codec-1.6.jar
    [INFO] Copying guice-assistedinject-4.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/guice-assistedinject-4.0.jar
    [INFO] Copying inject-slf4j_2.11-2.8.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/inject-slf4j_2.11-2.8.0.jar
    [INFO] Copying scalap-2.11.8.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/scalap-2.11.8.jar
    [INFO] Copying log4j-over-slf4j-1.7.21.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/log4j-over-slf4j-1.7.21.jar
    [INFO] Copying myfirstmicroservice-business-0.1.0-SNAPSHOT.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/myfirstmicroservice-business-0.1.0-SNAPSHOT.jar
    [INFO] Copying inject-utils_2.11-2.8.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/inject-utils_2.11-2.8.0.jar
    [INFO] Copying util-collection_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/util-collection_2.11-6.41.0.jar
    [INFO] Copying objenesis-1.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/objenesis-1.0.jar
    [INFO] Copying inject-modules_2.11-2.8.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/inject-modules_2.11-2.8.0.jar
    [INFO] Copying gm-fabric-jvm-config-0.2.8.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/gm-fabric-jvm-config-0.2.8.jar
    [INFO] Copying inject-server_2.11-2.8.0-tests.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/inject-server_2.11-2.8.0-tests.jar
    [INFO] Copying netty-codec-4.1.8.Final.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/netty-codec-4.1.8.Final.jar
    [INFO] Copying mockito-core-1.9.5.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/mockito-core-1.9.5.jar
    [INFO] Copying jackson-module-paranamer-2.8.4.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/jackson-module-paranamer-2.8.4.jar
    [INFO] Copying finatra-scalap-compiler-deps_2.11-2.0.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/finatra-scalap-compiler-deps_2.11-2.0.0.jar
    [INFO] Copying joda-time-2.5.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/joda-time-2.5.jar
    [INFO] Copying myfirstmicroservice-model-0.1.0-SNAPSHOT.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/myfirstmicroservice-model-0.1.0-SNAPSHOT.jar
    [INFO] Copying scala-parser-combinators_2.11-1.0.4.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/scala-parser-combinators_2.11-1.0.4.jar
    [INFO] Copying finagle-mux_2.11-6.42.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/finagle-mux_2.11-6.42.0.jar
    [INFO] Copying util-cache_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/util-cache_2.11-6.41.0.jar
    [INFO] Copying stats-util-0.0.59.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/stats-util-0.0.59.jar
    [INFO] Copying commons-cli-1.2.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/commons-cli-1.2.jar
    [INFO] Copying netty-transport-4.1.8.Final.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/netty-transport-4.1.8.Final.jar
    [INFO] Copying util-zk_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/util-zk_2.11-6.41.0.jar
    [INFO] Copying server-set-1.0.111.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/server-set-1.0.111.jar
    [INFO] Copying joda-convert-1.2.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/joda-convert-1.2.jar
    [INFO] Copying guice-testlib-4.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/guice-testlib-4.0.jar
    [INFO] Copying myfirstmicroservice-config-0.1.0-SNAPSHOT.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/myfirstmicroservice-config-0.1.0-SNAPSHOT.jar
    [INFO] Copying io-thrift-0.0.67.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/io-thrift-0.0.67.jar
    [INFO] Copying util-app_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/util-app_2.11-6.41.0.jar
    [INFO] Copying finagle-serversets_2.11-6.42.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/finagle-serversets_2.11-6.42.0.jar
    [INFO] Copying util-codec_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/util-codec_2.11-6.41.0.jar
    [INFO] Copying junit-4.12.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/junit-4.12.jar
    [INFO] Copying finagle-http_2.11-6.42.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/finagle-http_2.11-6.42.0.jar
    [INFO] Copying inject-server_2.11-2.8.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/inject-server_2.11-2.8.0.jar
    [INFO] Copying commons-logging-1.1.3.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/commons-logging-1.1.3.jar
    [INFO] Copying client-0.0.80.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/client-0.0.80.jar
    [INFO] Copying group-0.0.91.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/group-0.0.91.jar
    [INFO] Copying jdk-logging-0.0.82.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/jdk-logging-0.0.82.jar
    [INFO] Copying nscala-time_2.11-1.6.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/nscala-time_2.11-1.6.0.jar
    [INFO] Copying scala-logging-slf4j_2.11-2.1.2.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/scala-logging-slf4j_2.11-2.1.2.jar
    [INFO] Copying httpclient-4.3.5.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/httpclient-4.3.5.jar
    [INFO] Copying util-registry_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/lib/util-registry_2.11-6.41.0.jar
    [INFO] 
    [INFO] --- appassembler-maven-plugin:1.10:generate-daemons (generate-jsw-scripts) @ myfirstmicroservice-server ---
    [INFO] Installing artifact /home/developer/.m2/repository/com/deciphernow/gm-fabric-core/0.2.8/gm-fabric-core-0.2.8.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/gm-fabric-core-0.2.8.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/util-logging_2.11/6.41.0/util-logging_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/util-logging_2.11-6.41.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/finatra-thrift_2.11/2.8.0/finatra-thrift_2.11-2.8.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/finatra-thrift_2.11-2.8.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/typesafe/scala-logging/scala-logging-api_2.11/2.1.2/scala-logging-api_2.11-2.1.2.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/scala-logging-api_2.11-2.1.2.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/typesafe/scala-logging/scala-logging-slf4j_2.11/2.1.2/scala-logging-slf4j_2.11-2.1.2.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/scala-logging-slf4j_2.11-2.1.2.jar
    [INFO] Installing artifact /home/developer/.m2/repository/org/slf4j/jul-to-slf4j/1.7.9/jul-to-slf4j-1.7.9.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/jul-to-slf4j-1.7.9.jar
    [INFO] Installing artifact /home/developer/.m2/repository/org/apache/httpcomponents/httpclient/4.3.5/httpclient-4.3.5.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/httpclient-4.3.5.jar
    [INFO] Installing artifact /home/developer/.m2/repository/commons-logging/commons-logging/1.1.3/commons-logging-1.1.3.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/commons-logging-1.1.3.jar
    [INFO] Installing artifact /home/developer/.m2/repository/commons-codec/commons-codec/1.6/commons-codec-1.6.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/commons-codec-1.6.jar
    [INFO] Installing artifact /home/developer/.m2/repository/org/apache/httpcomponents/httpcore/4.3.2/httpcore-4.3.2.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/httpcore-4.3.2.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/deciphernow/gm-fabric-jvm-config/0.2.8/gm-fabric-jvm-config-0.2.8.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/gm-fabric-jvm-config-0.2.8.jar
    [INFO] Installing artifact /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/model/target/myfirstmicroservice-model-0.1.0-SNAPSHOT.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/myfirstmicroservice-model-0.1.0-SNAPSHOT.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/scrooge-core_2.11/4.14.0/scrooge-core_2.11-4.14.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/scrooge-core_2.11-4.14.0.jar
    [INFO] Installing artifact /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/business/target/myfirstmicroservice-business-0.1.0-SNAPSHOT.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/myfirstmicroservice-business-0.1.0-SNAPSHOT.jar
    [INFO] Installing artifact /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/client/target/myfirstmicroservice-client-0.1.0-SNAPSHOT.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/myfirstmicroservice-client-0.1.0-SNAPSHOT.jar
    [INFO] Installing artifact /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/config/target/myfirstmicroservice-config-0.1.0-SNAPSHOT.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/myfirstmicroservice-config-0.1.0-SNAPSHOT.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/finagle-core_2.11/6.42.0/finagle-core_2.11-6.42.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/finagle-core_2.11-6.42.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/finagle-toggle_2.11/6.42.0/finagle-toggle_2.11-6.42.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/finagle-toggle_2.11-6.42.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/util-app_2.11/6.41.0/util-app_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/util-app_2.11-6.41.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/util-cache_2.11/6.41.0/util-cache_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/util-cache_2.11-6.41.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/util-codec_2.11/6.41.0/util-codec_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/util-codec_2.11-6.41.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/util-hashing_2.11/6.41.0/util-hashing_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/util-hashing_2.11-6.41.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/util-jvm_2.11/6.41.0/util-jvm_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/util-jvm_2.11-6.41.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/util-lint_2.11/6.41.0/util-lint_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/util-lint_2.11-6.41.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/util-registry_2.11/6.41.0/util-registry_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/util-registry_2.11-6.41.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/util-security_2.11/6.41.0/util-security_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/util-security_2.11-6.41.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/util-stats_2.11/6.41.0/util-stats_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/util-stats_2.11-6.41.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/github/ben-manes/caffeine/caffeine/2.3.4/caffeine-2.3.4.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/caffeine-2.3.4.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/google/code/findbugs/jsr305/2.0.1/jsr305-2.0.1.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/jsr305-2.0.1.jar
    [INFO] Installing artifact /home/developer/.m2/repository/io/netty/netty/3.10.1.Final/netty-3.10.1.Final.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/netty-3.10.1.Final.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/finagle-stats_2.11/6.42.0/finagle-stats_2.11-6.42.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/finagle-stats_2.11-6.42.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/finagle-http_2.11/6.42.0/finagle-http_2.11-6.42.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/finagle-http_2.11-6.42.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/finagle-base-http_2.11/6.42.0/finagle-base-http_2.11-6.42.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/finagle-base-http_2.11-6.42.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/finagle-netty4-http_2.11/6.42.0/finagle-netty4-http_2.11-6.42.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/finagle-netty4-http_2.11-6.42.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/util-collection_2.11/6.41.0/util-collection_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/util-collection_2.11-6.41.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/commons-lang/commons-lang/2.6/commons-lang-2.6.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/commons-lang-2.6.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/common/metrics/0.0.38/metrics-0.0.38.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/metrics-0.0.38.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/common/base/0.0.115/base-0.0.115.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/base-0.0.115.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/common/collections/0.0.110/collections-0.0.110.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/collections-0.0.110.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/common/quantity/0.0.99/quantity-0.0.99.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/quantity-0.0.99.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/common/stats-util/0.0.59/stats-util-0.0.59.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/stats-util-0.0.59.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/common/util-executor-service-shutdown/0.0.67/util-executor-service-shutdown-0.0.67.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/util-executor-service-shutdown-0.0.67.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/common/util-system-mocks/0.0.104/util-system-mocks-0.0.104.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/util-system-mocks-0.0.104.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/util-events_2.11/6.41.0/util-events_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/util-events_2.11-6.41.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.8.4/jackson-core-2.8.4.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/jackson-core-2.8.4.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.8.4/jackson-databind-2.8.4.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/jackson-databind-2.8.4.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/fasterxml/jackson/module/jackson-module-scala_2.11/2.8.4/jackson-module-scala_2.11-2.8.4.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/jackson-module-scala_2.11-2.8.4.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/fasterxml/jackson/module/jackson-module-paranamer/2.8.4/jackson-module-paranamer-2.8.4.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/jackson-module-paranamer-2.8.4.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/thoughtworks/paranamer/paranamer/2.8/paranamer-2.8.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/paranamer-2.8.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/google/guava/guava/16.0.1/guava-16.0.1.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/guava-16.0.1.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/util-core_2.11/6.41.0/util-core_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/util-core_2.11-6.41.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/util-function_2.11/6.41.0/util-function_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/util-function_2.11-6.41.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/org/scala-lang/scala-reflect/2.11.8/scala-reflect-2.11.8.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/scala-reflect-2.11.8.jar
    [INFO] Installing artifact /home/developer/.m2/repository/org/scala-lang/modules/scala-parser-combinators_2.11/1.0.4/scala-parser-combinators_2.11-1.0.4.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/scala-parser-combinators_2.11-1.0.4.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/finagle-thrift_2.11/6.42.0/finagle-thrift_2.11-6.42.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/finagle-thrift_2.11-6.42.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/finagle-netty4_2.11/6.42.0/finagle-netty4_2.11-6.42.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/finagle-netty4_2.11-6.42.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/io/netty/netty-codec-http/4.1.8.Final/netty-codec-http-4.1.8.Final.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/netty-codec-http-4.1.8.Final.jar
    [INFO] Installing artifact /home/developer/.m2/repository/io/netty/netty-codec/4.1.8.Final/netty-codec-4.1.8.Final.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/netty-codec-4.1.8.Final.jar
    [INFO] Installing artifact /home/developer/.m2/repository/io/netty/netty-handler/4.1.8.Final/netty-handler-4.1.8.Final.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/netty-handler-4.1.8.Final.jar
    [INFO] Installing artifact /home/developer/.m2/repository/io/netty/netty-buffer/4.1.8.Final/netty-buffer-4.1.8.Final.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/netty-buffer-4.1.8.Final.jar
    [INFO] Installing artifact /home/developer/.m2/repository/io/netty/netty-common/4.1.8.Final/netty-common-4.1.8.Final.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/netty-common-4.1.8.Final.jar
    [INFO] Installing artifact /home/developer/.m2/repository/io/netty/netty-transport/4.1.8.Final/netty-transport-4.1.8.Final.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/netty-transport-4.1.8.Final.jar
    [INFO] Installing artifact /home/developer/.m2/repository/io/netty/netty-resolver/4.1.8.Final/netty-resolver-4.1.8.Final.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/netty-resolver-4.1.8.Final.jar
    [INFO] Installing artifact /home/developer/.m2/repository/io/netty/netty-handler-proxy/4.1.8.Final/netty-handler-proxy-4.1.8.Final.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/netty-handler-proxy-4.1.8.Final.jar
    [INFO] Installing artifact /home/developer/.m2/repository/io/netty/netty-codec-socks/4.1.8.Final/netty-codec-socks-4.1.8.Final.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/netty-codec-socks-4.1.8.Final.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/libthrift/0.5.0-7/libthrift-0.5.0-7.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/libthrift-0.5.0-7.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/finagle-serversets_2.11/6.42.0/finagle-serversets_2.11-6.42.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/finagle-serversets_2.11-6.42.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/util-zk-common_2.11/6.41.0/util-zk-common_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/util-zk-common_2.11-6.41.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/util-zk_2.11/6.41.0/util-zk_2.11-6.41.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/util-zk_2.11-6.41.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/common/zookeeper/client/0.0.80/client-0.0.80.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/client-0.0.80.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/common/net-util/0.0.102/net-util-0.0.102.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/net-util-0.0.102.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/common/zookeeper/group/0.0.91/group-0.0.91.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/group-0.0.91.jar
    [INFO] Installing artifact /home/developer/.m2/repository/org/apache/zookeeper/zookeeper/3.5.0-alpha/zookeeper-3.5.0-alpha.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/zookeeper-3.5.0-alpha.jar
    [INFO] Installing artifact /home/developer/.m2/repository/commons-cli/commons-cli/1.2/commons-cli-1.2.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/commons-cli-1.2.jar
    [INFO] Installing artifact /home/developer/.m2/repository/log4j/log4j/1.2.15/log4j-1.2.15.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/log4j-1.2.15.jar
    [INFO] Installing artifact /home/developer/.m2/repository/javax/mail/mail/1.4/mail-1.4.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/mail-1.4.jar
    [INFO] Installing artifact /home/developer/.m2/repository/javax/activation/activation/1.1/activation-1.1.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/activation-1.1.jar
    [INFO] Installing artifact /home/developer/.m2/repository/net/java/dev/javacc/javacc/5.0/javacc-5.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/javacc-5.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/common/io-json/0.0.54/io-json-0.0.54.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/io-json-0.0.54.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/common/io/0.0.68/io-0.0.68.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/io-0.0.68.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/google/code/gson/gson/2.3.1/gson-2.3.1.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/gson-2.3.1.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/common/zookeeper/server-set/1.0.111/server-set-1.0.111.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/server-set-1.0.111.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/common/args/0.2.41/args-0.2.41.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/args-0.2.41.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/common/io-thrift/0.0.67/io-thrift-0.0.67.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/io-thrift-0.0.67.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/common/dynamic-host-set/0.0.56/dynamic-host-set-0.0.56.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/dynamic-host-set-0.0.56.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/common/util/0.0.121/util-0.0.121.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/util-0.0.121.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/common/jdk-logging/0.0.82/jdk-logging-0.0.82.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/jdk-logging-0.0.82.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/common/stats/0.0.115/stats-0.0.115.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/stats-0.0.115.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/common/stat/0.0.74/stat-0.0.74.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/stat-0.0.74.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/common/stats-registry/0.0.1/stats-registry-0.0.1.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/stats-registry-0.0.1.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/common/application-action/0.0.90/application-action-0.0.90.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/application-action-0.0.90.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/common/util-sampler/0.0.78/util-sampler-0.0.78.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/util-sampler-0.0.78.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/common/stats-provider/0.0.93/stats-provider-0.0.93.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/stats-provider-0.0.93.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/common/args-core/0.1.37/args-core-0.1.37.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/args-core-0.1.37.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/common/service-thrift/1.0.55/service-thrift-1.0.55.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/service-thrift-1.0.55.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/twitter-server_2.11/1.27.0/twitter-server_2.11-1.27.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/twitter-server_2.11-1.27.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/finagle-zipkin-core_2.11/6.42.0/finagle-zipkin-core_2.11-6.42.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/finagle-zipkin-core_2.11-6.42.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/finatra-http_2.11/2.8.0/finatra-http_2.11-2.8.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/finatra-http_2.11-2.8.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/finatra-jackson_2.11/2.8.0/finatra-jackson_2.11-2.8.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/finatra-jackson_2.11-2.8.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-joda/2.8.4/jackson-datatype-joda-2.8.4.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/jackson-datatype-joda-2.8.4.jar
    [INFO] Installing artifact /home/developer/.m2/repository/org/scala-lang/scalap/2.11.8/scalap-2.11.8.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/scalap-2.11.8.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/finatra/finatra-scalap-compiler-deps_2.11/2.0.0/finatra-scalap-compiler-deps_2.11-2.0.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/finatra-scalap-compiler-deps_2.11-2.0.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/finatra-slf4j_2.11/2.8.0/finatra-slf4j_2.11-2.8.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/finatra-slf4j_2.11-2.8.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/finatra-utils_2.11/2.8.0/finatra-utils_2.11-2.8.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/finatra-utils_2.11-2.8.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/github/spullara/mustache/java/compiler/0.8.18/compiler-0.8.18.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/compiler-0.8.18.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/bijection-util_2.11/0.9.4/bijection-util_2.11-0.9.4.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/bijection-util_2.11-0.9.4.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/bijection-core_2.11/0.9.4/bijection-core_2.11-0.9.4.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/bijection-core_2.11-0.9.4.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/finagle-exp_2.11/6.42.0/finagle-exp_2.11-6.42.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/finagle-exp_2.11-6.42.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/commons-fileupload/commons-fileupload/1.3.1/commons-fileupload-1.3.1.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/commons-fileupload-1.3.1.jar
    [INFO] Installing artifact /home/developer/.m2/repository/javax/servlet/servlet-api/2.5/servlet-api-2.5.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/servlet-api-2.5.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/inject-core_2.11/2.8.0/inject-core_2.11-2.8.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/inject-core_2.11-2.8.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.8.4/jackson-annotations-2.8.4.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/jackson-annotations-2.8.4.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/google/inject/guice/4.0/guice-4.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/guice-4.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/aopalliance/aopalliance/1.0/aopalliance-1.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/aopalliance-1.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/google/inject/extensions/guice-assistedinject/4.0/guice-assistedinject-4.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/guice-assistedinject-4.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/google/inject/extensions/guice-multibindings/4.0/guice-multibindings-4.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/guice-multibindings-4.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/commons-io/commons-io/2.4/commons-io-2.4.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/commons-io-2.4.jar
    [INFO] Installing artifact /home/developer/.m2/repository/javax/inject/javax.inject/1/javax.inject-1.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/javax.inject-1.jar
    [INFO] Installing artifact /home/developer/.m2/repository/joda-time/joda-time/2.5/joda-time-2.5.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/joda-time-2.5.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/github/nscala-time/nscala-time_2.11/1.6.0/nscala-time_2.11-1.6.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/nscala-time_2.11-1.6.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/net/codingwell/scala-guice_2.11/4.1.0/scala-guice_2.11-4.1.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/scala-guice_2.11-4.1.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/org/clapper/grizzled-slf4j_2.11/1.3.0/grizzled-slf4j_2.11-1.3.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/grizzled-slf4j_2.11-1.3.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/org/joda/joda-convert/1.2/joda-convert-1.2.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/joda-convert-1.2.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/inject-modules_2.11/2.8.0/inject-modules_2.11-2.8.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/inject-modules_2.11-2.8.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/inject-app_2.11/2.8.0/inject-app_2.11-2.8.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/inject-app_2.11-2.8.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/inject-server_2.11/2.8.0/inject-server_2.11-2.8.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/inject-server_2.11-2.8.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/inject-slf4j_2.11/2.8.0/inject-slf4j_2.11-2.8.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/inject-slf4j_2.11-2.8.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/org/slf4j/jcl-over-slf4j/1.7.21/jcl-over-slf4j-1.7.21.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/jcl-over-slf4j-1.7.21.jar
    [INFO] Installing artifact /home/developer/.m2/repository/org/slf4j/log4j-over-slf4j/1.7.21/log4j-over-slf4j-1.7.21.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/log4j-over-slf4j-1.7.21.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/inject-utils_2.11/2.8.0/inject-utils_2.11-2.8.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/inject-utils_2.11-2.8.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/finagle-mux_2.11/6.42.0/finagle-mux_2.11-6.42.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/finagle-mux_2.11-6.42.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/org/slf4j/slf4j-api/1.7.9/slf4j-api-1.7.9.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/slf4j-api-1.7.9.jar
    [INFO] Installing artifact /home/developer/.m2/repository/ch/qos/logback/logback-core/1.1.2/logback-core-1.1.2.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/logback-core-1.1.2.jar
    [INFO] Installing artifact /home/developer/.m2/repository/ch/qos/logback/logback-classic/1.1.2/logback-classic-1.1.2.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/logback-classic-1.1.2.jar
    [INFO] Installing artifact /home/developer/.m2/repository/org/scala-lang/scala-library/2.11.8/scala-library-2.11.8.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/scala-library-2.11.8.jar
    [INFO] Installing artifact /home/developer/.m2/repository/org/scala-lang/scala-compiler/2.11.8/scala-compiler-2.11.8.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/scala-compiler-2.11.8.jar
    [INFO] Installing artifact /home/developer/.m2/repository/org/scala-lang/modules/scala-xml_2.11/1.0.4/scala-xml_2.11-1.0.4.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/scala-xml_2.11-1.0.4.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/inject-thrift_2.11/2.8.0/inject-thrift_2.11-2.8.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/inject-thrift_2.11-2.8.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/com/twitter/finagle-thriftmux_2.11/6.42.0/finagle-thriftmux_2.11-6.42.0.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/finagle-thriftmux_2.11-6.42.0.jar
    [INFO] Installing artifact /home/developer/.m2/repository/org/yaml/snakeyaml/1.12/snakeyaml-1.12.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/snakeyaml-1.12.jar
    [INFO] Installing artifact /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/myfirstmicroservice-server-0.1.0-SNAPSHOT.jar to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/appassembler/jsw/myfirstmicroservice-server/lib/myfirstmicroservice-server-0.1.0-SNAPSHOT.jar
    [INFO] 
    [INFO] --- maven-assembly-plugin:2.5.2:single (default) @ myfirstmicroservice-server ---
    [INFO] Reading assembly descriptor: /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/src/main/assembly/bundle-app.xml
    [INFO] Building tar: /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/myfirstmicroservice-server-0.1.0-SNAPSHOT-app.tgz
    [INFO] Copying files to /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/myfirstmicroservice-server-0.1.0-SNAPSHOT-app
    [WARNING] Assembly file: /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/myfirstmicroservice-server-0.1.0-SNAPSHOT-app is not a regular file (it may be a directory). It cannot be attached to the project build for installation or deployment.
    [INFO] 
    [INFO] >>> scala-maven-plugin:3.1.0:doc-jar (scala-attach-scaladocs) > generate-sources @ myfirstmicroservice-server >>>
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-pre-install) @ myfirstmicroservice-server ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] Copying 1 resource
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-post-install) @ myfirstmicroservice-server ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] Copying 1 resource
    [INFO] 
    [INFO] --- maven-resources-plugin:3.0.2:copy-resources (create-pre-remove) @ myfirstmicroservice-server ---
    [INFO] Using 'UTF-8' encoding to copy filtered resources.
    [INFO] Copying 1 resource
    [INFO] 
    [INFO] <<< scala-maven-plugin:3.1.0:doc-jar (scala-attach-scaladocs) < generate-sources @ myfirstmicroservice-server <<<
    [INFO] 
    [INFO] --- scala-maven-plugin:3.1.0:doc-jar (scala-attach-scaladocs) @ myfirstmicroservice-server ---
    model contains 8 documentable templates
    [INFO] Building jar: /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/myfirstmicroservice-server-0.1.0-SNAPSHOT-javadoc.jar
    [INFO] 
    [INFO] --- maven-install-plugin:2.4:install (default-install) @ myfirstmicroservice-server ---
    [INFO] Installing /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/myfirstmicroservice-server-0.1.0-SNAPSHOT.jar to /home/developer/.m2/repository/com/acme/myfirstmicroservice-server/0.1.0-SNAPSHOT/myfirstmicroservice-server-0.1.0-SNAPSHOT.jar
    [INFO] Installing /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/pom.xml to /home/developer/.m2/repository/com/acme/myfirstmicroservice-server/0.1.0-SNAPSHOT/myfirstmicroservice-server-0.1.0-SNAPSHOT.pom
    [INFO] Installing /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/myfirstmicroservice-server-0.1.0-SNAPSHOT-app.tgz to /home/developer/.m2/repository/com/acme/myfirstmicroservice-server/0.1.0-SNAPSHOT/myfirstmicroservice-server-0.1.0-SNAPSHOT-app.tgz
    [INFO] Installing /media/developer/dev/projects/workspaces/git-spacess/deciphernow/testing/023/myfirstmicroservice/server/target/myfirstmicroservice-server-0.1.0-SNAPSHOT-javadoc.jar to /home/developer/.m2/repository/com/acme/myfirstmicroservice-server/0.1.0-SNAPSHOT/myfirstmicroservice-server-0.1.0-SNAPSHOT-javadoc.jar
    [INFO] ------------------------------------------------------------------------
    [INFO] Reactor Summary:
    [INFO] 
    [INFO] myfirstmicroservice [Root] ......................... SUCCESS [  0.166 s]
    [INFO] myfirstmicroservice-config [Config] ................ SUCCESS [  4.427 s]
    [INFO] myfirstmicroservice-model [Model] .................. SUCCESS [  1.354 s]
    [INFO] myfirstmicroservice-client [Client] ................ SUCCESS [  4.994 s]
    [INFO] myfirstmicroservice-business [Business] ............ SUCCESS [  3.462 s]
    [INFO] myfirstmicroservice-server [Server] ................ SUCCESS [ 16.524 s]
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time: 31.137 s
    [INFO] Finished at: 2018-01-26T13:42:33-05:00
    [INFO] Final Memory: 55M/477M
    [INFO] ------------------------------------------------------------------------
    
    Script done on 2018-01-26 13:42:34-0500

## Attributes

### Default attributes

### Adding new attributes
    
## Executing MyFirstMicroservice
   
### Remove the USER
The framework creates the service with a default user. If this user does not exist the service will fail to start. To solve this edit the service script:

    $ vi server/target/myfirstmicroservice-server-0.1.0-SNAPSHOT-app/myfirstmicroservice-server-0.1.0-SNAPSHOT/bin/myfirstmicroservice-server
    
Either comment out RUN_AS or delete it. Now you can run your service with the following command.
     
    $ server/target/myfirstmicroservice-server-0.1.0-SNAPSHOT-app/myfirstmicroservice-server-0.1.0-SNAPSHOT/bin/myfirstmicroservice-server console
    
### Execution output
    
    Running myfirstmicroservice-server [Server]...
    wrapper  | --> Wrapper Started as Console
    wrapper  |   Copyright (C) 1999-2014 Tanuki Software, Ltd. All Rights Reserved.
    wrapper  |     http://wrapper.tanukisoftware.com
    wrapper  | 
    wrapper  | Launching a JVM...
    jvm 1    | WrapperManager: Initializing...
    jvm 1    | Jan 26, 2018 2:04:24 PM com.twitter.app.App$$anonfun$register$1 apply
    jvm 1    | WARNING: Multiple com.twitter.app.App main methods called. com.acme.MyFirstMicroservice, then com.deciphernow.server.thrift.GMFabricThriftServer
    jvm 1    | 14:04:24.196 [WrapperSimpleAppMain] INFO  c.d.s.thrift.GMFabricThriftServer - Process started
    jvm 1    | Jan 26, 2018 2:04:24 PM com.twitter.finagle.Init$$anonfun$4 apply$mcV$sp
    jvm 1    | INFO: Finagle version 6.42.0 (rev=f48520b6809792d8cb87c5d81a13075fd01c051d) built at 20170203-165908
    jvm 1    | Jan 26, 2018 2:04:25 PM com.twitter.finagle.Announcer$$anonfun$announcers$1 apply
    jvm 1    | INFO: Announcer[zk] = com.twitter.finagle.zookeeper.ZkAnnouncer(com.twitter.finagle.zookeeper.ZkAnnouncer@28f60294)
    jvm 1    | Jan 26, 2018 2:04:25 PM com.twitter.finagle.Announcer$$anonfun$announcers$1 apply
    jvm 1    | INFO: Announcer[flag] = com.twitter.server.FlagAnnouncer(com.twitter.server.FlagAnnouncer@2e1c9a12)
    jvm 1    | Jan 26, 2018 2:04:25 PM com.twitter.finagle.http.HttpMuxer$$anonfun$4 apply
    jvm 1    | INFO: HttpMuxer[/admin/metrics.json] = com.twitter.finagle.stats.MetricsExporter(<function1>)
    jvm 1    | Jan 26, 2018 2:04:25 PM com.twitter.finagle.http.HttpMuxer$$anonfun$4 apply
    jvm 1    | INFO: HttpMuxer[/admin/per_host_metrics.json] = com.twitter.finagle.stats.HostMetricsExporter(<function1>)
    jvm 1    | 14:04:25.224 [WrapperSimpleAppMain] INFO  c.t.i.logging.Slf4jBridgeUtility$ - org.slf4j.bridge.SLF4JBridgeHandler installed.
    jvm 1    | 14:04:25.232 [WrapperSimpleAppMain] WARN  com.twitter.app.App$ - Multiple com.twitter.app.App main methods called. com.deciphernow.server.thrift.GMFabricThriftServer, then com.deciphernow.server.rest.GMFabricRestServer
    jvm 1    | 14:04:25.232 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - Process started
    jvm 1    | 14:04:25.279 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer -  => com.twitter.server.handler.AdminRedirectHandler
    jvm 1    | 14:04:25.280 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin => com.twitter.server.handler.SummaryHandler
    jvm 1    | 14:04:25.280 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/server_info => com.twitter.finagle.Filter$$anon$1
    jvm 1    | 14:04:25.280 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/contention => com.twitter.finagle.Filter$$anon$1
    jvm 1    | 14:04:25.280 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/lint => com.twitter.server.handler.LintHandler
    jvm 1    | 14:04:25.280 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/lint.json => com.twitter.server.handler.LintHandler
    jvm 1    | 14:04:25.280 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/failedlint => com.twitter.server.handler.FailedLintRuleHandler
    jvm 1    | 14:04:25.280 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/threads => com.twitter.server.handler.ThreadsHandler
    jvm 1    | 14:04:25.281 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/threads.json => com.twitter.server.handler.ThreadsHandler
    jvm 1    | 14:04:25.281 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/announcer => com.twitter.finagle.Filter$$anon$1
    jvm 1    | 14:04:25.281 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/dtab => com.twitter.finagle.Filter$$anon$1
    jvm 1    | 14:04:25.281 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/pprof/heap => com.twitter.server.handler.HeapResourceHandler
    jvm 1    | 14:04:25.281 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/pprof/profile => com.twitter.server.handler.ProfileResourceHandler
    jvm 1    | 14:04:25.281 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/pprof/contention => com.twitter.server.handler.ProfileResourceHandler
    jvm 1    | 14:04:25.282 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/ping => com.twitter.server.handler.ReplyHandler
    jvm 1    | 14:04:25.282 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/shutdown => com.twitter.server.handler.ShutdownHandler
    jvm 1    | 14:04:25.282 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/tracing => com.twitter.server.handler.TracingHandler
    jvm 1    | 14:04:25.282 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/events => com.twitter.server.handler.EventsHandler
    jvm 1    | 14:04:25.282 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/events/record/ => com.twitter.server.handler.EventRecordingHandler
    jvm 1    | 14:04:25.283 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/logging => com.twitter.server.handler.LoggingHandler
    jvm 1    | 14:04:25.283 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/metrics => com.twitter.server.handler.MetricQueryHandler
    jvm 1    | 14:04:25.283 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/clients/ => com.twitter.server.handler.ClientRegistryHandler
    jvm 1    | 14:04:25.283 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/servers/ => com.twitter.server.handler.ServerRegistryHandler
    jvm 1    | 14:04:25.283 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/files/ => com.twitter.server.handler.ResourceHandler
    jvm 1    | 14:04:25.284 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/registry.json => com.twitter.server.handler.RegistryHandler
    jvm 1    | 14:04:25.284 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/toggles => com.twitter.server.handler.ToggleHandler
    jvm 1    | 14:04:25.284 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/toggles/ => com.twitter.server.handler.ToggleHandler
    jvm 1    | 14:04:25.284 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /favicon.ico => com.twitter.server.handler.ResourceHandler
    jvm 1    | 14:04:25.284 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/histograms => com.twitter.server.handler.HistogramQueryHandler
    jvm 1    | 14:04:25.285 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/histograms.json => com.twitter.server.handler.HistogramQueryHandler
    jvm 1    | 14:04:25.287 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - Serving admin http on 0.0.0.0/0.0.0.0:9990
    jvm 1    | 14:04:25.325 [WrapperSimpleAppMain] DEBUG i.n.u.i.l.InternalLoggerFactory - Using SLF4J as the default logging framework
    jvm 1    | 14:04:25.326 [WrapperSimpleAppMain] DEBUG i.n.util.internal.PlatformDependent - -Dio.netty.noUnsafe: false
    jvm 1    | 14:04:25.329 [WrapperSimpleAppMain] DEBUG i.n.util.internal.PlatformDependent0 - java.nio.Buffer.address: available
    jvm 1    | 14:04:25.329 [WrapperSimpleAppMain] DEBUG i.n.util.internal.PlatformDependent0 - sun.misc.Unsafe.theUnsafe: available
    jvm 1    | 14:04:25.330 [WrapperSimpleAppMain] DEBUG i.n.util.internal.PlatformDependent0 - sun.misc.Unsafe.copyMemory: available
    jvm 1    | 14:04:25.330 [WrapperSimpleAppMain] DEBUG i.n.util.internal.PlatformDependent0 - direct buffer constructor: available
    jvm 1    | 14:04:25.331 [WrapperSimpleAppMain] DEBUG i.n.util.internal.PlatformDependent0 - java.nio.Bits.unaligned: available, true
    jvm 1    | 14:04:25.331 [WrapperSimpleAppMain] DEBUG i.n.util.internal.PlatformDependent0 - java.nio.DirectByteBuffer.<init>(long, int): available
    jvm 1    | 14:04:25.332 [WrapperSimpleAppMain] DEBUG io.netty.util.internal.Cleaner0 - java.nio.ByteBuffer.cleaner(): available
    jvm 1    | 14:04:25.332 [WrapperSimpleAppMain] DEBUG i.n.util.internal.PlatformDependent - Java version: 8
    jvm 1    | 14:04:25.332 [WrapperSimpleAppMain] DEBUG i.n.util.internal.PlatformDependent - sun.misc.Unsafe: available
    jvm 1    | 14:04:25.333 [WrapperSimpleAppMain] DEBUG i.n.util.internal.PlatformDependent - -Dio.netty.noJavassist: false
    jvm 1    | 14:04:25.333 [WrapperSimpleAppMain] DEBUG i.n.util.internal.PlatformDependent - Javassist: unavailable
    jvm 1    | 14:04:25.334 [WrapperSimpleAppMain] DEBUG i.n.util.internal.PlatformDependent - You don't have Javassist in your class path or you don't have enough permission to load dynamically generated classes.  Please check the configuration for better performance.
    jvm 1    | 14:04:25.334 [WrapperSimpleAppMain] DEBUG i.n.util.internal.PlatformDependent - -Dio.netty.tmpdir: /tmp (java.io.tmpdir)
    jvm 1    | 14:04:25.334 [WrapperSimpleAppMain] DEBUG i.n.util.internal.PlatformDependent - -Dio.netty.bitMode: 64 (sun.arch.data.model)
    jvm 1    | 14:04:25.334 [WrapperSimpleAppMain] DEBUG i.n.util.internal.PlatformDependent - -Dio.netty.noPreferDirect: false
    jvm 1    | 14:04:25.334 [WrapperSimpleAppMain] DEBUG i.n.util.internal.PlatformDependent - io.netty.maxDirectMemory: 7486832640 bytes
    jvm 1    | 14:04:25.361 [WrapperSimpleAppMain] DEBUG i.n.c.MultithreadEventLoopGroup - -Dio.netty.eventLoopThreads: 16
    jvm 1    | 14:04:25.375 [WrapperSimpleAppMain] DEBUG io.netty.channel.nio.NioEventLoop - -Dio.netty.noKeySetOptimization: false
    jvm 1    | 14:04:25.375 [WrapperSimpleAppMain] DEBUG io.netty.channel.nio.NioEventLoop - -Dio.netty.selectorAutoRebuildThreshold: 512
    jvm 1    | 14:04:25.376 [WrapperSimpleAppMain] DEBUG i.n.util.internal.PlatformDependent - org.jctools-core.MpscChunkedArrayQueue: available
    jvm 1    | 14:04:25.397 [WrapperSimpleAppMain] DEBUG io.netty.channel.DefaultChannelId - -Dio.netty.processId: 23517 (auto-detected)
    jvm 1    | 14:04:25.399 [WrapperSimpleAppMain] DEBUG io.netty.util.NetUtil - -Djava.net.preferIPv4Stack: false
    jvm 1    | 14:04:25.399 [WrapperSimpleAppMain] DEBUG io.netty.util.NetUtil - -Djava.net.preferIPv6Addresses: false
    jvm 1    | 14:04:25.420 [WrapperSimpleAppMain] DEBUG io.netty.util.NetUtil - Loopback interface: lo (lo, 0:0:0:0:0:0:0:1%lo)
    jvm 1    | 14:04:25.420 [WrapperSimpleAppMain] DEBUG io.netty.util.NetUtil - /proc/sys/net/core/somaxconn: 128
    jvm 1    | 14:04:25.421 [WrapperSimpleAppMain] DEBUG io.netty.channel.DefaultChannelId - -Dio.netty.machineId: f0:d5:bf:ff:fe:cd:87:2d (auto-detected)
    jvm 1    | 14:04:25.424 [WrapperSimpleAppMain] DEBUG i.n.util.internal.ThreadLocalRandom - -Dio.netty.initialSeedUniquifier: 0x83978a14d8162e60
    jvm 1    | 14:04:25.433 [WrapperSimpleAppMain] DEBUG io.netty.util.ResourceLeakDetector - -Dio.netty.leakDetection.level: simple
    jvm 1    | 14:04:25.434 [WrapperSimpleAppMain] DEBUG io.netty.util.ResourceLeakDetector - -Dio.netty.leakDetection.maxRecords: 4
    jvm 1    | 14:04:25.444 [WrapperSimpleAppMain] DEBUG i.n.buffer.PooledByteBufAllocator - -Dio.netty.allocator.numHeapArenas: 16
    jvm 1    | 14:04:25.444 [WrapperSimpleAppMain] DEBUG i.n.buffer.PooledByteBufAllocator - -Dio.netty.allocator.numDirectArenas: 16
    jvm 1    | 14:04:25.444 [WrapperSimpleAppMain] DEBUG i.n.buffer.PooledByteBufAllocator - -Dio.netty.allocator.pageSize: 8192
    jvm 1    | 14:04:25.444 [WrapperSimpleAppMain] DEBUG i.n.buffer.PooledByteBufAllocator - -Dio.netty.allocator.maxOrder: 4
    jvm 1    | 14:04:25.444 [WrapperSimpleAppMain] DEBUG i.n.buffer.PooledByteBufAllocator - -Dio.netty.allocator.chunkSize: 131072
    jvm 1    | 14:04:25.444 [WrapperSimpleAppMain] DEBUG i.n.buffer.PooledByteBufAllocator - -Dio.netty.allocator.tinyCacheSize: 512
    jvm 1    | 14:04:25.444 [WrapperSimpleAppMain] DEBUG i.n.buffer.PooledByteBufAllocator - -Dio.netty.allocator.smallCacheSize: 256
    jvm 1    | 14:04:25.444 [WrapperSimpleAppMain] DEBUG i.n.buffer.PooledByteBufAllocator - -Dio.netty.allocator.normalCacheSize: 64
    jvm 1    | 14:04:25.444 [WrapperSimpleAppMain] DEBUG i.n.buffer.PooledByteBufAllocator - -Dio.netty.allocator.maxCachedBufferCapacity: 32768
    jvm 1    | 14:04:25.444 [WrapperSimpleAppMain] DEBUG i.n.buffer.PooledByteBufAllocator - -Dio.netty.allocator.cacheTrimInterval: 8192
    jvm 1    | 14:04:25.444 [WrapperSimpleAppMain] DEBUG i.n.buffer.PooledByteBufAllocator - -Dio.netty.allocator.useCacheForAllThreads: true
    jvm 1    | 14:04:25.452 [WrapperSimpleAppMain] DEBUG io.netty.buffer.ByteBufUtil - -Dio.netty.allocator.type: pooled
    jvm 1    | 14:04:25.452 [WrapperSimpleAppMain] DEBUG io.netty.buffer.ByteBufUtil - -Dio.netty.threadLocalDirectBufferSize: 65536
    jvm 1    | 14:04:25.452 [WrapperSimpleAppMain] DEBUG io.netty.buffer.ByteBufUtil - -Dio.netty.maxThreadLocalCharBufferSize: 16384
    jvm 1    | 14:04:25.452 [WrapperSimpleAppMain] WARN  io.netty.bootstrap.ServerBootstrap - Unknown channel option 'SO_LINGER' for channel '[id: 0x5b01144c]'
    jvm 1    | 14:04:25.720 [WrapperSimpleAppMain] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: shutdown.time = 1.minutes
    jvm 1    | 14:04:25.723 [WrapperSimpleAppMain] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: log.level = INFO
    jvm 1    | 14:04:25.723 [WrapperSimpleAppMain] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: local.doc.root = 
    jvm 1    | 14:04:25.723 [WrapperSimpleAppMain] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: https.port = 
    jvm 1    | 14:04:25.723 [WrapperSimpleAppMain] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: mustache.templates.dir = templates
    jvm 1    | 14:04:25.724 [WrapperSimpleAppMain] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: log.async = true
    jvm 1    | 14:04:25.724 [WrapperSimpleAppMain] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: cert.path = 
    jvm 1    | 14:04:25.724 [WrapperSimpleAppMain] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: http.name = http
    jvm 1    | 14:04:25.724 [WrapperSimpleAppMain] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: maxRequestSize = 5242880.bytes
    jvm 1    | 14:04:25.725 [WrapperSimpleAppMain] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: log.rollPolicy = Never
    jvm 1    | 14:04:25.725 [WrapperSimpleAppMain] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: help = false
    jvm 1    | 14:04:25.725 [WrapperSimpleAppMain] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: log.output = /dev/stderr
    jvm 1    | 14:04:25.725 [WrapperSimpleAppMain] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: http.port = :8888
    jvm 1    | 14:04:25.726 [WrapperSimpleAppMain] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: log.async.maxsize = 4096
    jvm 1    | 14:04:25.726 [WrapperSimpleAppMain] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: https.name = https
    jvm 1    | 14:04:25.726 [WrapperSimpleAppMain] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: http.response.charset.enabled = true
    jvm 1    | 14:04:25.727 [WrapperSimpleAppMain] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: log.rotateCount = -1
    jvm 1    | 14:04:25.727 [WrapperSimpleAppMain] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: doc.root = 
    jvm 1    | 14:04:25.727 [WrapperSimpleAppMain] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: log.async.inferClassNames = false
    jvm 1    | 14:04:25.728 [WrapperSimpleAppMain] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: key.path = 
    jvm 1    | 14:04:25.728 [WrapperSimpleAppMain] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: log.append = true
    jvm 1    | 14:04:25.728 [WrapperSimpleAppMain] DEBUG c.t.inject.app.internal.FlagsModule - Binding flag: admin.port = 0.0.0.0/0.0.0.0:9990
    jvm 1    | 14:04:25.912 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - Resolving Finagle clients before warmup
    jvm 1    | 14:04:25.915 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - Done resolving clients: [].
    jvm 1    | 14:04:25.916 [WrapperSimpleAppMain] INFO  c.t.s.internal.FinagleBuildRevision$ - Resolved Finagle build revision: (rev=f48520b6809792d8cb87c5d81a13075fd01c051d)
    jvm 1    | 14:04:26.006 [WrapperSimpleAppMain] DEBUG c.t.f.h.modules.MessageBodyModule$ - Configuring MessageBodyManager
    jvm 1    | 14:04:26.011 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - Warming up.
    jvm 1    | 14:04:26.089 [WrapperSimpleAppMain] INFO  c.t.finatra.http.routing.HttpRouter - Adding routes
    jvm 1    | GET     /ping
    jvm 1    | 14:04:26.092 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer -  => com.twitter.server.handler.AdminRedirectHandler
    jvm 1    | 14:04:26.093 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin => com.twitter.server.handler.SummaryHandler
    jvm 1    | 14:04:26.093 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/server_info => com.twitter.finagle.Filter$$anon$1
    jvm 1    | 14:04:26.093 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/contention => com.twitter.finagle.Filter$$anon$1
    jvm 1    | 14:04:26.093 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/lint => com.twitter.server.handler.LintHandler
    jvm 1    | 14:04:26.093 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/lint.json => com.twitter.server.handler.LintHandler
    jvm 1    | 14:04:26.093 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/failedlint => com.twitter.server.handler.FailedLintRuleHandler
    jvm 1    | 14:04:26.093 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/threads => com.twitter.server.handler.ThreadsHandler
    jvm 1    | 14:04:26.093 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/threads.json => com.twitter.server.handler.ThreadsHandler
    jvm 1    | 14:04:26.093 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/announcer => com.twitter.finagle.Filter$$anon$1
    jvm 1    | 14:04:26.093 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/dtab => com.twitter.finagle.Filter$$anon$1
    jvm 1    | 14:04:26.093 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/pprof/heap => com.twitter.server.handler.HeapResourceHandler
    jvm 1    | 14:04:26.093 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/pprof/profile => com.twitter.server.handler.ProfileResourceHandler
    jvm 1    | 14:04:26.093 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/pprof/contention => com.twitter.server.handler.ProfileResourceHandler
    jvm 1    | 14:04:26.094 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/ping => com.twitter.server.handler.ReplyHandler
    jvm 1    | 14:04:26.094 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/shutdown => com.twitter.server.handler.ShutdownHandler
    jvm 1    | 14:04:26.094 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/tracing => com.twitter.server.handler.TracingHandler
    jvm 1    | 14:04:26.094 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/events => com.twitter.server.handler.EventsHandler
    jvm 1    | 14:04:26.094 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/events/record/ => com.twitter.server.handler.EventRecordingHandler
    jvm 1    | 14:04:26.094 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/logging => com.twitter.server.handler.LoggingHandler
    jvm 1    | 14:04:26.094 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/metrics => com.twitter.server.handler.MetricQueryHandler
    jvm 1    | 14:04:26.094 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/clients/ => com.twitter.server.handler.ClientRegistryHandler
    jvm 1    | 14:04:26.094 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/servers/ => com.twitter.server.handler.ServerRegistryHandler
    jvm 1    | 14:04:26.094 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/files/ => com.twitter.server.handler.ResourceHandler
    jvm 1    | 14:04:26.094 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/registry.json => com.twitter.server.handler.RegistryHandler
    jvm 1    | 14:04:26.094 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/toggles => com.twitter.server.handler.ToggleHandler
    jvm 1    | 14:04:26.095 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/toggles/ => com.twitter.server.handler.ToggleHandler
    jvm 1    | 14:04:26.095 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /favicon.ico => com.twitter.server.handler.ResourceHandler
    jvm 1    | 14:04:26.095 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/histograms => com.twitter.server.handler.HistogramQueryHandler
    jvm 1    | 14:04:26.095 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - /admin/histograms.json => com.twitter.server.handler.HistogramQueryHandler
    jvm 1    | 14:04:26.111 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - http server started on port: 8888
    jvm 1    | 14:04:26.112 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - Enabling health endpoint on port 9990
    jvm 1    | 14:04:26.113 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - com.deciphernow.server.rest.GMFabricRestServer started.
    jvm 1    | 14:04:26.113 [WrapperSimpleAppMain] INFO  c.d.server.rest.GMFabricRestServer - Startup complete, server ready.

### Testing response
In another terminal type the following:

    $ curl -XGET localhost:8888/ping
    
the response is

    pong
    

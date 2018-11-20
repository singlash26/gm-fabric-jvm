package com.deciphernow.server


/*
    Copyright 2017 Decipher Technology Studios LLC

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/

import com.deciphernow.server.rest.GMFabricRestServer
import com.deciphernow.server.thrift.GMFabricThriftServer
import com.twitter.app.App
import com.twitter.logging.Logger
import com.twitter.util.Time

/**
  * Created by ghershfield on 4/19/16.
  */
abstract class GMFabricServer extends App {

  override def allowUndefinedFlags: Boolean = com.deciphernow.server.config.flags.allowUndefinedFlags.apply
  override def failfastOnFlagsNotParsed: Boolean = com.deciphernow.server.config.flags.failFastOnFlagsNotParsed.apply

  val log = Logger.get(getClass)
  var restServer : Option[GMFabricRestServer] = None
  var thriftServer : Option[GMFabricThriftServer] = None



  def rest(): Option[RestServer]
  def thrift(): Option[ThriftServer]

  onExit {
    log.ifWarning("Shutting server down")
    if (restServer!=None) { restServer map (_.close()) }
    if (thriftServer!=None) { thriftServer map (_.close()) }
  }


  /**
    *
    */
  final def main(): Unit = {

    log.ifDebug("Main starting up ... ")

    GMFNetworkConfigurationResolver.resolveConfiguration

    sys.addShutdownHook(close(Time.fromSeconds(2)))

    val announceAdmin  : Boolean = com.deciphernow.server.config.announce.admin.apply
    val announceHttp   : Boolean = com.deciphernow.server.config.announce.http.apply
    val announceHttps  : Boolean = com.deciphernow.server.config.announce.https.apply
    val announceThrift : Boolean = com.deciphernow.server.config.announce.thrift.apply

    thrift match {
      case Some(_) =>
        log.ifDebug("creating thrift server.")
        thriftServer = Option(new GMFabricThriftServer(thrift.get.filters, thrift.get.service))
        thriftServer.foreach(_ => {
          thriftServer.get.main(Array())
          if (announceThrift) {
            GMFAnnouncer.announce(GMFNetworkConfigurationResolver.getAnnounceThriftPort,"thrift")
          }
          else {
            log.info("The thrift end-point has been configured to not be discoverable.")
          }

        })
      case _ => log.info("No thrift server defined.")
    }

    rest match {
      case Some(_) =>
        log.ifDebug("creating restful server.")
        restServer = Option(new GMFabricRestServer(rest.get.filters, rest.get.controllers, rest.get.modules))
        if (announceAdmin) {
          GMFAnnouncer.announce(GMFNetworkConfigurationResolver.getAnnounceAdminPort,"admin")
        }
        else {
          log.info("The admin end-point has been configured to not be discoverable.")
        }
        if (announceHttp) {
          GMFAnnouncer.announce(GMFNetworkConfigurationResolver.getAnnounceHttpPort,"http")
        }
        else {
          log.info("The http end-point has been configured to not be discoverable.")
        }
        if (announceHttps) {
          GMFAnnouncer.announce(GMFNetworkConfigurationResolver.getAnnounceHttpsPort,"https")
        }
        else {
          log.info("The https end-point has been configured to not be discoverable.")
        }

        restServer.get.main(Array())
      case _ => log.error("No rest server defined. All services will shutdown.")
    }

  }

}

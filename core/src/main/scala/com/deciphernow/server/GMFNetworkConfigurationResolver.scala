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

import java.net.{Inet4Address, InetAddress, NetworkInterface}

import com.deciphernow.server.{config => serverConfig, ConfigUtilities => CU}
import com.deciphernow.announcement.{config => announcementConfig}
import com.twitter.logging.Logger

/**
  *
  */
object GMFNetworkConfigurationResolver {

  val log = Logger.get(getClass)

  var announceHostname   : String = _

  var announceAdminPort  : String = _
  var announceHttpPort   : String = _
  var announceHttpsPort  : String = _
  var announceThriftPort : String = _

  var bindAdminPort  : String = _
  var bindHttpPort   : String = _
  var bindHttpsPort  : String = _
  var bindThriftPort : String = _

  def getBindAdminPort = bindAdminPort
  def getBindHttpPort = bindHttpPort
  def getBindHttpsPort = bindHttpsPort
  def getBindThriftPort = bindThriftPort

  def getAnnounceHostname = announceHostname
  def getAnnounceAdminPort = announceAdminPort
  def getAnnounceHttpPort  = announceHttpPort
  def getAnnounceHttpsPort = announceHttpsPort
  def getAnnounceThriftPort = announceThriftPort

  /**
    * Resolve the attributes that announce and bind the ports of the service.
    */
  def resolveConfiguration = {

    resolveAnnounceHostname

    resolveAnnounceAdminPort
    resolveAnnounceHttpPort
    resolveAnnounceHttpsPort
    resolveAnnounceThriftPort

    resolveBindAdminPort
    resolveBindHttpPort
    resolveBindHttpsPort
    resolveBindThriftPort

  }

  /**
    * Resolve which attribute defines the hostname.
    */
  protected [this] def resolveAnnounceHostname : Unit = {
    identifyHostOrIP
    announceHostname = pickValue(List(envValue(announcementConfig.os.env.hostname.apply),
                        announcementConfig.service.forward.hostname.apply.getOrElse(""),
                        envValue(serverConfig.os.env.hostname.apply), announceThis)
    )
  }

  /**
    * Resolve which attribute the admin port binds to.
    */
  protected [this] def resolveBindAdminPort : Unit = {
    bindAdminPort = addTwitterNuance(
      pickValue(List(
        envValue(serverConfig.os.env.adminPort.apply),serverConfig.admin.port.apply
      ))
    )
  }

  /**
    * Resolve which attribute the http port binds to.
    */
  protected [this] def resolveBindHttpPort : Unit = {
    bindHttpPort = addTwitterNuance(
      pickValue(List(
        envValue(serverConfig.os.env.httpPort.apply),serverConfig.rest.httpPort.apply
      ))
    )
  }

  /**
    * Resolve which attribute the https port binds to.
    */
  protected [this] def resolveBindHttpsPort : Unit = {
    bindHttpsPort = addTwitterNuance(
      pickValue(List(
        envValue(serverConfig.os.env.httpsPort.apply),serverConfig.rest.httpsPort.apply
      ))
    )
  }

  /**
    * Resolve which attribute the thrift port binds to.
    */
  protected [this] def resolveBindThriftPort : Unit = {
    bindThriftPort = addTwitterNuance(
      pickValue(List(
        envValue(serverConfig.os.env.thriftPort.apply),serverConfig.thrift.port.apply
      ))
    )
  }

  /**
    * Resolve which attribute announces admin port.
    */
  protected [this] def resolveAnnounceAdminPort : Unit = {
    announceAdminPort = (pickValue(List(envValue(announcementConfig.os.env.adminPort.apply),
      announcementConfig.service.forward.adminPort.apply.getOrElse(""),
      envValue(serverConfig.os.env.adminPort.apply),
      serverConfig.admin.port.apply))).trim.replaceFirst(":","")
  }

  /**
    * Resolve which attribute announces http port.
    */
  protected [this] def resolveAnnounceHttpPort : Unit = {
    announceHttpPort = (pickValue(List(envValue(announcementConfig.os.env.httpPort.apply),
      announcementConfig.service.forward.httpPort.apply.getOrElse(""),
      envValue(serverConfig.os.env.httpPort.apply),
      serverConfig.rest.httpPort.apply))).trim.replaceFirst(":","")
  }

  /**
    * Resolve which attribute announces https port.
    */
  protected [this] def resolveAnnounceHttpsPort : Unit = {
    announceHttpsPort = (pickValue(List(envValue(announcementConfig.os.env.httpsPort.apply),
      announcementConfig.service.forward.httpsPort.apply.getOrElse(""),
      envValue(serverConfig.os.env.httpsPort.apply),
      serverConfig.rest.httpsPort.apply))).trim.replaceFirst(":","")
  }

  /**
    * Resolve which attribute announces the thrift port.
    */
  protected [this] def resolveAnnounceThriftPort : Unit = {
    announceThriftPort = (pickValue(List(envValue(announcementConfig.os.env.thriftPort.apply),
      announcementConfig.service.forward.thriftPort.apply.getOrElse(""),
      envValue(serverConfig.os.env.thriftPort.apply),
      serverConfig.thrift.port.apply))).trim.replaceFirst(":","")
  }

  /**
    *
    * @param value
    * @return
    */
  def notNullOrBlank(value: String) = CU.notNullOrBlank(value)

  /**
    *
    * @param values
    * @return
    */
  protected [this] def pickValue(values: List[String]) : String = CU.pickValue(values)

  /**
    * Retrieve the value from the environment variable. Return empty String if None.
    * @param env
    * @return
    */
  protected [this] def envValue(env: Option[String]) = CU.envValue(env)


  /**
    * For ports to be bound, twitter expects the port values to start with ':'. Pre-append the port with ':' if it is missing.
    *
    * @param value
    * @return
    */
  protected [this] def addTwitterNuance(value: String) = {
    if (notNullOrBlank(value)) {
      if (value.startsWith(":")) value else s":$value"
    }
    else {
      value
    }
  }

  var useIpAddressResolution : Boolean = false
  var networkInterfaceName : String = ""
  var haveNetworkInterfaceName : Boolean = false
  var announceThis : String = ""

  useIpAddressResolution = serverConfig.ipAddress.enableIpAddressResolution.apply
  networkInterfaceName = serverConfig.ipAddress.useNetworkInterfaceName.get.fold("")(definedInterfaceName => definedInterfaceName)
  haveNetworkInterfaceName = (networkInterfaceName.trim.length > 0)

  /**
    * Looks up a specific interface to be used for registration to ZK.
    * @param networkInterface
    */
  protected [this] def getNetworkInfo(networkInterface: Option[NetworkInterface]) : Unit = {
    networkInterface match {
      case Some(v) => findNetworkInfo(v)
      case None => log.ifInfo("NetworkInterface [" + networkInterfaceName + "] is NULL. Shutting down!")
        System.exit(-1)
    }
  }

  /**
    * Iterates through the interfaces for a network looking for a valid interface to register with ZK.
    * @param networkInterface
    */
  protected [this] def findNetworkInfo(networkInterface: NetworkInterface) : Unit = {

    if (networkInterface.isUp && !networkInterface.isLoopback && !networkInterface.isVirtual) {
      val addresses = networkInterface.getInetAddresses

      while (addresses.hasMoreElements && !(announceThis.trim.length > 0)) {
        val anAddress = addresses.nextElement

        if (anAddress.isInstanceOf[Inet4Address] && !anAddress.isLoopbackAddress) {
          announceThis = if (useIpAddressResolution) { convertIpAddress(anAddress.getAddress) }
          else { InetAddress.getLocalHost.getHostName }
        }
      }
    }
  }

  /**
    * Retrieve the 'hostname' or the 'IPv4' address.
    */
  def identifyHostOrIP : Unit = {
      if (haveNetworkInterfaceName) {
        getNetworkInfo(Option(NetworkInterface.getByName(networkInterfaceName)))
      }
      else {
        val networkInterfaces = NetworkInterface.getNetworkInterfaces
        while (networkInterfaces.hasMoreElements && !(announceThis.trim.length > 0)) {
          findNetworkInfo(networkInterfaces.nextElement)
        }
      }
  }

  /**
    * Convert the byte array representation of the IPv4 address to a string.
    *
    * @param rawBytes
    * @return
    */
  def convertIpAddress(rawBytes: Array[Byte]) : String = rawBytes.map(n => n & 0xFF).mkString(".")

}

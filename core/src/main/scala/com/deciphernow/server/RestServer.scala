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

import com.twitter.finagle.Filter
import com.twitter.finagle.http.{Request => FinagleRequest, Response => FinagleResponse}
import com.twitter.finatra.http.Controller
import com.twitter.inject.TwitterModule

/**
  *
  * @param filters
  * @param controllers
  * @param modules
  */
case class RestServer(filters: Seq[Filter[FinagleRequest, FinagleResponse,FinagleRequest, FinagleResponse]],controllers: Seq[Controller], modules: Seq[TwitterModule] = Nil) {
  def this(controllers: Seq[Controller]) = this(Nil,controllers, Nil)
  def this(filters: Seq[Filter[FinagleRequest, FinagleResponse,FinagleRequest, FinagleResponse]],controller: Controller) = this(filters,controller :: Nil, Nil)
  def this(controller: Controller) = this(controller :: Nil)
}
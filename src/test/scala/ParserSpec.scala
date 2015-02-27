/*
 * Copyright 2014-2015
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Created by prannamalai on 2/20/15.
 */

package com.paypal.genio.spec

import java.io.File

import org.json4s._
import org.json4s.native.JsonMethods._
import org.scalatest.FunSpec

import scala.io.Source


class ParserSpec extends FunSpec {

  // TODO: Remove the default passing test case


  describe("Adding 1 to 1") {
    it("should equals 2") {
      assert(1 + 1 == 2)
    }
  }

  describe("Reading a JSON File") {
    it("shouldn't be empty") {
      val source = Source.fromURL(getClass.getResource("/sample-gdf.json")).getLines().mkString
      assert(parse(source) != null)
    }
  }

}

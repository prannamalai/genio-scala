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
package com.paypal.genio

import org.json4s.JsonAST.{JNothing, JField, JValue}
import org.json4s.native.JsonParser

import scala.io.Source

sealed abstract class SpecType
case object SpecTypeGDD extends SpecType
case object SpecTypeSwagger extends SpecType
case object SpecTypeInvalid extends SpecType

class Reader{
  def readFile (fileName:String) = Source.fromURL(getClass.getResource(fileName)).getLines().mkString
  def parseJson (json:String) = JsonParser.parse(json)
  def findSpecType (parsedJson:JValue) = {
    if(parsedJson\"swagger" != JNothing)
      SpecTypeSwagger
    else if (parsedJson\"discoveryVersion" != JNothing)
      SpecTypeGDD
    else
      SpecTypeInvalid
  }
  def specType(fileName:String) = {
    findSpecType(parseJson(readFile(fileName)))
  }
}
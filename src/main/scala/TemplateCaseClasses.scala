/**
 * Created by piverma on 6/24/2015.
 */
package com.paypal.genio

class Type extends Enumeration {
  type Type = Value
  val String, Integer, Object, Array = Value
}

case class Property(name:String, propertyType:Type)
case class Param(name:String, paramType:Type)

case class Method(httpMethod: String, params: Map[List[Param], List[Param]] )

case class Path(methods: List[Method], paths:List[Path])
case class Paths(paths: List[Path])

case class RequestBody(schemaref: String)

case class Responses(response: Map[Int,String])

case class Schema(schema: Map[List[Property], List[Property]])
case class Schemas(schemas: Map[String, Schema])

class TemplateCaseClasses {

}

/**
 * Created by piverma on 6/24/2015.
 */
package com.paypal.genio

class ValueType extends Enumeration {
  type ValueType = Value
  val String, Integer, Object, Array = Value
}

class MethodParamKey extends Enumeration {
  type MethodParamKey = Value
  val Query, Path = Value
}

class SchemaPropertyKey extends Enumeration {
  type SchemaPropertyKey = Value
  val Objects, Arrays = Value
}

case class Property(name:String, propertyType:ValueType)
case class Param(name:String, paramType:ValueType)

case class Method(httpMethod: String, params: Map[MethodParamKey, List[Param]] )

case class Path(methods: List[Method], paths:List[Path])
case class Paths(paths: List[Path])

case class RequestBody(schemaRef: String)

case class Responses(response: Map[Int,String])

case class Schema(schema: Map[SchemaPropertyKey, List[Property]])
case class Schemas(schemas: Map[String, Schema])

class TemplateCaseClasses {

}

package com.paypal.genio
/**
 * Created by akgoel on 03/07/15.
 */
trait Service {
  def serviceName():String
  def servicePath():String
  def serviceRoot():String
  def schemas():Map[String, Schema]
  def resources():Map[String, Resource]
}

sealed abstract class SchemaType
case object SchemaTypeString extends SchemaType
case object SchemaTypeNumber extends SchemaType
case object SchemaTypeInteger extends SchemaType
case object SchemaTypeBoolean extends SchemaType
case object SchemaTypeObject extends SchemaType
case object SchemaTypeArray extends SchemaType

sealed abstract class FormatType
case object FormatTypeInt32 extends FormatType
case object FormatTypeUInt32 extends FormatType
case object FormatTypeDouble extends FormatType
case object FormatTypeFloat extends FormatType
case object FormatTypeByte extends FormatType
case object FormatTypeDate extends FormatType
case object FormatTypeDateTime extends FormatType
case object FormatTypeInt64 extends FormatType
case object FormatTypeUInt64 extends FormatType

sealed abstract class SchemaLocation
case object SchemaLocationQuery extends SchemaLocation
case object SchemaLocationPath extends SchemaLocation

class Schema(id:String, schemaType:SchemaType, description:String, required:Boolean, format:FormatType, location:SchemaLocation, properties:Map[String, Schema], items:Schema){
  
}

class Resource()

class Mapper {

}

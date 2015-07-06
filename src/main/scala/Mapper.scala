package com.paypal.genio
/**
 * Created by akgoel on 03/07/15.
 */

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

object Mapper {
  def formatType(format:String) = format match {
    case "int32" => FormatTypeInt32
    case "uint32" => FormatTypeUInt32
    case "double" => FormatTypeDouble
    case "float" => FormatTypeFloat
    case "byte" => FormatTypeByte
    case "date" => FormatTypeDate
    case "date-time" => FormatTypeDateTime
    case "int64" => FormatTypeInt64
    case "uint64" => FormatTypeUInt64
    case _ => None
  }

  def schemaType(schemaType:String) = schemaType match {
    case "string" => SchemaTypeString
    case "number" => SchemaTypeNumber
    case "integer" => SchemaTypeInteger
    case "boolean" => SchemaTypeBoolean
    case "object" => SchemaTypeObject
    case "array" => SchemaTypeArray
    case _ => None
  }

  def schemaLocation(schemaLocation:String) = schemaLocation match {
    case "path" => SchemaLocationPath
    case "query" => SchemaLocationQuery
    case _ => None
  }
}

package com.paypal.genio

import org.json4s.JsonAST.{JString, JObject, JValue}

/**
 * Created by akgoel on 03/07/15.
 */

trait Service {
  def serviceName(): JValue

  def servicePath(): JValue

  def serviceRoot(): JValue

  def schemas(): Map[String, Schema]

  def resources(): Map[String, Resource]
}

class ServiceGDD(parsedJson: JValue) extends Service {
  override def serviceName():JValue = parsedJson \ "name"

  override def resources(): Map[String, Resource] = ???

  override def schemas(): Map[String, Schema] = ???

  override def servicePath(): JValue = parsedJson \ "servicePath"

  override def serviceRoot(): JValue = parsedJson \ "rootUrl"
}

class ServiceSwagger(parsedJson: JValue) extends Service {
  override def serviceName(): JValue = parsedJson \ "info" \ "title"

  override def resources(): Map[String, Resource] = ???

  override def schemas(): Map[String, Parameter] = ???

  override def servicePath() = parsedJson \ "basePath"

  override def serviceRoot() = parsedJson \ "host"
}
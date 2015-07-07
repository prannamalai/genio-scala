package com.paypal.genio

import org.json4s.JsonAST.{JString, JObject, JValue}

/**
 * Created by akgoel on 03/07/15.
 */

trait Service {
  def serviceName(): String

  def servicePath(): String

  def serviceRoot(): String

  def schemas(): Map[String, Schema]

  def resources(): Map[String, Resource]
}

class ServiceGDD(parsedSpec: Map[String, Any]) extends Service {
  override def serviceName():String = parsedSpec.get("name").get.asInstanceOf[String]

  override def resources(): Map[String, Resource] = ???

  override def schemas(): Map[String, Schema] = ???

  override def servicePath(): String = parsedSpec.get("servicePath").get.asInstanceOf[String]

  override def serviceRoot(): String = parsedSpec.get("rootUrl").get.asInstanceOf[String]
}

class ServiceSwagger(parsedSpec: Map[String, Any]) extends Service {
  override def serviceName(): String = parsedSpec.get("info").get.asInstanceOf[Map[String, Any]].get("title").get.asInstanceOf[String]

  override def resources(): Map[String, Resource] = ???

  override def schemas(): Map[String, Parameter] = ???

  override def servicePath():String = parsedSpec.get("basePath").get.asInstanceOf[String]

  override def serviceRoot():String = parsedSpec.get("host").get.asInstanceOf[String]
}
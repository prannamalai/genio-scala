package com.paypal.genio

/**
 * Created by akgoel on 03/07/15.
 */
object Main extends App {
  var r = new Reader()
  r.specType("/swagger.json") match {
    case (SpecTypeGDD, parsedJson) => {
      val gddService = new ServiceGDD(parsedJson)
      val serviceName = gddService.serviceName()
      println(serviceName)
    }
    case (SpecTypeSwagger, parsedJson) => {
      val swaggerService = new ServiceSwagger(parsedJson)
      println(swaggerService.serviceName())
    }
    case (_, _) => {
      println("Invalid Input")
    }
  }
}

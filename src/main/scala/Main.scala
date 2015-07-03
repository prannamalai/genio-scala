package com.paypal.genio

/**
 * Created by akgoel on 03/07/15.
 */
object Main extends App {
  var r = new Reader()
  println(r.specType("/sample-gdf.json"))
}

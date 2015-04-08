name := "genio-scala"

organization := "com.paypal"

version := "0.0.1"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.4" % "test" withSources() withJavadoc(),
  "org.scalacheck" %% "scalacheck" % "1.12.1" % "test" withSources() withJavadoc(),
  "org.scalatra.scalate" %% "scalate-core" % "1.7.0"  withSources() withJavadoc(),
  "org.json4s" %% "json4s-native" % "3.2.11"  withSources() withJavadoc()
)

initialCommands := "import com.paypal.genio._"


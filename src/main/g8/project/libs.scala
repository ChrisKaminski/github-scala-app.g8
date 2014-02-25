import sbt._
import Keys._

object Libs {
  lazy val log4j2Version = "2.0-rc1"

  lazy val akkaActor = "com.typesafe.akka" %% "akka-actor" % "2.2.3"
  lazy val log4j2Api = "org.apache.logging.log4j" % "log4j-api" % log4j2Version
  lazy val log4j2Core = "org.apache.logging.log4j" % "log4j-core" % log4j2Version
  lazy val log4jSlf4jImpl = "org.apache.logging.log4j" % "log4j-slf4j-impl" % log4j2Version
  lazy val metricsScala = "nl.grons" %% "metrics-scala" % "3.0.4"
  lazy val scalalogging = "com.typesafe" %% "scalalogging-log4j" % "1.1.0"
  lazy val scalatest = "org.scalatest" %% "scalatest" % "2.0" % "test"
  lazy val scopt = "com.github.scopt" %% "scopt" % "3.2.0"

  lazy val common = Seq(
    log4j2Api,
    log4jSlf4jImpl,
    akkaActor,
    metricsScala,
    scalalogging,
    scalatest)
}

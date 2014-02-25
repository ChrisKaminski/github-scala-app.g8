import sbt._
import Keys._

object Libs {
	lazy val akkaActor = "com.typesafe.akka" %% "akka-actor" % "2.2.3"
	lazy val log4j2Api = "org.apache.logging.log4j" % "log4j-api" % "2.0-rc1"
	lazy val log4j2Core = "org.apache.logging.log4j" % "log4j-core" % "2.0-rc1"
	lazy val metricsScala = "nl.grons" %% "metrics-scala" % "3.0.4"
	lazy val scalalogging = "com.typesafe" %% "scalalogging-log4j" % "1.1.0"
	lazy val scalatest = "org.scalatest" %% "scalatest" % "2.0" % "test"
	lazy val scopt = "com.github.scopt" %% "scopt" % "3.2.0"
	lazy val all = Seq(
		akkaActor, 
		log4j2Api, 
		log4j2Core, 
		metricsScala, 
		scalalogging, 
		scalatest,
		scopt)
}

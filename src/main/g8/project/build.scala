import sbt._
import Keys._
import org.scalastyle.sbt.ScalastylePlugin
import ls.Plugin._

object $name;format="Camel"$Build extends Build {

  def sharedSettings = {
    lsSettings ++
    ScalastylePlugin.Settings ++
    Seq(libraryDependencies ++= Libs.common)
  }

  lazy val $name;format="camel"$ = project.in(file("."))
                  .settings(publishArtifact := false)
                  .aggregate(lib, app)

  lazy val lib = project.in(file("lib"))
                  .settings(sharedSettings: _*)

  lazy val app = project.in(file("app"))
                  .settings(sharedSettings: _*)
                  .dependsOn(lib)
}

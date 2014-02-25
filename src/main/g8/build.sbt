name := "$name;format="lower"$"

organization := "$organization$"

scalaVersion := "2.10.3"

version := "0.1.0"

licenses := Seq(("The MIT License (MIT)", new URL("http://opensource.org/licenses/MIT")))

libraryDependencies := Libs.all

org.scalastyle.sbt.ScalastylePlugin.Settings

buildInfoSettings

sourceGenerators in Compile <+= buildInfo

buildInfoKeys := Seq[BuildInfoKey](name, organization, version)

buildInfoPackage := "$package$.util"

packSettings

packMain := Map("$name;format="lower,hyphen"$" -> "$package$.Main")

packJvmOpts := Map("$name;format="lower,hyphen"$" -> Seq("-Xmx512m"))

seq(lsSettings :_*)

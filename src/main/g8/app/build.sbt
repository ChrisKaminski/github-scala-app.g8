name := "$name;format="lower"$"

libraryDependencies ++= Seq(Libs.log4j2Core, Libs.scopt)

packSettings

packMain := Map("$name;format="lower,hyphen"$" -> "$package$.Main")

packJvmOpts := Map("$name;format="lower,hyphen"$" -> Seq("-Xmx512m"))

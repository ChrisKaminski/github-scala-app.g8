name := "$name;format="lower"$-lib"

sourceGenerators in Compile <+= buildInfo

buildInfoSettings

buildInfoKeys := Seq[BuildInfoKey](name, organization, version)

buildInfoPackage := "$package$.util"
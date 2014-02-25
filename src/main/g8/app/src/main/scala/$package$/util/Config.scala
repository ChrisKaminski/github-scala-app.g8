package $package$.util

import scopt.OptionParser

case object Config

object ConfigParser extends OptionParser[Config.type](BuildInfo.name) {
  head(BuildInfo.name, BuildInfo.version)
}

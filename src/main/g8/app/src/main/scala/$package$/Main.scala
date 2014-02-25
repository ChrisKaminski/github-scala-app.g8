package $package$

import util.{ConfigParser, Config}

object Main {
  def main(args: Array[String]) {
    ConfigParser.parse(args, Config) foreach { _ =>
      println("Hello world.") 
    }
  }
}

# github-scala-template.g8

A highly subjective take on what a pretty good start for 
a scala app looks like. It includes the following things:

### .gitignore
Configured to ignore any gunk left by vim, emacs, IntelliJ, Sublime Text, sbt, scala, and OS X.

### A barebones project structure

With a "hello world" main class and the start of a command-line args parser.

### A license
[MIT](http://opensource.org/licenses/MIT)

### A boilerplate markdown readme
(much like this one) 


### Libs
The current release will always (to the best of my extent) come packaged with the latest versions of

* [akka](http://akka.io/)
* [metrics](http://metrics.codahale.com/manual/)
* [log4j 2](https://logging.apache.org/log4j/2.x/)
* [scalalogging](https://github.com/typesafehub/scalalogging)
* [scalatest](http://www.scalatest.org/)
* [scopt](https://github.com/scopt/scopt)

### sbt plugins
* the [ls.implicit.ly](http://ls.implicit.ly/) [plugin](https://github.com/softprops/ls-sbt)
* [scalastyle](http://www.scalastyle.org/)
* [sbt-buildinfo](https://github.com/sbt/sbt-buildinfo)
* [sbt-dependency-graph](https://github.com/jrudolph/sbt-dependency-graph)
* [sbt-idea](https://github.com/mpeltonen/sbt-idea)
* [sbt-pack](https://github.com/xerial/sbt-pack)
* [sbt-stats](https://github.com/orrsella/sbt-stats)
* [sbt-updates](https://github.com/rtimush/sbt-updates)

## Usage

### Install giter8.
Directions [here](https://github.com/n8han/giter8).

### Use it.
```
g8 knucklesandwich/github-scala-app
```

## THANX

To all who build awesome open source projects.

And especially the people who work on the projects that this template uses.




name := "IRSystem"

version := "0.1"

scalaVersion := "2.11.8"

resolvers ++= Seq(
  "jitpack" at "https://jitpack.io",
  "Artima Maven Repository" at "http://repo.artima.com/releases"
)

libraryDependencies ++= Seq(
  "org.jsoup" % "jsoup" % "1.6.1",
  "com.github.gaocegege" % "scrala" % "0.1.5",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0",
  "net.debasishg" %% "redisclient" % "3.2",
  "org.scalikejdbc" %% "scalikejdbc" % "2.5.0",
  "org.scalikejdbc" %% "scalikejdbc-config"  % "2.5.0",
  "org.postgresql" % "postgresql" % "9.4.1211",
  "ch.qos.logback" % "logback-classic" % "1.1.7",
  "org.scalactic" %% "scalactic" % "3.0.0",
  "org.scalatest" %% "scalatest" % "3.0.0" % "test"
)
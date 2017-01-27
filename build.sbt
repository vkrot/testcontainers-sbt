organization := "org.testcontainers"

name := "testcontainers-sbt-check"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq (
  "org.testcontainers" % "postgresql" % "1.1.8" % "test",
  "org.postgresql" % "postgresql" % "9.4.1212.jre7" % "test",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)

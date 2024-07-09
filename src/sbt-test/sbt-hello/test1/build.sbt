import sbt.Keys._

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / organization := "ru.dvi"

ThisBuild / scalaVersion := "2.12.19"


lazy val root = (project in file(".")).
  settings(
    scalaVersion := "2.12.19",
    sbtVersion := "1.7.1"
  )
// .enablePlugins(ru.dvi.sbthello.q)
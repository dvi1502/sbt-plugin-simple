
ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / organization := "ru.dvi"

val ivyLocal = Resolver.file("local", file(Path.userHome.absolutePath + "/.ivy2/local"))(Resolver.ivyStylePatterns)
//externalResolvers := Seq(ivyLocal)

lazy val root = (project in file("."))
  .enablePlugins(SbtPlugin)
  .settings(

    name := "sbt-hello",

    pluginCrossBuild / sbtVersion := {
      scalaBinaryVersion.value match {
        case "2.12" => "1.4.7" // set minimum sbt version
      }
    },

    //Для публикации в локальном репозитории Maven
    // sbt>publishM2
    publishTo := Some(MavenCache("local-maven", file("~/.m2/"))),

    //Чтобы опубликовать в локальном репозитории Ivy:
    // sbt>publishLocal
    publishTo := Some(ivyLocal)

  )





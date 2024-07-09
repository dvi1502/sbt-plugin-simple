package sbthello

import sbt._
import Keys._


object HelloPlugin extends AutoPlugin {

  override def trigger = allRequirements

  object autoImport {
    val helloGreeting = settingKey[String]("greeting")
    val hello = taskKey[Unit]("say hello")
  }

  import autoImport._

  // xxx in Global
  override lazy val globalSettings: Seq[Setting[_]] = Seq(
    helloGreeting := "hi",
  )

  // ThisBuild / xxx
  override def buildSettings: Seq[Setting[_]] = Nil

  override lazy val projectSettings: Seq[Setting[_]] = Seq(
    hello := {
      val s = streams.value
      val g = helloGreeting.value
      s.log.info(g)
    }
  )


}


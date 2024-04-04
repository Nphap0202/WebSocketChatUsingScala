ThisBuild / scalaVersion := "2.13.9"

ThisBuild / version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """ChatTry""",
    libraryDependencies ++= Seq(
      guice,
      "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.0" % Test,
      "com.vmunier" % "scalajs-scripts_2.13" % "1.3.0",
      "com.typesafe.play" % "play-slick_2.13" % "5.3.0",
      "com.typesafe.slick" % "slick-codegen_2.13" % "3.5.0"
    )
  )
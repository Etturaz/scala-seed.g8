import Dependencies._

ThisBuild / scalaVersion := "2.13.2"
ThisBuild / version := "$version$"
ThisBuild / organization := "com.github"
ThisBuild / organizationName := "Etturaz"



lazy val root = (project in file("."))
  .settings(
    name := "$name;format="Camel"$",
    libraryDependencies ++= Seq(scalaTest % scalaTestVersion % Test,
                               scalaCheck % scalaCheckVersion % Test),

    scalacOptions ++= Seq("-Yrangepos", "-unchecked", "-deprecation", "-feature")
  )

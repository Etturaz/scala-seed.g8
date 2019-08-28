import Dependencies._

ThisBuild / scalaVersion := "2.13.0"
ThisBuild / version := "$version$"
ThisBuild / organization := "com.github"
ThisBuild / organizationName := "Etturaz"

val scalaTestVersion = "$scalatest_version$"
val semanticdbVersion = "$semanticdb_version$"

lazy val root = (project in file("."))
  .settings(
    name := "$name;format="Camel"$",
    libraryDependencies ++= Seq(
      scalaTest % scalaTestVersion % Test
    ),
    addCompilerPlugin(
      "org.scalameta" % "semanticdb-scalac" % semanticdbVersion cross CrossVersion.full
    ),
    scalacOptions ++= Seq("-Yrangepos", "-unchecked", "-deprecation", "-feature")
  )

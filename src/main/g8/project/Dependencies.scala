import sbt._

object Dependencies {
  //ScalaTest
  lazy val scalaTest = "org.scalatest" %% "scalatest"
  lazy val scalaTestVersion = "$scalatest_version$"
  
  //ScalaCheck
  lazy val scalaCheck = "org.scalacheck" %% "scalacheck"
  lazy val scalaCheckVersion = "$scalacheck_version$"
  
  //SemanticDB
  lazy val semanticdbVersion = "$semanticdb_version$"
}

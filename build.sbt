import Dependencies._

ThisBuild / scalaVersion := "2.13.0"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "dev.profunktor"
ThisBuild / organizationName := "ProfunKtor"

lazy val root = (project in file("."))
  .settings(
    name := "examples",
    scalacOptions += "-Ymacro-annotations",
    scalafmtOnCompile := true,
    libraryDependencies ++= Seq(
      CompilerPlugins.kindProjector,
      CompilerPlugins.betterMonadicFor,
      Libraries.cats,
      Libraries.catsEffect,
      Libraries.catsMeowMtlCore,
      Libraries.catsMeowMtlEffects,
      Libraries.console4cats,
      Libraries.derevoCats,
      Libraries.derevoTagless,
      Libraries.fs2,
      Libraries.newtype,
      Libraries.refinedCore
    )
  )

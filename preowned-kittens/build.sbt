// import Dependencies._

// lazy val root = (project in file(".")).
//   settings(
//     inThisBuild(List(
//       organization := "com.example",
//       scalaVersion := "2.12.3",
//       version      := "0.1.0-SNAPSHOT"
//     )),
//     name := "Hello",
//     libraryDependencies += scalaTest % Test
//   )

name := "preowned-kittens"
version := "1.0"

libraryDependencies +=
  "org.specs2" % "specs2_2.10" % "1.14" % "test"

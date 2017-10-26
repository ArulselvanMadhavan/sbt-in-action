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

// All Task Definitions go here
val gitHeadCommitSha = taskKey[String](
  "Determines the current git commit SHA"
)

val makeVersionProperties = taskKey[Seq[File]]("Makes a version.properties file")
val taskA = taskKey[String]("taskA")
val taskB = taskKey[String]("taskB")
val taskC = taskKey[String]("taskC")


makeVersionProperties := {
    val propFile = new File((resourceManaged in Compile).value, "version.properties")
    val content = "version=%s" format (gitHeadCommitSha.value)
    IO.write(propFile, content)
    Seq(propFile)
}

name := "preowned-kittens"
version := "1.0"

libraryDependencies +=
  "org.specs2" % "specs2_2.10" % "1.14" % "test"

gitHeadCommitSha := Process("git rev-parse HEAD").lines.head

taskA := {
  val b = taskB.value;
  val c = taskC.value;
  "taskA"
}

taskB := {
  Thread.sleep(5000);
  "taskB"
}

taskC := {
  Thread.sleep(5000);
  "taskC"
}

resourceGenerators in Compile +=
  makeVersionProperties

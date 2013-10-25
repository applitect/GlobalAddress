name := "Global Address"

version := "0.0.1"

libraryDependencies ++= Seq(
    "junit" % "junit" % "4.10",
    "com.novocode" % "junit-interface" % "0.10-M1" % "test",
    "log4j" % "log4j" % "1.2.17",
    "org.scalatest" %% "scalatest" % "1.9.2" % "test->default"
)

autoScalaLibrary := false

crossPaths := false

EclipseKeys.projectFlavor := EclipseProjectFlavor.Java


ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "zio"
  )
//ZIO
libraryDependencies += "dev.zio" %% "zio" % "2.0.0-M4"
libraryDependencies += "dev.zio" %% "zio-streams" % "2.0.0-M4"
//Caliban
libraryDependencies += "com.github.ghostdogpr" %% "caliban" % "1.4.0"
//libraryDependencies += "com.github.ghostdogpr" %% "caliban-http4s"     % "1.4.0" // routes for http4s
//libraryDependencies += "com.github.ghostdogpr" %% "caliban-akka-http"  % "1.4.0" // routes for akka-http
//libraryDependencies += "com.github.ghostdogpr" %% "caliban-play"       % "1.4.0" // routes for play
libraryDependencies += "com.github.ghostdogpr" %% "caliban-zio-http"   % "1.4.0" // routes for zio-http
libraryDependencies += "com.github.ghostdogpr" %% "caliban-cats"       % "1.4.0" // interop with cats effect
//libraryDependencies += "com.github.ghostdogpr" %% "caliban-monix"      % "1.4.0" // interop with monix
//libraryDependencies += "com.github.ghostdogpr" %% "caliban-tapir"      % "1.4.0" // interop with tapir
//libraryDependencies += "com.github.ghostdogpr" %% "caliban-federation" % "1.4.0" // interop with apollo federation
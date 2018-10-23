name := "StreamingWeb"
 
version := "1.0" 
      
lazy val `streamingweb` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
      
scalaVersion := "2.12.2"

libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice

  )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )
/*
libraryDependencies ++= Seq(
  "com.wordnik" %% "swagger-play2" % "1.6.0" exclude("org.reflections", "reflections"),
"org.reflections" % "reflections" % "0.9.8" notTransitive ()
)*/

libraryDependencies += "io.swagger" %% "swagger-play2" % "1.6.0"
libraryDependencies +="org.webjars" % "swagger-ui" % "2.2.0"
libraryDependencies += "org.webjars" %% "webjars-play" % "2.6.3"

val catsVersion = "2.0.0"
val catsCore = "org.typelevel" %% "cats-core" % catsVersion
val catsFree = "org.typelevel" %% "cats-free" % catsVersion
val catsMtl = "org.typelevel" %% "cats-mtl-core" % "0.7.0"

val simulacrum = "com.github.mpilquist" %% "simulacrum" % "0.19.0"
val macroParadise = compilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)
val kindProjector = compilerPlugin("org.spire-math" %% "kind-projector" % "0.9.10")
val resetAllAttrs = "org.scalamacros" %% "resetallattrs" % "1.0.0"

val specs2Version = "4.8.1" // use the version used by discipline
val specs2Core  = "org.specs2" %% "specs2-core" % specs2Version
val specs2Scalacheck = "org.specs2" %% "specs2-scalacheck" % specs2Version
val scalacheck = "org.scalacheck" %% "scalacheck" % "1.14.2"

lazy val root = (project in file(".")).
  settings(
    organization := "com.example",
    name := "something",
//     scalaVersion := "2.12.10",
   libraryDependencies ++= Seq(
      catsCore,
      catsFree,
      catsMtl,
      simulacrum,
      specs2Core % Test, specs2Scalacheck % Test, scalacheck % Test,
      macroParadise, kindProjector, 
      resetAllAttrs
    ),
    scalacOptions ++= Seq(
      "-deprecation",
      "-encoding", "UTF-8",
      "-Ypartial-unification",
      "-feature",
      "-language:_"
    )
  ) 

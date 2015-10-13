//The MIT License (MIT)
//
//Copyright (c) 2015 Stephan M. February

//Leave one line of space between all expressions in this file
//If you don't sbt will balk

name := "PlayFromScratch"   //The name of your project

version := "1.0"     //The version of your project

lazy val `playfromscratch` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

//Play Framework fudges around with source directory settings
//for sbt. So if you want to have a traditional "mavent-style"
//src folder, you need to add this line, otherwise all sources
//must go under "project" folder

scalaSource in Compile := baseDirectory.value / "src"


//Older versions of Play used a static routes generator
//That meant you needed to have a companion object on
//all your controllers. This setting fixes that so now
//you can use class as your controller. Decorate
//your classes with @Singleton for singleton behaviour
//

fork := true

routesGenerator := InjectedRoutesGenerator



import sbt._

class LetsBuildACompilerProject(info: ProjectInfo) extends DefaultProject(info) {
	// repositories
	val scalaTools = "Scala-Tools" at "http://scala-tools.org/repo-releases"

	// dependencies
	val specs = "org.scala-tools.testing" % "specs" % "1.6.1"
}
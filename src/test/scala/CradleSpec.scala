package net.al3x.letsbuildacompiler.test

import org.specs._
import scala.io.Source

object CradleSpec extends Specification {
  "the stupid cradle" should {
    var cradle = null

    "emit assembly for a single number input" in {
      val input = Source.fromString("1")
      val cradle = new Cradle(input)
      cradle.init
      cradle.expression mustEqual "\tMOVE #1,D0"
    }
  }
}
package net.al3x.letsbuildacompiler

import scala.io.Source


class Cradle(input: Source) {
  var look: Char = ' '

  // Read New Character From Input Stream
  def getChar: Char = {
    look = input.next
    look
  }

  // Report an Error
  // throw new TypeOfException("error message")

  // Report Error and Halt
  // throw new TypeOfException("error message"); exit(-1)

  // Report What Was Expected
  def expected(s: String) = {
    println("expected " + s)
    System.exit(-1)
  }

  def expected(c: Char) = {
    println("expected " + c.toString)
    System.exit(-1)
  }

  // Match a Specific Input Character
  def matchChar(c: Char) = {
    if (look == c) {
      getChar
    } else {
      expected(c)
    }
  }

  // Recognize an Alpha Character
  // char.isLetter

  // Recognize a Decimal Digit
  // char.isDigit

  // Get an Identifier
  def getName: Char = {
    if (!look.isLetter) {
      expected("Name")
    } else {
      return look
    }
    getChar
  }

  // Get a Number
  def getNum: Char = {
    if (!look.isDigit) {
      expected("Integer")
    } else {
      return look
    }
    getChar
  }

  // Output a String with Tab
  def emit(s: String) = "\t" + s

  // Output a String with Tab and CRLF
  def emitLn(s: String) = emit(s)

  // Parse and Translate a Math Expression
  def expression = {
    emitLn("MOVE #" + getNum + ",D0")
  }

  // Initialize
  def init = getChar
}


object Cradle {
  def main(args: Array[String]) {
    val c = new Cradle(Source.fromInputStream(System.in))
    c.init
    c.expression
  }
}

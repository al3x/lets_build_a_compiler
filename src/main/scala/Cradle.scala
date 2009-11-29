package net.al3x.letsbuildacompiler

import java.nio.CharBuffer


class Cradle(input: CharBuffer) {
  var look: Char = ' '

  // Read New Character From Input Stream
  def getChar = {
    look = input.get
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
  def getName(c: Char) = {
    if (!look.isLetter) {
      expected("Name")
    }

    getChar
  }

  // Get a Number
  def getNum(c: Char) = {
    if (!look.isDigit) {
      expected("Integer")
    }

    getChar
  }

  def emit(s: String) = print("\t" + s)
  def emitLn(s: String) = println(emit(s))

  def init = getChar

}
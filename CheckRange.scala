package com.mySource

import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object CheckRange {


    def main(args: Array[String]) {
        val stdin = scala.io.StdIn
        val N = stdin.readLine.trim.toInt
              
        N match {
            case x if x % 2 != 0 => println("Weird")
            case x if x % 2 == 0 && x >= 2 && x <= 5 => println("Not Weird")
            case x if x % 2 == 0 && x >= 6 && x <= 20 => println("Weird")
            case x if x % 2 == 0 && x >= 20 => println("Not Weird")
        }
    }
}

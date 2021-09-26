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

object Solution {

    // Complete the solve function below.
    def solve(meal_cost: Double, tip_percent: Int, tax_percent: Int) : Int = {
        
       Math.round(meal_cost.toFloat+((meal_cost * tip_percent)/100).toFloat + ((meal_cost * tax_percent)/100).toFloat)
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val meal_cost = 200//stdin.readLine.trim.toDouble

        val tip_percent = 8//stdin.readLine.trim.toInt

        val tax_percent = 15//stdin.readLine.trim.toInt

        println(solve(meal_cost, tip_percent, tax_percent))
    }
}

package com.hello.scala.test

import Array.ofDim

object HelloScala{
  
  def main(args : Array[String]): Unit={
    myListFunc()
  }
  
  
  def myTwoNum(x: Int, y: Int): Int = {
    if(x == y) (x+y) *3 else (x+y)
  }
  
  def absDiff(n : Int): Int = {
    var abs_diff = Math.abs(n - 51)
    if(n > 51) 3 * abs_diff else abs_diff
  }
  
  def return30(x: Int, y :Int): Boolean = {
    if(x == 30 || y == 30 || x+y == 30) 
      true
    else
      false
  }
  
 def returnWithIf(str: String): String = {
   if(str.startsWith("If"))
     str
   else 
     ("If").concat(str)
 }
 
 def tryOfDim() = {
   val str  = "This is a list"
   val myList : List[String] = str.split(" ").toList
   var newStr = ""

   var newList = myList.reverse
   
   
   for(strL <- newList){
     println(strL)
     newStr = newStr.concat(strL).concat(" ")
   }
     
   println(newStr)
   
 }
 
 def myListFunc(): Unit = {
   var nums = List.range(1 , 20)
   var newList = nums.flatMap{element => List.fill(3)(element)}
   println(newList)
   var evens = nums.filter(_%2 == 0)
   println("Even"+evens)
   var odds = nums.filter(_%2 != 0)
   println(odds)
   
   
   
 }
 
}
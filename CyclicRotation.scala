

package com.mySource

object CyclicRotation extends App {
  
  solution(Array(3,9,5,6,7,8),3)
  
  def solution(a: Array[Int], k: Int): Array[Int] = {
    var len: Int = a.length
    var outArr : Array[Int] = new Array[Int](len)
    var j = 0
    for(i <- 0 to len-1){
      j = (i+k) % len
      // println("i="+i+"..k="+k+"..j="+j+"..len="+len)
      outArr(j) = a(i)
      // println(outArr(j) +"="+ a(i))

    }
    for(num <- outArr){
      print(num+"  ")
    }
    outArr
  }
}

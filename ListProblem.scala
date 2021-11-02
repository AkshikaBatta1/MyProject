import scala.collection._
import scala.collection.mutable.ListBuffer

/**
 * Given a list `as` of type List[A] and a function `f` of type `A =>
 * B`, return a list that is the largest subset of `as` for which
 * `f(a)` is distinct.
 *
 * For example,
 *   distinctBy(List(1, 2, 11, 333, 444))(String.valueOf(_).length)
 *
 * Should return
 *  List(1, 11, 333)
 *
 * When an `a` is selected to be included in the result, it should be
 * the first `a` in the input list that produces the particular `b`.
 * That is, `List(2, 11, 444) would not be a valid result*/
object MySolution {
  def main(args: Array[String]): Unit = {
    var result = distinctBy(List(1, 2, 11, 333, 444))(String.valueOf(_).length)
    println(result)
  }
  def distinctBy[A,B](as:List[A])(f: A => B): List[A] = {
    var myList = ListBuffer[A]()
    var set = Set[B]()
    for(a <- as){
      val b = f(a)
      if(!set(b)){
        set += b
        myList = myList.append(a)
      }
    }
    myList.toList
  }
}

package week01.main.scala

import scala.annotation.tailrec

object Main {
  def main(args: Array[String]) {
    val maxRows = 10
    println("Pascal's Triangle")
    for (row <- 0 to maxRows) {
      for (col <- 0 to row) {
        if (col == 0) {
          print(spaces((maxRows + 1 - row) / 2))
        }
        print(pascal(col, row) + "\t")
      }
      println()
    }

    for (i <- 0 to 10)
      print(fibonacci(i) + " ");
  }

  def spaces(n: Int): String = {
    var s = ""
    for (i <- 0 to n)
      s = s + "\t"
    return s
  }

  /*  
      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1
  
  00 -> 1
  10 -> 1
  11 -> 1
  20 -> 1
  21 -> 2
  22 -> 1
  30 -> 1
  31 -> 3
  32 -> 3
  33 -> 1
  40 -> 1
  41 -> 4
  42 -> 6
  43 -> 4
  44 -> 1
   
*/

  def pascal(c: Int, r: Int): Int = {
    //    pascal(c - 1, r - 1) + pascal(c, r - 1)
    def op(c: Int, r: Int, counter: => Int): Int = {
      if (c == 0 || c == r) counter + 1
      else
        op(c, r - 1, op(c - 1, r - 1, counter))
    }
    op(c, r, 0)
  }

  /*

0 -> 0
1 -> 1
2 -> 1 + 0 -> 1
3 -> 1 + 1 -> 2
4 -> 2 + 1 -> 3
 
*/

  //  @tailrec
  def fibonacci(n: Int): Int = {
    //    if (n == 0 || n == 1) n
    //    else
    //      fibonacci(n - 1) + fibonacci(n - 2)

    //    def op(n: Int, counter: Int): Int = {
    //      if (n == 0 || n == 1) counter + n
    //      else
    //        op(n - 1, op(n - 2, counter))
    //    }
    //
    //    op(n, 0)

    def op(n: Int, min1: Int, min2: Int): Int = {
      if (n == 0 || n == 1) n + min1 + min2
      else op(n - 1, n - 1, n - 2)
    }
    op(n, 0, 0)
  }

}
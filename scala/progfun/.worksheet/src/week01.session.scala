package week01

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(41); val res$0 = 
  1 + 3;System.out.println("""res0: Int(4) = """ + $show(res$0));$skip(44); 
  def abs(x: Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(313); 

  def sqrt(x: Double) = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0)
  };System.out.println("""sqrt: (x: Double)Double""");$skip(12); val res$1 = 

  sqrt(2);System.out.println("""res1: Double = """ + $show(res$1));$skip(10); val res$2 = 
  sqrt(4);System.out.println("""res2: Double = """ + $show(res$2));$skip(13); val res$3 = 
  sqrt(1e-6);System.out.println("""res3: Double = """ + $show(res$3));$skip(13); val res$4 = 
  sqrt(1e60);System.out.println("""res4: Double = """ + $show(res$4));$skip(143); 

	def factorial(n: Int): Int = {
		
		def op(n: Int, counter: Int): Int =
			if (n == 0) counter else op(n - 1, counter * n)
			
		op(n, 1)
	};System.out.println("""factorial: (n: Int)Int""");$skip(14); val res$5 = 
	factorial(4);System.out.println("""res5: Int = """ + $show(res$5))}
}

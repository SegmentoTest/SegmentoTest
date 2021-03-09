class FibonacciTailrec {
  import scala.annotation.tailrec

  def FibonacciTailrec(n: Int): Int = {
    @tailrec
    def FibonacciTailrec(n: Int, firstNumber: Int, secondNumber: Int): Int = {
      n match {
        case 0 => 0
        case 1 => firstNumber
        case _ => Tailrec(n-1, secondNumber, firstNumber+secondNumber)
      }
    }

    FibonacciTailrec(n, 0 , 1)
  }
}

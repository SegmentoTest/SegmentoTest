class FibonacciRecursive {
  def FibonacciRec(n: Int): Int = {
    n match{
      case 0 | 1 => 0
      case 2 => 1
      case _ => FibonacciRec(n-1) + FibonacciRec(n-2)
    }
  }

}

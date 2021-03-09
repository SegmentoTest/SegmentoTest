class FibonacciFunction {

  def FibonacciFunc(n: Int): Int = {
    var currentSum = 0
    var firstNumber = 0
    var SecondNumber = 1
    var i = 0
    while (i < n - 1 ) {
      currentSum = firstNumber + SecondNumber
      firstNumber = SecondNumber
      SecondNumber = currentSum
      i = i + 1
    }

    firstNumber

  }

}

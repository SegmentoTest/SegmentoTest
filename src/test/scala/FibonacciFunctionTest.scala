class FibonacciFunctionTest extends org.scalatest.FunSuite {
  test("FibonacciFunction") {
    val obj = new FibonacciFunction()
    val res1 = obj.FibonacciFunc(10)
    val res2 = obj.FibonacciFunc(20)
    assert(res1==34 && res2==4181)
  }
}

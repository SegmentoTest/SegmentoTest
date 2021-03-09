class FibonacciRecursiveTest extends org.scalatest.FunSuite {
  test("FibonacciRecursive") {
    val obj = new FibonacciRecursive()
    val res1 = obj.FibonacciRec(1)
    val res2 = obj.FibonacciRec(5)
    val res3 = obj.FibonacciRec(15)
    assert(res1==0 && res2==3 && res3==377)
  }
}

class FibonacciTailrecTest extends org.scalatest.FunSuite {
  test("FibonacciTailrec") {
    val obj = new FibonacciTailrec()
    val res1 = obj.FibonacciTailrec(3)
    val res2 = obj.FibonacciTailrec(13)
    val res3 = obj.FibonacciTailrec(23)
    assert(res1==1 && res2==144 && res3==17711)
  }
}

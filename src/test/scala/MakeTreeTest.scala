class MakeTreeTest extends org.scalatest.FunSuite {
  test("CreateTree") {
    val obj = new MakeTree()
    val res1 = obj.createTree(Seq(Point("0", "0")))
    val res2 = obj.createTree(Seq(Point("0", "0"), Point("1", "0"), Point("2", "0"), Point("1", "2")))
    val res3 = obj.createTree(Seq(Point("1", "0"), Point("2", "0"), Point("3", "0"),
                                  Point("4", "1"), Point("5", "1"), Point("6", "1"),
                                  Point("7", "2"), Point("8", "2"), Point("9", "2"),
                                  Point("10", "3"), Point("11", "3"), Point("12", "3"),
                                  Point("1", "1"), Point("   ", "2"),
                                  Point("10", "4"), Point("11", "4"), Point("12", "4")))
    assert(res1==Map() &&
           res2==Map("0" -> List(Map("1" -> List()), Map("2" -> List(Map("1" -> List()))))) &&
           res3==Map("0" -> List(Map("1" -> List(Map("4" -> List(Map("10" -> List()),
                               Map("11" -> List()), Map("12" -> List()))), Map("5" -> List()),
                               Map("6" -> List()))), Map("2" -> List(Map("7" -> List()), Map("8" -> List()),
                               Map("9" -> List()), Map("   " -> List()))),
                               Map("3" -> List(Map("10" -> List()), Map("11" -> List()), Map("12" -> List()))))))
  }
}

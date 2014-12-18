object ex2 {
  def main(args: Array[String]) {
    val a1 = Array(1, 2, 3, 4, 5)
    val a2 = Array(1, 2, 3, 4)
    val a3 = Array(1, 2)

    assert(a1.grouped(2).map(_.reverse).flatten.toArray.deep == Array(2, 1, 4, 3, 5).deep)
    assert(a2.grouped(2).map(_.reverse).flatten.toArray.deep == Array(2, 1, 4, 3).deep)
    assert(a3.grouped(2).map(_.reverse).flatten.toArray.deep == Array(2, 1).deep)
  }
}

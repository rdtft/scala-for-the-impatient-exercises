object ex3 {
  def main(args: Array[String]) {
    val a1 = Array(1, 2, 3, 4, 5)
    val a2 = Array(1, 2, 3, 4)
    val a3 = Array(1, 2)

    val res1 = (for (a <- a1.grouped(2)) yield a.reverse).flatten.toArray
    val res2 = (for (a <- a2.grouped(2)) yield a.reverse).flatten.toArray
    val res3 = (for (a <- a3.grouped(2)) yield a.reverse).flatten.toArray

    assert(res1.deep == Array(2, 1, 4, 3, 5).deep)
    assert(res2.deep == Array(2, 1, 4, 3).deep)
    assert(res3.deep == Array(2, 1).deep)
  }
}

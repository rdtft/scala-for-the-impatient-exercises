object ex6 {
  def main(args: Array[String]) {
    val a1 = Array(1.0, 2.5, 2.5, 4)
    val a2 = a1.toBuffer

    val res1 = a1.sorted.reverse
    val res2 = a2.sorted.reverse

    assert(res1.deep == Array(4, 2.5, 2.5, 1).deep)
    assert(res2.toArray.deep == Array(4, 2.5, 2.5, 1).deep)
  }
}

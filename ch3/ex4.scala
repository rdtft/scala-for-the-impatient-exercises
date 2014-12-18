object ex4 {
  def main(args: Array[String]) {
    val a = Array(-1, 3, 0, 2, -5, 4)
    val b = a.filter(_ <= 0)

    assert(b.deep == Array(-1, 0, -5).deep)
  }
}

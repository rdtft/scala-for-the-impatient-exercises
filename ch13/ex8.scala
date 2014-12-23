object ex8 {
  def main(args: Array[String]) {
    val a = (1 to 6).toArray
    assert(a.grouped(2).toArray.deep == Array(Array(1, 2), Array(3, 4), Array(5, 6)).deep)
  }
}

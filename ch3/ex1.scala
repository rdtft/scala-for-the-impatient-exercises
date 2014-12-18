object ex1 {
  def main(args: Array[String]) {
    val res: Array[Int] = (for (i <- 0 until 5) yield i).toArray
    assert(res.deep == Array(0, 1, 2, 3, 4).deep)
  }
}

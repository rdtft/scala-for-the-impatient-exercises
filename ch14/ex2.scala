object ex2 {
  def main(args: Array[String]) {
    assert(swap((1, 2)) == (2, 1))
  }

  def swap(p: (Int, Int)) = p match {
    case (x, y) => (y, x)
  }
}

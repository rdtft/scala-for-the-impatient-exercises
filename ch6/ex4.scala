object ex4 {
  def main(args: Array[String]) {
    val p1 = new Point(0, 0)
    val p2 = Point(1, 1)
    assert(p1.x == 0)
    assert(p1.x == 0)
    assert(p2.x == 1)
    assert(p2.x == 1)
  }

  class Point(val x: Int, val y: Int)

  object Point {
    def apply(x: Int, y: Int) = new Point(x, y)
  }
}

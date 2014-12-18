object ex2 {
  import java.awt.Point

  def main(args: Array[String]) {
    val p1 = new OrderedPoint(1, 1)
    val p2 = new OrderedPoint(1, -1)
    val p3 = new OrderedPoint(2, 1)

    assert(p1 > p2)
    assert(p2 < p1)
    assert(p3 > p2)
  }

  class OrderedPoint(x: Int, y: Int) extends Point(x, y) with scala.math.Ordered[Point] {
    def compare(that: Point) = { if (x <= that.x && y < that.y) -1 else 1 }
  }
}

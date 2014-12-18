object ex6 {
  def main(args: Array[String]) {
    val rectangle = new Rectangle(new Point(1, 10), new Point(5, 42))
    val circle = new Circle(new Point(42, 2), 5)
    assert(rectangle.centerPoint.x == 3)
    assert(rectangle.centerPoint.y == 26)
    assert(circle.centerPoint.x == 42)
    assert(circle.centerPoint.y == 2)
  }

  abstract class Shape {
    def centerPoint: Point
  }

  class Point(val x: Int, val y: Int)

  class Rectangle(p1: Point, p2: Point) extends Shape {
    def centerPoint = new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2)
  }

  class Circle(override val centerPoint: Point, radius: Int) extends Shape
}

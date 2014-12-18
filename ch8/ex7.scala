object ex7 {
  def main(args: Array[String]) {
    val square = new Square()
    assert(square.x == 0)
    assert(square.y == 0)
    assert(square.width == 0)
  }

  class Square(x: Int, y: Int, width: Int) extends java.awt.Rectangle(x, y, width, width) {
    def this() = this(0, 0, 0)
    def this(width: Int) = this(0, 0, width)
  }
}

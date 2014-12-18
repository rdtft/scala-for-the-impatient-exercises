object ex1 {
  def main(args: Array[String]) {
    val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
    egg.translate(10, -10)
    assert(egg.getX == 15)
    assert(egg.getY == 0)
    egg.grow(10, 20)
    assert(egg.getWidth ==  40)
  }

  trait RectangleLike {
    def getX(): Double
    def getY(): Double
    def getWidth(): Double
    def getHeight(): Double

    def setFrame(x: Double, y: Double, width: Double, height: Double)

    def translate(dx: Int, dy: Int) {
      setFrame(getX + dx, getY + dy, getWidth, getHeight)
    }

    def grow(h:Int, v:Int) {
      setFrame(getX - h, getY - v, getWidth + 2 * h, getHeight + 2 * v)
    }
  }
}

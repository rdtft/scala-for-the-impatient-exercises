object ex10 {
  def main(args: Array[String]) {
    val h = compose(f, g)
    assert(h(1) == None)
  }

  def f(x: Double) = if (x >= 0) Some(math.sqrt(x)) else None
  def g(x: Double) = if (x != 1) Some(1 / (x - 1)) else None

  def compose(f: (Double) => Option[Double], g: (Double) => Option[Double]) = {
    (x: Double) => f(x) match {
        case Some(value) => g(value)
        case None => None
    }
  }
}

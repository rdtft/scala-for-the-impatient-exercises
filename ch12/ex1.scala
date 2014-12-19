object ex1 {
  def main(args: Array[String]) {
    assert(values(x => x * x, -1, 1) == Vector((-1, 1), (0, 0), (1, 1)))
  }

  def values(fun: (Int) => Int, low: Int, high: Int) = {
    val range = (low to high)
    val res = range.map(fun)
    range.zip(res)
  }
}

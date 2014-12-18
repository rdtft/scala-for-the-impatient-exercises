object ex8 {
  def main(args: Array[String]) {
    val a = Array(1, 2, 3, 0, -10, 42, 3)
    assert(minmax(a) == (-10, 42))
  }

  def minmax(values: Array[Int]) = (values.min, values.max)
}

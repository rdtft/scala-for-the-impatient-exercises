object ex9 {
  def main(args: Array[String]) {
    val a = Array(3, 42, 42, 3, 1984)
    assert(lteqgt(a, 42) == (2, 2, 1))
  }

  def lteqgt(values: Array[Int], v: Int) = {
    (values.filter(_ < v).length,
      values.filter(_ == v).length,
      values.filter(_ > v).length)
  }
}

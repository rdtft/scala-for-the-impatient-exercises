object ex4 {
  def main(args: Array[String]) {
    assert(factorial(0) == 1)
    assert(factorial(5) == 120)
  }

  def factorial(x: Int) = 1.to(x).foldLeft(1)(_ * _)
}

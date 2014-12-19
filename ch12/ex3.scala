object ex3 {
  def main(args: Array[String]) {
    assert(factorial(0) == 1)
    assert(factorial(5) == 120)
  }

  def factorial(x: Int) = if (x == 0) 1 else 1.to(x).reduceLeft(_ * _)
}

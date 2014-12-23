object ex7 {
  def main(args: Array[String]) {
    val prices = List(5.0, 20.0, 9.95)
    val quantities = List(10, 2, 1)

    val fun = ((x: Double, y: Int) => x * y).tupled

    assert((prices zip quantities).map(fun) == List(50.0, 40.0, 9.95))
  }
}

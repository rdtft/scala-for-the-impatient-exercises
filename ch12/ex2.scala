object ex2 {
  def main(args: Array[String]) {
    val values = (-10 to 42).toList
    assert(values.reduceLeft(_.max(_)) == 42)
  }
}

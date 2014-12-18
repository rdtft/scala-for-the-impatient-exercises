object ex7 {
  def main(args: Array[String]) {
    val res = "Hello".foldLeft(1)(_ * _)
    assert(res == 825152896)
  }
}

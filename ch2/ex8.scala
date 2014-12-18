object ex8 {
  def main(args: Array[String]) {
    assert(product("Hello") == 825152896)
  }

  def product(s: String) = s.foldLeft(1)(_ * _)
}

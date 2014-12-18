object ex9 {
  def main(args: Array[String]) {
    assert(product("Hello") == 825152896)
  }

  def product(s: String): Int = {
    if (s.size > 0) s.head * product(s.tail)
    else 1
  }
}

object ex5 {
  def main(args: Array[String]) {
    assert(mkString(List(1, 2, 3)) == "[1, 2, 3]")
    assert(mkString(List(1)) == "[1]")
  }

  def mkString(items: Seq[Any],
    start: String = "[",
    sep: String = ", ",
    end: String = "]") = start + items.reduceLeft(_ + sep + _) + end
}

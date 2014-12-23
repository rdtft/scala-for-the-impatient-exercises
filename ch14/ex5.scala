object ex5 {
  def main(args: Array[String]) {
    val leaf = List(List(3, 8), 2, List(5))
    assert(leafSum(leaf) == 18)
  }

  def leafSum(leaf: Any): Int = leaf match {
    case x :: xs => leafSum(x) + leafSum(xs)
    case n: Int => n
    case Nil => 0
  }
}

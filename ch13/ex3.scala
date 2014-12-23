object ex3 {
  def main(args: Array[String]) {
    val l = List(0, 1, 2, 0, 3, 0, 4, 5)
    assert(remove(l, 0) == List(1, 2, 3, 4, 5))
  }

  def remove(l: List[Int], value: Int): List[Int] = l match {
    case Nil => Nil
    case `value`::xs => remove(xs, value)
    case x::xs => x::(remove(xs, value))
  }
}

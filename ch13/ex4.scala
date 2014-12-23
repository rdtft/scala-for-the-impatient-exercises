object ex4 {
  def main(args: Array[String]) {
    val a = List("Tom", "Fred", "Harry")
    val m = Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)

    assert(a.flatMap(m.get(_)) == List(3, 5))
  }
}

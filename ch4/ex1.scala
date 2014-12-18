object ex1 {
  def main(args: Array[String]) {
    val m1 = Map("book" -> 50, "bike" -> 4500, "immortality" -> 42)
    val m2 = for ((k, v) <- m1) yield (k, v - (v * 10) / 100)

    assert(m2("book") == 45)
    assert(m2("bike") == 4050)
    assert(m2("immortality") == 38)
  }
}

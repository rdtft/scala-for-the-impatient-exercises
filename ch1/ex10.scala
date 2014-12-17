object ex10 {
  def main(args: Array[String]) {
    val s = "Scala"
    assert(s.take(3) == "Sca")
    assert(s.drop(3) == "la")
    assert(s.takeRight(3) == "ala")
  }
}

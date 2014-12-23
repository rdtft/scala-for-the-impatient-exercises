object ex9 {
  def main(args: Array[String]) {
    val l: List[Option[Int]] = List(None, Some(1), Some(42), None, Some(7), None)
    assert(l.map(_.getOrElse(0)).sum == 50)
    assert(l.collect { case Some(value) => value }.sum == 50)
  }
}

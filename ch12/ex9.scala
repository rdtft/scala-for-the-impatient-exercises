object ex9 {
  def main(args: Array[String]) {
    val strings = Array("foo", "bar", "baz", "quux")
    val lengths = Array(3, 3, 3, 4)

    assert(corresponds(strings, lengths, (x: String, y: Int) => x.length == y))
    strings(1) = "fooo"
    assert(corresponds(strings, lengths, (x: String, y: Int) => x.length == y) == false)
  }

  def corresponds[A, B](seq1: Seq[A], seq2: Seq[B], fun:(A, B) => Boolean): Boolean = seq1.zip(seq2).map(x => fun(x._1, x._2)).contains(false) == false
}

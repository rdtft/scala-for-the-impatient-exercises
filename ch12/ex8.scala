object ex8 {
  def main(args: Array[String]) {
    val strings = Array("foo", "bar", "baz", "quux")
    val lengths = Array(3, 3, 3, 4)

    assert(strings.corresponds(lengths)(_.length == _))
    strings(1) = "fooo"
    assert(strings.corresponds(lengths)(_.length == _) == false)
  }
}

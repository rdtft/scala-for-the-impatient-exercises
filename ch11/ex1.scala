object ex1 {
  def main(args: Array[String]) {
    assert(3 + 4 -> 5 == (7 -> 5))
    // 3 -> 4 + 5
    // (3 -> 4) + 5
    // error: type mismatch
  }
}

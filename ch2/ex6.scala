object ex6 {
  def main(args: Array[String]) {
    var res = 1
    for (c <- "Scala") res *= c
    assert(res == 825152896)
  }
}

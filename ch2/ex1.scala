object ex1 {
  def main(args: Array[String]) {
    assert(signum(42) == 1)
    assert(signum(-42) == -1)
    assert(signum(0) == 0)
  }

  def signum(n : Int) = {
    if (n > 0) 1
    else if (n < 0) -1
    else 0
  }
}

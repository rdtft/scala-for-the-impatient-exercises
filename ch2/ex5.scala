object ex5 {
  def main(args: Array[String]) {
    countdown(5)
  }

  def countdown(n: Int) = for (i <- n to 0 by -1) println(i)
}

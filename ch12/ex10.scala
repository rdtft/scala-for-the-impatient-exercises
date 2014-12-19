object ex10 {
  def main(args: Array[String]) {
    unless (false) {
      println("Works!")
    }
  }

  def unless(condition: => Boolean)(block: => Unit) {
    if (!condition) {
      block
    }
  }
}

object ex1 {
  def main(args: Array[String]) {
    val c = new Counter()
    c.increment()
    c.increment()
    assert(c.curent == 2)
  }

  class Counter {
    private var value = 0
    def increment() { if (value + 1 < Int.MaxValue) value += 1 }
    def curent()= value
  }
}

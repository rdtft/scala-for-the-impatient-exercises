object ex3 {
  def main(args: Array[String]) {
    val t1 = new Time(7, 40)
    val t2 = new Time(7, 10)
    val t3 = new Time(8, 10)

    assert(t2.before(t1))
    assert(!t2.before(t2))
    assert(t2.before(t3))
  }

  class Time(private val hours: Int, private val minutes: Int) {
    def before(other: Time): Boolean = (hours * 60 + minutes) < (other.hours * 60 + other.minutes)
  }
}

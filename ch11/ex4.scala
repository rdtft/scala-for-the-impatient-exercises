object ex4 {
  def main(args: Array[String]) {
    val m1 = Money(1, 75)
    val m2 = Money(0, 50)
    val m3 = Money(2, 25)

    assert(m1 > m2)
    assert(m2 < m3)
    assert(m1 + m2 == m3)
  }

  class Money(val cents: Int) extends Ordered[Money] {
    def +(that: Money) = Money(cents + that.cents)
    def -(that: Money) = Money(cents - that.cents)
    def ==(that: Money) = cents == that.cents

    def compare(that: Money) = cents - that.cents
  }

  object Money {
    def apply(dollars: Int, cents: Int) = new Money(dollars * 100 + cents)
    def apply(cents: Int) = new Money(cents)
  }
}

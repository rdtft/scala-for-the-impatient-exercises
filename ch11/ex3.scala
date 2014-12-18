object ex3 {
  def main(args: Array[String]) {
    val f1 = Fraction(15, -6)
    val f2 = Fraction(1, 12)

    assert(f1.num == -5)
    assert(f1.den == 2)

    assert((f1 + f2).num == -29)
    assert((f1 + f2).den == 12)

    assert((f1 - f2).num == -31)
    assert((f1 - f2).den == 12)

    assert((f1 * f2).num == -15 / 3)
    assert((f1 * f2).den == 72 / 3)

    assert((f1 / f2).num == -180 / 6)
    assert((f1 / f2).den == 6 / 6)
  }


  class Fraction(n: Int, d: Int) {
    val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d)
    val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d)

    def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0
    def gcd(a: Int, b:Int): Int = if (b == 0) math.abs(a) else gcd(b, a % b)

    def +(that: Fraction) = Fraction(num * that.den + that.num * den, den * that.den)
    def -(that: Fraction) = Fraction(num * that.den - that.num * den, den * that.den)
    def *(that: Fraction) = Fraction(num * that.num, den * that.den)
    def /(that: Fraction) = Fraction(num * that.den, den * that.num)

    override def toString = num + "/" + den
  }

  object Fraction {
    def apply(n: Int, d: Int) = new Fraction(n, d)
  }
}

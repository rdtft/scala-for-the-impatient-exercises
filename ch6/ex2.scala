object ex2 {
  def main(args: Array[String]) {
    assert(InchesToCentimeters.convert(10) == 25.4)
    assert(GallonsToLiters.convert(1) == 3.78541178)
    assert(MilesToKilometers.convert(1) == 1.609344)
  }

  class Conversions(private val from: Double) {
    def convert(to: Int) = from * to
  }

  object InchesToCentimeters extends Conversions(2.54)
  object GallonsToLiters extends Conversions(3.78541178)
  object MilesToKilometers extends Conversions(1.609344)
}

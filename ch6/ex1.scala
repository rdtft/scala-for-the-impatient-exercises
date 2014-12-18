object ex1 {
  def main(args: Array[String]) {
    assert(Conversions.inchesToCentimeters(10) == 25.4)
    assert(Conversions.gallonsToLiters(1) == 3.78541178)
    assert(Conversions.milesToKilometers(1) == 1.609344)
  }

  object Conversions {
    def inchesToCentimeters(inches: Int) = inches * 2.54
    def gallonsToLiters(gallons: Int) = gallons * 3.78541178
    def milesToKilometers(miles: Int) = miles * 1.609344
  }
}

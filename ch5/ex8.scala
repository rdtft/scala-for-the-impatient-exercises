object ex8 {
  def main(args: Array[String]) {
    val car1 = new Car("Audi", "A3")
    val car2 = new Car("Audi", "A3", 2006)
    val car3 = new Car("Audi", "A3", 2006, "FF0001")

    assert(car1.manufacturer == "Audi")
    assert(car1.year == -1)
    assert(car2.name == "A3")
    assert(car2.license == "")
    assert(car3.year == 2006)
    assert(car3.license == "FF0001")
    car3.license = "FF0042"
    assert(car3.license == "FF0042")
  }

  class Car(val manufacturer: String, val name: String, val year: Int = -1, var license: String = "")
}

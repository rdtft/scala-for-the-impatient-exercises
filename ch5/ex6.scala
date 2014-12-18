object ex6 {
  def main(args: Array[String]) {
    val person = new Person()
    assert(person.age == 0)
    person.age = 42
    assert(person.age == 42)
    person.age = -42
    assert(person.age == 0)
  }

  class Person {
    private var privateAge = 0
    def age = privateAge
    def age_=(newValue: Int) { if (newValue < 0) privateAge = 0 else privateAge = newValue }
  }
}

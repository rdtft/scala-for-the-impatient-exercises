object ex7 {
  def main(args: Array[String]) {
    val person = new Person("Martin Odersky")
    assert(person.firstName == "Martin")
    assert(person.lastName == "Odersky")
  }

  class Person(name: String) {
    lazy val firstName = name.split(" ").head
    lazy val lastName = name.split(" ").last
  }
}

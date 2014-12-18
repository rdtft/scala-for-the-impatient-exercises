object ex10 {
  def main(args: Array[String]) {
    val employee1 = new Employee()
    val employee2 = new Employee("John Q. Private", 4200)
    assert(employee1.name == "John Q. Public")
    assert(employee1.salary == 0)
    assert(employee2.name == "John Q. Private")
    assert(employee2.salary == 4200.0)
  }

  class Employee(val name: String = "John Q. Public", var salary: Double = 0.0)
}

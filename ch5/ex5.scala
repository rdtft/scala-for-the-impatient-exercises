object ex5 {
  import scala.reflect.BeanProperty

  def main(args: Array[String]) {
    val student = new Student("Joe", 42)
    assert(student.getName == "Joe")
    assert(student.getId == 42)
    student.setName("Dmitriy")
    student.setId(16)
    assert(student.getName == "Dmitriy")
    assert(student.getId == 16)
  }

  class Student(@BeanProperty var name: String, @BeanProperty var id: Long)
}

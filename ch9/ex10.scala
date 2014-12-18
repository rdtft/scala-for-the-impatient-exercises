object ex10 {
  import scala.collection.mutable.ArrayBuffer
  import java.io.{ObjectOutputStream, ObjectInputStream, FileOutputStream, FileInputStream}

  def main(args: Array[String]) {
    val fred = new Person("Fred")
    val bob = new Person("Bob")
    val mike = new Person("Mike")

    mike.friends += fred
    mike.friends += bob

    val obj = Array(fred, bob, mike)

    val out = new ObjectOutputStream(new FileOutputStream("/tmp/ex10.object"))
    out.writeObject(obj)
    out.close()

    val in = new ObjectInputStream(new FileInputStream("/tmp/ex10.object"))
    val restoredObject = in.readObject.asInstanceOf[Array[Person]]

    assert(restoredObject(2).friends(0).name == restoredObject(0).name)
    assert(restoredObject(2).friends(1).name == restoredObject(1).name)
    assert(restoredObject(0) != fred)
    assert(restoredObject(0).name == fred.name)
  }

  class Person(val name: String) extends Serializable {
    val friends = new ArrayBuffer[Person]
  }
}

object ex5 {
  import scala.collection.JavaConversions.mapAsScalaMap
  import java.util.Scanner
  import java.io.File
  import java.util.TreeMap

  def main(args: Array[String]) {
    val in = new Scanner(new File("ex2.data"))
    var counts = new TreeMap[String, Int]

    while (in.hasNext()) {
      val word = in.next()
      counts += (word -> (counts.getOrElse(word, 0) + 1))
    }

    assert(counts("foo") == 2)
    assert(counts("baz") == 1)
    assert(counts("quux") == 3)

    println(counts.mkString("\n"))
  }
}

object ex9 {
  import scala.io.Source

  def main(args: Array[String]) {
    val frequencies = new scala.collection.mutable.LinkedHashMap[Char, Int]() with scala.collection.mutable.SynchronizedMap[Char, Int]
    val files = List("ex1.scala", "ex2.scala")

    files.par.foreach { (file) =>
      val content = Source.fromFile(file).mkString
      content.map((c: Char) => frequencies.synchronized { frequencies(c) = frequencies.getOrElse(c, 0) + 1 })
    }

    assert(frequencies('f') == 7)
  }
}

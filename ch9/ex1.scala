object ex1 {
  def main(args:Array[String]) {
    val reversed = scala.io.Source.fromFile("ex1.scala").getLines.toList.reverse
    assert(reversed.head == "// foo")
  }
}

// foo

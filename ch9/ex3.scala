object ex3 {
  def main(args:Array[String]) {
    val words: List[String] = scala.io.Source.fromFile("ex3.scala").mkString.split("\\s+").toList.filter(_.length >= 12)
    assert(words.last.stripLineEnd == "iiiiiiiiiiii")
  }
}

// iiiiiiiiiiii

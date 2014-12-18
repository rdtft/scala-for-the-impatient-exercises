object ex2 {
  def main(args:Array[String]) {
    val in = scala.io.Source.fromFile("ex2_in.txt")
    val out = in.getLines.toList.map( _.replaceAll("\t", "    "))

    println(out.mkString("\n"))
  }
}

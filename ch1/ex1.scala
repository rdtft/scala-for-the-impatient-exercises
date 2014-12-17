object ex1 {
  def main(args: Array[String]) {
    println("quux".getClass.getMethods.map(_.getName).mkString("[", ", ", "]"))
  }
}

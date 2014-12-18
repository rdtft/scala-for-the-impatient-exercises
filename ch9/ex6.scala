/*
"ex6 foo bar"
Make a regular expression searching for quoted strings
"like this, maybe with \" or \\" in a Java or C++ program.
Write a Scala program that prints out all such strings in a source file.
*/

object ex6 {
  def main(args: Array[String]) {
    val content = scala.io.Source.fromFile("ex6.scala").mkString
    val regex = """\"[^"+]+\"""".r
    val matched = regex.findFirstIn(content)
    // matched type Option[String]
    assert(matched.get == "\"ex6 foo bar\"")
  }
}

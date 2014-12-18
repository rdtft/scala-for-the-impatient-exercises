object ex8 {
  def main(args: Array[String]) {
    val content = scala.io.Source.fromURL("https://github.com/").mkString
    val pattern = "<img\\s+src=\"([^\"+]+)\"".r

    for (image <- pattern.findAllMatchIn(content)) println(image.group(1))
  }
}

object ex6 {
  def main(args: Array[String]) {
    val art1 = new ASCIIArt("""
     /\_/\ 
    ( ' ' )
    (  -  )
     | | | 
    (__|__)""")

    val art2 = new ASCIIArt(
    """
      .-----.
     / Hello \
    <  Scala |
     \ Coder /
      `----- """)

    println(art1 left art2)
    println(art1 bottom art2)
  }

  class ASCIIArt(val content: String) {
    val rows = content.split("\n")

    def left(second: ASCIIArt) = (rows, second.rows).zipped.map(_ + _).mkString("\n")
    def bottom(second: ASCIIArt) = content + second.content

    override def toString = content
  }
}

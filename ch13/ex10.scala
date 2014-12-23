object ex10 {
  import scala.io.Source

  def main(args: Array[String]) {
    val content = Source.fromFile("ex10.scala").mkString

    val frequencies = content.par.aggregate(new collection.immutable.HashMap[Char, Int]())(
      (m, c) => m + (c ->(m.getOrElse(c, 0) + 1)),
      (m1, m2) => m1 ++ m2.map{ case (k,v) => k -> (v + m1.getOrElse(k,0)) })

    assert(frequencies('c') == 16)
  }
}

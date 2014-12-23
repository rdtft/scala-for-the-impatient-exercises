object ex2 {
  import scala.collection.mutable.Map

  def main(args: Array[String]) {
    val res = indexes("Mississippi")
    assert(res('i') == List(1, 4, 7, 10))
  }

  def indexes(value: String) = {
    (Map[Char, List[Int]]() /: value.distinct) {
      (m, c) => m + (c -> value.zipWithIndex.filter(_._1 == c).map(_._2).toList)
    }
  }
}

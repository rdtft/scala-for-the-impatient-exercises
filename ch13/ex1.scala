object ex1 {
  import scala.collection.mutable.Map

  def main(args: Array[String]) {
    val res = indexes("Mississippi")
    assert(res('i') == Set(1, 4, 7, 10))
  }

  def indexes(value: String) = {
    val res = Map[Char, Set[Int]]()
    for (c <- value.distinct)
      res += (c -> value.zipWithIndex.filter(_._1 == c).map(_._2).toSet)
    res
  }
}

object ex7 {
  def main(args: Array[String]) {
    val pairs = (1 to 3) zip (11 to 13)

    assert(pairs.map(adjustToPair(_ + _)) == Vector(12, 14, 16))
  }

  def adjustToPair(fun: (Int, Int) => Int)(pair: (Int, Int)) = fun(pair._1, pair._2)
}

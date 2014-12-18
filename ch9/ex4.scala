object ex4 {
  def main(args: Array[String]) {
    val line = scala.io.Source.fromFile("ex4.scala").getLines.toList.reverse.head.split("// ")(1)
    val numbers = line.split(" ").map(_.toDouble)
    assert(numbers.sum == 15.0)
    assert(numbers.sum / numbers.length == 5.0)
    assert(numbers.max == 10.0)
    assert(numbers.min == 2.0)
  }
}

// 10.0 2.0 3.0

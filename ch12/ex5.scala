object ex5 {
  def main(args: Array[String]) {
    assert(largest(x => 10 * x - x * x, 1 to 10) == 25)
  }

  def largest(fun: (Int) => Int, inputs: Seq[Int]) = inputs.map(fun).max
}

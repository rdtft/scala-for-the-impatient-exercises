object ex6 {
  def main(args: Array[String]) {
    assert(largest(x => 10 * x - x * x, 1 to 10) == 5)
  }

  def largest(fun: (Int) => Int, inputs: Seq[Int]) = inputs.zip(inputs.map(fun)).maxBy(_._2)._1
}

object ex3 {
  import random._

  def main(args: Array[String]) {
    setSeed(42)

    println(nextInt())
    println(nextDouble())
  }
}

package object random {
  private var _seed = 0

  def setSeed(seed: Int) = _seed = seed

  def nextInt() = {
    _seed = _seed * 1664525 + 1013904223 % (2 ^ 32)
    _seed
  }

  def nextDouble(): Double = nextInt
}

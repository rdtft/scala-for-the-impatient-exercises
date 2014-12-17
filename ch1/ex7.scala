object ex7 {
  import scala.math.BigInt.probablePrime
  import scala.util.Random

  def main(args: Array[String]) {
    println(probablePrime(100, Random))
  }
}

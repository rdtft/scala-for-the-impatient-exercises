object ex8 {
  import scala.util.Random

  def main(args: Array[String]) {
    val random = BigInt(100, Random).toString(36)
    println(random)
  }
}

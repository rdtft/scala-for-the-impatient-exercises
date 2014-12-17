object ex5 {
  import scala.runtime.RichInt

  def main(args: Array[String]) {
    val i = new RichInt(10)
    assert(i.max(2) == 10)
  }
}

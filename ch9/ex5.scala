object ex5 {
  import math.pow

  def main(args: Array[String]) {
    val out = new java.io.PrintWriter("/dev/stdout")
    0.to(20).map(i => out.println("%8.0f %f".format(pow(2.0, i), pow(2.0, -i))))
    out.close
  }
}

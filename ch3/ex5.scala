object ex5 {
  def main(args: Array[String]) {
    val a: Array[Double] = Array(1.0, 2.5, 2.5, 4)
    val res = a.sum / a.length

    assert(res == 2.5)
  }
}

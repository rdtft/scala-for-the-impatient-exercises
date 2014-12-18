object ex7 {
  def main(args: Array[String]) {
    val a = Array(10, 10, 20, 30)
    var res = a.distinct

    assert(res.deep == Array(10, 20, 30).deep)
  }
}

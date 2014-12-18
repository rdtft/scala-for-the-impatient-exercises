object ex3 {
  def main(args: Array[String]) {
    val x:Unit = { val y = 1 }
    assert(x.getClass.getName == "void")
  }
}

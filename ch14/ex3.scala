object ex3 {
  def main(args: Array[String]) {
    assert(swap(Array(1, 2, 3, 4)).deep == Array(2, 1, 3, 4).deep)
    assert(swap(Array(1, 2, 3)).deep == Array(2, 1, 3).deep)
    assert(swap(Array(1, 2)).deep == Array(1, 2).deep)
  }

  def swap(value: Array[Any]) = value match {
    case Array(v1, v2, v3, rest @_*) => Array(v2, v1, v3) ++ rest
    case _ => value
  }
}

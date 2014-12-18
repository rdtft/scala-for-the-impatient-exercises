object ex7 {
  import scala.util.control.Exception.allCatch

  def main(args: Array[String]) {
    val tokens = scala.io.Source.fromFile("ex7.scala").mkString.split("\\s+")

    for (token <- tokens if !isFloat(token)) {
      println(token)
    }
  }

  def isFloat(s: String) = (allCatch opt s.toFloat).isDefined
}

// 20.0 30.0

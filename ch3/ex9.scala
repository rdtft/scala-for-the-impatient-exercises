object ex9 {
  import java.util.TimeZone.getAvailableIDs

  def main(args: Array[String]) {
    val prefix = "America/"
    var res = getAvailableIDs.filter(_.startsWith(prefix)).map(_.stripPrefix(prefix)).sorted

    println(res.mkString("[", ", ", "]"))
  }
}

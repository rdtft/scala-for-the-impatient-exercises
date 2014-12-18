object ex7 {
  import scala.collection.JavaConversions.propertiesAsScalaMap
  import scala.collection.mutable.Map

  def main(args: Array[String]) {
    val properties: Map[String, String] = System.getProperties()
    val longestKey = (for ((k, _) <- properties) yield k.length).max

    for ((k, v) <- properties)
      printf("%-" + longestKey + "s | %s\n", k, v)
  }
}

object ex6 {
  import java.util.{HashMap => JHashMap}
  import scala.collection.mutable.{HashMap => SHashMap}
  import collection.JavaConversions.mapAsScalaMap

  def main(args: Array[String]) {
    val j = new JHashMap[String, String]
    j.put("foo", "bar")
    j.put("baz", "quux")

    val s = SHashMap[String, String]()

    for ((k, v) <- j) s += (k -> v)

    assert(s("foo") == "bar")
    assert(s("baz") == "quux")
  }
}

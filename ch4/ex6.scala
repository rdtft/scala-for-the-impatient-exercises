object ex6 {
  import scala.collection.mutable.LinkedHashMap

  def main(args: Array[String]) {
    var week = new LinkedHashMap[String, Int]

    week += ("Monday"    -> java.util.Calendar.MONDAY)
    week += ("Tuesday"   -> java.util.Calendar.TUESDAY)
    week += ("Wednesday" -> java.util.Calendar.WEDNESDAY)
    week += ("Thursday"  -> java.util.Calendar.THURSDAY)
    week += ("Friday"    -> java.util.Calendar.FRIDAY)
    week += ("Saturday"  -> java.util.Calendar.SATURDAY)
    week += ("Sunday"    -> java.util.Calendar.SUNDAY)

    assert(week("Sunday") == java.util.Calendar.SUNDAY)

    println(week.mkString("\n"))
  }
}

object ex5 {
  def main(args: Array[String]) {
    val table = Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM,.NET"

    val res = """<table>
      <tr>
        <td>Java</td>
        <td>Scala</td>
      </tr>
      <tr>
        <td>Gosling</td>
        <td>Odersky</td>
      </tr>
      <tr>
        <td>JVM</td>
        <td>JVM, .NET</td>
      </tr>
    </table>""".split("\\s*").mkString

    println(res)
    println(table)

    assert(res== table.toString)
  }

  class Table {
    import collection.mutable.ArrayBuffer
    val rows = new ArrayBuffer[ArrayBuffer[String]]
    rows += new ArrayBuffer[String]

    def |(s: String) = {
      rows(rows.length - 1) += s
      this
    }

    def ||(s: String) = {
      rows += new ArrayBuffer[String]
      rows(rows.length - 1) += s
      this
    }

    override def toString = { 
      rows.map(row => row.mkString("<tr><td>", "</td><td>", "</td></tr>")).mkString("<table>", "", "</table>")
    }

  }

  object Table {
    def apply() = new Table()
  }
}

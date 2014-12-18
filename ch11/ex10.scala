object ex10 {
  def main(args: Array[String]) {
    val RichFile(path, file, ext) = "/home/cay/readme.txt"

    assert(path == "home")
    assert(file == "cay")
    assert(ext == "readme.txt")
  }

  object RichFile {
    def unapplySeq(filepath: String): Option[Seq[String]] = {
      Some(filepath.split("/").filter(_ != "").toSeq)
    }
  }
}

object ex9 {
  def main(args: Array[String]) {
    val RichFile(path, file, ext) = "/home/cay/readme.txt"

    assert(path == "/home/cay/")
    assert(file == "readme.txt")
    assert(ext == "txt")
  }

  object RichFile {
    def unapply(filepath: String) = {
      val file = new java.io.File(filepath)
      val name = file.getName
      val ext = if (name.indexOf(".") > 0) name.split('.')(1) else None
      val path = filepath.dropRight(name.length)

      Some(path, name, ext)
    }
  }
}

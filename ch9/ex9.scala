object ex9 {
  import java.io.File

  def main(args: Array[String]) {
    val classFiles = subdirs(new File(".")).flatMap(dir =>
      dir.listFiles.filter(file =>
        file.getName.endsWith(".class")))

    println(classFiles.size)
  }

  def subdirs(dir: File): Iterator[File] = {
    val children = dir.listFiles.filter(_.isDirectory)
    children.toIterator ++ children.toIterator.flatMap(subdirs _)
  }
}

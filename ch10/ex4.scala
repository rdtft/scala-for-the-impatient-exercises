object ex4 {
  def main(args: Array[String]) {
    (new ConsoleLogger).log("Hello World")
    (new ConsoleLogger with CryptoLogger).log("Hello World")
    (new { override val key = -3 } with ConsoleLogger with CryptoLogger).log("Hello World")
  }

  class ConsoleLogger extends Logger {
    def log(msg: String) { println(msg) }
  }

  trait Logger {
    def log(msg: String)
  }

  trait CryptoLogger extends Logger {
    val key = 3

    abstract override def log(msg: String) {
      val crypted = msg.map((c: Char) => (c + key).toChar)
      super.log(crypted)
    }
  }
}

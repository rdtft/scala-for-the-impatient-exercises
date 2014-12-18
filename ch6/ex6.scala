object ex6 {
  def main(args: Array[String]) {
    assert(Suit.Spade.toString == "♠")
  }

  object Suit extends Enumeration {
    val Club = Value("♣")
    val Diamond = Value("♦")
    val Heart = Value("♥")
    val Spade = Value("♠")
  }
}

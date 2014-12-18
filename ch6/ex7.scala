object ex7 {
  def main(args: Array[String]) {
    assert(!Suit.isRed(Suit.Spade))
    assert(Suit.isRed(Suit.Heart))
  }

  object Suit extends Enumeration {
    type Color = Value

    val Club = Value("♣")
    val Diamond = Value("♦")
    val Heart = Value("♥")
    val Spade = Value("♠")

    def isRed(card: Color) = card == Diamond || card == Heart
  }
}

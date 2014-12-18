object ex7 {
  def main(args: Array[String]) {
    val seq = new BitSequence
    assert(seq(1) == false)
    seq(1) = true
    assert(seq(1) == true)
  }

  class BitSequence {
    private var sequence:Long = 0;

    def apply(index: Int) = ((sequence & (1 << index)) > 0)

    def update(index: Int, value: Boolean) = {
      if (value)
        sequence |= (1 << index)
      else
        sequence &= ~(1 << index)
    }
  }
}

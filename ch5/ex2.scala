object ex2 {
  def main(args: Array[String]) {
    val a = new BankAccount(100)
    assert(a.balance == 100.0)
    a.deposit(42)
    assert(a.balance == 142.0)
    a.withdraw(2)
    assert(a.balance == 140.0)
  }

  class BankAccount(private var _balance: Double = 0.0) {
    def deposit(n: Double) { _balance += n }
    def withdraw(n: Double) { _balance -= n }
    def balance() = _balance
  }
}

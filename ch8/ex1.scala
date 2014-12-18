object ex1 {
  def main(args: Array[String]) {
    val b = new BankAccount(100)
    val c = new CheckingAccount(0)
    assert(b.deposit(10) == 110.0)
    assert(b.withdraw(100) == 10.0)
    assert(c.deposit(42) == 41.0)
    assert(c.withdraw(1) == 39.0)
  }

  class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
    override def deposit(amount: Double) = { super.deposit(amount - 1) }
    override def withdraw(amount: Double) = { super.withdraw(amount + 1) }
  }

  class BankAccount(initialBalance: Double) {
    private var balance = initialBalance
    def deposit(amount: Double) = { balance += amount; balance }
    def withdraw(amount: Double) = { balance -= amount; balance }
  }
}


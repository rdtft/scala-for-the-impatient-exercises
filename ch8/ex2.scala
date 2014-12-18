object ex2 {
  def main(args: Array[String]) {
    val a = new SavingsAccount(100, 0.15)
    a.deposit(100)
    assert(a.balance == 200)
    a.deposit(100)
    a.deposit(100)
    assert(a.balance == 400)
    assert(a.earnMonthlyInterest == 405.0) // 400  + (400 * 0.15) / 12)
    a.deposit(5)  // balance 410
    a.deposit(10) // balance 420
    a.deposit(80) // balance 500
    a.deposit(2)  // balance 502 - 1 comission
    assert(a.balance == 501)
  }

  class SavingsAccount(
    initialBalance: Double,
    interestYear: Double = 0.15,
    freeTransactionsInMonth: Int = 3,
    comission: Double = 1 ) extends BankAccount(initialBalance) {

    private var _currentTransactionsInMonth: Int = 0

    def comissionAmount: Double = {
      if (_currentTransactionsInMonth > freeTransactionsInMonth)
        comission
      else
        0
    }

    def earnMonthlyInterest() = {
      _currentTransactionsInMonth = 0
      super.deposit(balance * interestYear / 12)
    }

    override def deposit(amount: Double) = {
      _currentTransactionsInMonth += 1
      super.deposit(amount - comissionAmount)
    }

    override def withdraw(amount: Double) = {
      _currentTransactionsInMonth += 1
      super.withdraw(amount + comissionAmount)
    }
  }

  class BankAccount(initialBalance: Double) {
      private var _balance = initialBalance

      def deposit(amount: Double) = { _balance += amount; _balance }
      def withdraw(amount: Double) = { _balance -= amount; _balance }
      def balance = _balance
  }
}

class BalanceService {

    private var balance = 0

    fun addMoney(count: Int) {
        balance += count
    }

    fun withdrawMoney(count: Int) {
        balance -= count
    }

    fun getBalance() = balance
}
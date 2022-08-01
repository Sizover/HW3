class BalanceService {
    
    private var balance = 0

    fun addBalance(count: Int) {
        balance += count
    }

    fun removeBalance(count: Int) {
        balance -= count
    }

    fun getBalance() = balance
}
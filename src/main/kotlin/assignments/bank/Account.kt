package assignments.bank

class Account(
    val id: String,
    var ownerAccountName: String,
    private var password: String,
    var balance: Double = 0.0,
) {

    fun login(accountId: String, password: String): Boolean {
        return password == this.password && accountId == id
    }

    fun withdraw(value: Double): Boolean {
        return if (value <= balance) {
            balance -= value
            println("Saque realizado com sucesso.")
            true
        } else {
            println("Saldo insuficiente para este saque.")
            false
        }
    }

    fun deposit(value: Double) {
        balance += value
        println("Depósito realizado com sucesso.")
    }
}
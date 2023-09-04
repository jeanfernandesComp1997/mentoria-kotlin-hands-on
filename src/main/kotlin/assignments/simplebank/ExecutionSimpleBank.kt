package assignments.simplebank

import assignments.bank.Account

fun main() {

    val account = Account(
        id = "13b9d67d-5cf6-4a28-aeda-86d9f7bf8796",
        ownerAccountName = "Tester Owner",
        password = "123",
        balance = 1000.00
    )

    account.withdraw(100.00)
    account.deposit(50.00)
    account.withdraw(250.00)

    account.printBalance()
}
package assignments.bank

import java.lang.NumberFormatException

fun main() {

    val accountService = AccountService()

    var execution = true
    var loggedAccount: Account? = null

    while (execution) {
        var action: Int

        if (loggedAccount == null) {
            ConsoleUtils.printMenu()
            action = readln().toInt()

            when (action) {
                1 -> {
                    ConsoleUtils.createAccountHeader()

                    print("Digite o id da conta: ")
                    val id = readln()

                    print("Digite o nome do titular da conta: ")
                    val ownerAccountName = readln()

                    print("Digite a senha da conta: ")
                    val password = readln()

                    accountService.createAccount(id, ownerAccountName, password)
                }

                2 -> {
                    ConsoleUtils.loginHeader()

                    print("Digite o id da conta: ")
                    val id = readln()

                    print("Digite a senha da conta: ")
                    val password = readln()

                    if (accountService.login(id, password)) {
                        loggedAccount = accountService.retrieveAccountById(id)!!
                        println("Logon realizado com sucesso. Seja bem vindo ${loggedAccount.ownerAccountName}")
                    } else {
                        println("Erro ao logar.")
                    }
                }

                3 -> {
                    println("Encerrando...")
                    execution = false
                }

                else -> {
                    println("Erro opção inválida")
                }
            }
        }

        if (loggedAccount != null) {
            ConsoleUtils.printLoggedMenu()
            action = readln().toInt()

            when (action) {
                1 -> {
                    ConsoleUtils.depositHeader()

                    try {
                        print("Informe o valor do depósito: ")
                        val value = readln().toDouble()
                        loggedAccount.deposit(value)
                        accountService.saveBalance(loggedAccount)
                    } catch (ex: NumberFormatException) {
                        println("Informe um valor válido.")
                    }
                }

                2 -> {
                    ConsoleUtils.withDrawHeader()

                    try {
                        print("Informe o valor do saque: ")
                        val value = readln().toDouble()
                        val success = loggedAccount.withdraw(value)
                        if (success) {
                            accountService.saveBalance(loggedAccount)
                        }
                    } catch (ex: NumberFormatException) {
                        println("Informe um valor válido.")
                    }
                }

                3 -> {
                    loggedAccount.printBalance()
                }

                4 -> {
                    println("Deslogando...")
                    loggedAccount = null
                }

                else -> {
                    println("Erro opção inválida")
                }
            }
        }
    }
}


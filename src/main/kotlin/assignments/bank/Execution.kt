package assignments.bank

import java.lang.NumberFormatException

fun main() {

    val accountService = AccountService()

    var execution = true
    var account: Account? = null

    while (execution) {
        ConsoleUtils.printMenu()
        val action = readln().toInt()

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
                    account = accountService.retrieveAccountById(id)!!
                    println("Logon realizado com sucesso. Seja bem vindo ${account.ownerAccountName}")
                } else {
                    println("Erro ao logar.")
                }
            }

            3 -> {
                ConsoleUtils.depositHeader()

                try {
                    if (account != null) {
                        print("Informe o valor do depósito: ")
                        val value = readln().toDouble()
                        account.deposit(value)
                        accountService.saveBalance(account)
                    } else {
                        println("Erro usuário não logado.")
                    }
                } catch (ex: NumberFormatException) {
                    println("Informe um valor válido.")
                }
            }

            4 -> {
                ConsoleUtils.withDrawHeader()

                try {
                    if (account != null) {
                        print("Informe o valor do saque: ")
                        val value = readln().toDouble()
                        val success = account.withdraw(value)
                        if (success) {
                            accountService.saveBalance(account)
                        }
                    } else {
                        println("Erro usuário não logado.")
                    }
                } catch (ex: NumberFormatException) {
                    println("Informe um valor válido.")
                }
            }

            5 -> {
                if (account != null) {
                    account.printBalance()
                } else {
                    println("Erro usuário não logado.")
                }
            }

            6 -> {
                println("Encerrando...")
                execution = false
            }

            else -> {
                println("Erro opção inválida")
            }
        }
    }
}


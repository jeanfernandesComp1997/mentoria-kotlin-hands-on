package assignments.bank

class AccountService {

    private var listOfAccounts = mutableListOf<Account>()

    fun createAccount(
        id: String,
        ownerAccountName: String,
        password: String
    ) {
        val accountExists = listOfAccounts
            .find { id == it.id }

        if (accountExists != null) {
            println("Erro! Já existe uma conta com este id.")
        } else {
            listOfAccounts.add(
                Account(
                    id,
                    ownerAccountName,
                    password
                )
            )
        }
    }

    fun login(id: String, password: String): Boolean {
        val account = listOfAccounts
            .find { id == it.id } ?: return false

        return account.login(account.id, password)
    }

    fun retrieveAccountById(id: String): Account? {
        return listOfAccounts
            .find { id == it.id }
    }

    fun saveBalance(account: Account) {
        listOfAccounts
            .find { account.id == it.id }
            .let { it?.balance = account.balance }
    }

    fun printBalance(accountId: String) {
        val account = listOfAccounts
            .find { accountId == it.id } ?: throw RuntimeException("Account $accountId not found.")

        println(
            """
            ID da conta:     ${account.id}
            Nome do Titular: ${account.ownerAccountName}
            Saldo:           ${account.balance}
        """.trimIndent()
        )
    }
}
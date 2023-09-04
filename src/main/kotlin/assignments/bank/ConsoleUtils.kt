package assignments.bank

object ConsoleUtils {

    fun printMenu() {
        print(
            """
            ============= MENU =============
            1 - Criar conta
            2 - Logar na conta
            3 - Depositar
            4 - Sacar
            5 - Verificar saldo
            6 - Sair
            
            Selecione uma opção: 
        """.trimIndent()
        )
    }

    fun createAccountHeader() {
        println("============= CRIAR CONTA =============")
    }

    fun balanceHeader() {
        println("============= SALDO DA CONTA =============")
    }

    fun loginHeader() {
        println("============= LOGAR NA CONTA =============")
    }

    fun depositHeader() {
        println("============= DESPOSITAR =============")
    }

    fun withDrawHeader() {
        println("============= SACAR =============")
    }
}
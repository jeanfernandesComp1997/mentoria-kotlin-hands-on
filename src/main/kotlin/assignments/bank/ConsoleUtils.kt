package assignments.bank

object ConsoleUtils {

    fun printMenu() {
        print(
            """
            ============= MENU =============
            1 - Criar conta
            2 - Logar na conta
            3 - Encerrar
            
            Selecione uma opção: 
        """.trimIndent()
        )
    }

    fun printLoggedMenu() {
        print(
            """
            ============= MENU =============
            1 - Depositar
            2 - Sacar
            3 - Verificar saldo
            4 - Sair
            
            Selecione uma opção: 
        """.trimIndent()
        )
    }

    fun createAccountHeader() {
        println("============= CRIAR CONTA =============")
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
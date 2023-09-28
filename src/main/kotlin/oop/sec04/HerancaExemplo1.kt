package oop.sec04

// Execução das classes
fun main() {
    val gerente1 = Gerente(30, "João")
    gerente1.gerenciar()

    println()

    val desenvolvedor1 = Desenvolvedor(25, "Maria")
    desenvolvedor1.desenvolver()
}

// Classe base, precisa da palavra reservada open, para que assim ela seja aberta para implementação
open class Pessoa(
    val idade: Int,
    val nome: String
) {

    init {
        println(
            """
                Meu nome é $nome
                e minha idade é $idade
            """.trimIndent()
        )
    }
}

// Clase derivada do tipo gerente
class Gerente(
    idade: Int,
    nome: String
) : Pessoa(idade, nome) {

    fun gerenciar() {
        println("Eu gerencio uma agência do itaú")
    }
}

// Classe derivada do tipo desenvolvedor
class Desenvolvedor(
    idade: Int,
    nome: String
) : Pessoa(idade, nome) {

    fun desenvolver() {
        println("Eu desenvolvo softwares")
    }
}





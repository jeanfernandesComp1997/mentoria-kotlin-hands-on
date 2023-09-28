package oop.sec04

fun main() {
    val jogador1 = Jogador(30, "João", true)
    println(jogador1.getDescricao())
}

// Exemplo com classe derivada com parâmetros próprios
open class Usuario(val idade: Int, val nome: String) {
}

class Jogador(
    idade: Int,
    nome: String,
    val vip: Boolean
) : Usuario(idade, nome) {

    fun getDescricao(): String {
        return """
            Nome: $nome
            Idade: $idade
            Vip: ${if (eVip()) "Sim" else "Não"}
        """.trimIndent()
    }

    fun eVip(): Boolean {
        return vip
    }
}
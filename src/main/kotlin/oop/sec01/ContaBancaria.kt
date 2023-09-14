package oop.sec01

// metodo construtor primario
class ContaBancaria(
    // propriedades
    val id: String,
    var titular: String,
    var saldo: Double,
    var ativa: Boolean
) {

    fun depositar(valor: Double) {
        // saldo = saldo + valor
        // ou
        saldo += valor
    }

    fun sacar(valor: Double) {
        if (valor <= saldo) {
            saldo -= valor
        }
    }

    fun desativarConta() {
        ativa = false
    }

    fun ativarConta() {
        ativa = true
    }
}
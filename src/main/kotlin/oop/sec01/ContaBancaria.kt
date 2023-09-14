package oop.sec01

// metodo construtor primario
class ContaBancaria(
    // propriedades
    val id: String,
    var titular: String,
    var ativa: Boolean
) {
    var saldo: Double = 0.0
        private set

    fun depositar(valor: Double) {
        // saldo = saldo + valor
        // ou
        saldo += valor
        println("Depósito no valor de $valor realizado com sucesso.")
    }

    fun sacar(valor: Double) {
        if (valor <= saldo) {
            saldo -= valor
            println("Saque no valor de $valor realizado com sucesso.")
        } else {
            println("Saldo insuficiente para o saque no valor de $valor.")
        }
    }

    fun desativarConta() {
        ativa = false
    }

    fun ativarConta() {
        ativa = true
    }
}

// Exemplo de execução com objetos
fun main() {

    // Definição de um objeto do tipo ContaBancaria
    val contaCliente1 = ContaBancaria(
        "1",
        "Cliente 1",
        true
    )

    // Podemos criar quantos objetos quisermos a partir de uma classe
    val contaCliente2 = ContaBancaria(
        "2",
        "Cliente 2",
        true
    )

    /* A prtir do momento que criamos um objeto ele começa a ocupar espaço em memória, cada objeto ficará alocado um
    determinado endereço da memória ram */

    // Endereço de memória onde está alocado o objeto cliente1
    println(contaCliente1)

    // Endereço de memória onde está alocado o objeto cliente2
    println(contaCliente2)


    // Para acessar os membros de um objeto podemos fazer o seguinte:
    contaCliente1.titular
    contaCliente2.ativa

    // Se o atributo for do tipo var, podemos sobrescrever o valor da seguinte maneira:
    contaCliente1.ativa = false

    // Para acessarmos as funções do objeto podemos fazer o seguinte:
    contaCliente2.depositar(1500.00)
    contaCliente2.sacar(200.00)

}
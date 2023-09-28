package oop.sec04

fun main() {
    val pagamentoCartaoDeCredito = PagamentoCartaoDeCredito(10.0)
}

// Exemplo quando não existe construtor primário
open class Pagamento {
    var valor: Double = 0.0
    var dataPagamento: String = ""

    constructor(valor: Double) {
    }

    constructor(valor: Double, dataPagamento: String) {
        this.valor = valor
        this.dataPagamento = dataPagamento
    }
}

class PagamentoCartaoDeCredito : Pagamento {

    // Delega para o construtor da classe base construir
    constructor(valor: Double) : this(valor, "") {

    }

    // Inicializa classe base
    constructor(valor: Double, dataPagamento: String) : super(valor, dataPagamento) {

    }
}
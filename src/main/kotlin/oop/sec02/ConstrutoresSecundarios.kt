package oop.sec02

class Pagamento(
    val valor: Double
) {
    var tipoPagamento: String = "dinheiro"
    var parcelas: Int = 1

    constructor(valor: Double, tipoPagamento: String, parcelas: Int) : this(valor) {
        this.tipoPagamento = tipoPagamento
        this.parcelas = parcelas
    }

    constructor(valor: Double, parcelas: Int) : this(valor) {
        this.parcelas = parcelas
    }
}

// Execução, exemplo construtores secundários
fun main() {

    val pagamento1 = Pagamento(2000.0, "cartão de crédito", 10)
    val pagamento2 = Pagamento(500.0)
    val pagamento3 = Pagamento(200.0, 2)

    println(
        """
            Pagamento1:
            Valor: ${pagamento1.valor}
            Tipo de pagamento: ${pagamento1.tipoPagamento}
            Parcelas: ${pagamento1.parcelas}
        """.trimIndent()
    )

    println(
        """
            Pagamento2:
            Valor: ${pagamento2.valor}
            Tipo de pagamento: ${pagamento2.tipoPagamento}
            Parcelas: ${pagamento2.parcelas}
        """.trimIndent()
    )

    println(
        """
            Pagamento3:
            Valor: ${pagamento3.valor}
            Tipo de pagamento: ${pagamento3.tipoPagamento}
            Parcelas: ${pagamento3.parcelas}
        """.trimIndent()
    )
}
package oop.sec03

class CartaoDeCredito {

    // Quando declaramos as propriedades, os 'setters' e 'getters' já estão disponíveis automaticamente
    val numeroCartao: String = "11111111111111111"
    val cvv: String = "123"
    val validade: String = "10/29"
    var senha: String = "1029"
}

class CartaoDeCreditoGetSetManual {
    val numeroCartao: String = "11111111111111111"
    val cvv: String = "123"
    val validade: String = "10/29"
        get() = field
    var senha: String = "1029"
        get() = field
        set(value) {
            if (value != "1234") {
                field = value
            } else {
                println("Senha inválida")
            }
        }
}

fun main() {

    val cartao1 = CartaoDeCredito()
    // Uso do getter
    cartao1.validade

    // Uso do setter
    cartao1.senha = "2938"

    // Getter e Setter manual
    val cartao2 = CartaoDeCreditoGetSetManual()

    // Uso do getter
    cartao2.validade

    // Uso do setter
    cartao2.senha = "1234"
    cartao2.senha = "2938"
}
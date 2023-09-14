package oop.sec02

// Classe com construtor primário
class Carro(
    val modelo: String,
    val chassi: String,
    val cor: String,
    val marca: String
) {
}

// Exemplo de execução classe construtor primário

fun main() {

    /* Nesse momento declaramos uma varíavel e ela recebe a Classe onde passamos via parametros os valores que queremos
    na inicialização desse objeto */
    val carro1 = Carro(
        "AMG GT Black",
        "123456",
        "Laranja",
        "Mercedez AMG"
    )

    println("Modelo: ${carro1.modelo}")
}
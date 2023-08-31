fun main() {

    // Operadores suportados + -> soma, - -> subtração, * -> multiplicação, / -> Divisão, % -> Resto divisão.

    println(1 + 2)
    println(2500000000L - 1L)
    println(3.14 * 2.71)
    println(10.0 / 3)

    val intResult = 1 + 2
    val longResult = 2500000000L - 1L
    val doubleResult = 3.14 * 2.71
    val doubleResult2 = 3.14 * 2.71


    // Divisão de dois Int's é descartado a fração

    val intDivided = 5 / 2
    println("Resultado divisão dois inteiros: $intDivided")

    val floatDivided = 5F / 2F
    println("Resultado divisão dois floats: $floatDivided")

    // ou

    val divided = 5 / 2.toDouble()
    println("Resultado divisão: $divided")


    // Operadores de comparação: a < b, a > b, a <= b, a >= b
    // Verificação de igualdade: a == b and a != b
    // Para instanciar um range: a..b, x in a..b, x !in a..b
    val range = 1..10
    range.forEach { println(it)}
}
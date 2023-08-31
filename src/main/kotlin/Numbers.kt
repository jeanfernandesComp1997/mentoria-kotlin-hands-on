fun main() {

    // Integer

    val intNumber = 1
    val intNumber2: Int = 1

    val threeBillion = 3000000000
    val oneLong = 1L
    val oneByte: Byte = 1


    // Floating-point

    val pi = 3.14
    val doubleNumber = 1.0

    val doubleNumber2 = 2.7182818284
    val floatNumber = 2.7182818284F // Ele é arredondado para 6 casas decimais caso tenha mais do que 6-7 casas decimais


    // Literal constants

    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    println("Credit card number: $creditCardNumber")


    // Conversão explicita

    val b: Byte = 1
    // Gera erro porque a variavel i aceita somente o tipo Int
    // val i: Int = b
    // Maneira correta
    val i = b.toInt()

    // Todos os tipos suportam conversão:
    //    toByte(): Byte
    //    toShort(): Short
    //    toInt(): Int
    //    toLong(): Long
    //    toFloat(): Float
    //    toDouble(): Double

    val longValue = 1L + 3 // Long + Int => Long
    println("LongValue: $longValue")
}
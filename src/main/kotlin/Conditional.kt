fun main() {

    // If
    print("Digite o valor de a: ")
    val a = readln().toInt()
    print("Digite o valor de b: ")
    val b = readln().toInt()
    var max = a
    if (a < b) max = b

    // With else
    if (a > b) {
        max = a
    } else {
        max = b
    }

    println("O maior valor é: $max")
    // ou
    max = if (a > b) {
        a
    } else {
        b
    }

    // Expression
    max = if (a > b) a else b

    // `else if` expressions:
    val maxLimit = 1
    val maxOrLimit = if (maxLimit > a) maxLimit else if (a > b) a else b


    // When
    println()
    println("When exemplo")
    print("Digite o valor de x: ")
    val x = readln().toInt()

    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> {
            print("x is neither 1 nor 2")
        }
    }
}
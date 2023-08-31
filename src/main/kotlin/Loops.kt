import kotlin.random.Random

fun main() {

    // for
    for (i in 1..3) {
        println(i)
    }


    // while
    var x = 10

    while (x > 0) {
        println(x)
        x--
    }

    do {
        val y = Random.nextInt(1, 10)
        println(y)
    } while (y != 7)
}
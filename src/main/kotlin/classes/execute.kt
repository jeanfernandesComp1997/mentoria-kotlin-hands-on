package classes

import java.text.SimpleDateFormat

fun main() {

    val dog = Dog(
        "Border collie",
        "MidSize",
        SimpleDateFormat("yyyy-MM-dd").parse("2020-01-01"),
        "Black"
    )

    println("Dog is sleeping now? ${dog.isSleepingNow()}")

    dog.run()

    dog.sleep()
    dog.wakeUp()

    dog.eat(false)

    println("Dog Color: ${dog.color}")
    println(dog.age())
}
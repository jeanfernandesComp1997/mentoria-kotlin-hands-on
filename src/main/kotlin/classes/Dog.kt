package classes

import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.math.abs


class Dog(
    val breed: String,
    val size: String,
    val dateOfBirth: Date,
    val color: String,
    private var isSleeping: Boolean = false
) {

    fun eat(foodIsPremium: Boolean) {
        if (!isSleeping) {
            if (foodIsPremium) {
                println("The dog is eating")
            } else {
                println("The dog eats only premium food")
            }
        } else {
            println("The dog is sleeping")
        }
    }

    fun sleep() {
        if (isSleeping) {
            println("the dog is already sleeping")
        } else {
            isSleeping = true
            println("the dog is sleeping now")
        }
    }

    fun sit() {
        if (!isSleeping) {
            println("The dog is sitting")
        } else {
            println("The dog is sleeping now")
        }
    }

    fun run() {
        if (!isSleeping) {
            println("The dog is running")
        } else {
            println("The dog is sleeping now")
        }
    }

    fun wakeUp() {
        if (!isSleeping) {
            println("The dog is already awake")
        } else {
            isSleeping = false
            println("The dog is awake now")
        }
    }

    fun isSleepingNow() = isSleeping

    private fun ageInDays(): Int {
        val now = Date()
        val diffInMillis = abs(now.time - dateOfBirth.time)
        return TimeUnit.DAYS.convert(diffInMillis, TimeUnit.MILLISECONDS).toInt()
    }

    fun age(): Age {
        var ageInDays = ageInDays()

        val year: Int = ageInDays / 365
        ageInDays %= 365
        val week: Int = ageInDays / 7
        ageInDays %= 7
        val day: Int = ageInDays

        return Age(
            year,
            week,
            day
        )
    }
}
package classes

import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.math.abs


class Dog(
    val breed: String,
    val size: String,
    val dateOfBirth: Date,
    val color: String
) {

    fun eat() {
        println("The dog is eating")
    }

    fun sleep() {
        println("the dog is sleeping")
    }

    fun sit() {
        println("The dog is sitting")
    }

    fun run() {
        println("The dog is running")
    }

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
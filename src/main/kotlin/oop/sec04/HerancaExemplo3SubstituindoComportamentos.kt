package oop.sec04

fun main() {
    val falcao = Falcao()
    falcao.locomover()

    val onca = Onca()
    onca.locomover()

    val tubarao = Tubarao()
    tubarao.locomover()
}

// Substituindo comportamentos

open class Animal() {

    open fun locomover() {
        println("Se locomovendo ...")
    }
}

class Falcao : Animal() {

    override fun locomover() {
        println("Se locomovendo pelo céu ...")
    }
}

class Onca : Animal() {

    override fun locomover() {
        println("Se locomovendo pela terra ...")
    }
}

class Tubarao : Animal() {

    override fun locomover() {
        super.locomover()
        println("Pela água")
    }
}
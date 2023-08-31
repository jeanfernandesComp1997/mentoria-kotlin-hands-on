fun main() {

    // Instanciação e exemplos de funções
    val stringExample = "Mentoria kotlin"
    println(stringExample)
    println(stringExample[0])
    stringExample.forEach { println(it) }

    println(stringExample.uppercase())


    // Concatenação
    val stringExampleConcat = "Mentoria kotlin" + 2023
    println(stringExampleConcat)

    // ou
    val stringExampleConcat2 = "Mentoria kotlin ${2023}"
    println(stringExampleConcat2)

    // ou
    val year = 2023
    val stringExampleConcat3 = "Mentoria kotlin $year"
    println(stringExampleConcat3)

    // ou
    val name = "itau"
    val stringExampleConcat4 = "Mentoria kotlin $year ${name.uppercase()}"
    println(stringExampleConcat4)


    // Literais
    val s = "Hello, world!\n"


    // Multiline
    val text = """
    Hello World!
    Mentoria kotlin 2023
    """

    println(text)

    val text2 = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()

    println(text2)

    val price = """
    ${'$'}_9.99
    """

    println(price)
}
fun main() {

    // val Referência imutável - Quando declarada com a palavra chave val não pode ser mais alterada depois que o valor for atribuído.

    // var Referência mutável - Quando declarada com a palavra chave var pode ser alterada posteriormente.

    var favoriteColor = "Green"
    favoriteColor = "Blue"
    println(favoriteColor)

    val totalOrderValue = 1000.0F
    // Gera erro
    // totalOrderValue = 10.0F
}
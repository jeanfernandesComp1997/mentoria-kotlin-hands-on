package oop.sec02

/* Podemos observar que agora na listagem de parametros da classe não definimos var ou val, porque agora eles são apenas
parametros
 */
class Pessoa(
    primeiroNome: String,
    sobrenome: String,
    idade: Int
) {
    // Nossos atributos/propriedades da classe estão definidos aqui agora
    val nomeCompleto: String
    var idade: Int

    // Esse é o bloco inicializador, onde podemos adicionar lógica de negócio para inicializar o nosso objeto
    init {
        nomeCompleto =
            "${primeiroNome.replaceFirstChar { it.uppercase() }} ${sobrenome.replaceFirstChar { it.uppercase() }}"
        /* Quando a propriedade tem o mesmo nome do parametro, precisamos colocar o this. antes da propriedade, para
        indicar que queremos atribuir valor ao atributo da classe (this) */
        this.idade = idade
    }
}

// Exemplo de execução de criação de objetos com a classe com inicializador
fun main() {

    val pessoa1 = Pessoa(
        "joão",
        "ninguém",
        22
    )

    println(
        """
        Nome: ${pessoa1.nomeCompleto}
        Idade: ${pessoa1.idade}
    """.trimIndent()
    )
}
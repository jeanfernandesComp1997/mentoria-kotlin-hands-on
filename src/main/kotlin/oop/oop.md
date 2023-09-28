# Programação orientada a objetos em Kotlin

## O que seria um objeto?

Na programação orientada a objetos podemos dividir problemas complexos em peças menores e menos complexas criando
objetos.
Objetos possuem duas características:

- estado
- comportamento

Um carro, por exemplo, é um objeto.

Ele pode estar `ligado` ou `desligado` - isso seria um estado.

Você pode `acelerar` `frenar` `trocar de marcha` - isso seria comportamentos.

Uma lampada também pode ser um objeto

Ela pode estar `ligada` ou `desligada` - estado

Você pode `ligar` a luz ou `desligar` - comportamento

Objetos em programação também podem ser inanimados, como, por exemplo:

- objeto `ContaBancaria` - possuí atributos, estados e comportamentos.

## O que seria uma classe?

Podemos dizer que uma classe seria a `planta`, `molde` ou `protótipo` de um objeto.

Se pensarmos na classe `ContaBancaria` ela contém os detalhes de uma conta.

Atributos:

- Ela tem um 'id'
- Um titular
- Um adicional
- Um saldo
- Uma senha
- Está ativa ≥ Um estado

Comportamentos:

- Depositar
- Sacar
- Transferir
- Cancelar a conta
- Investir

A classe seria a descrição do objeto, com esse modelo, essa classe, podemos criar quantos objetos `ContaBancaria`
quisermos.

Uma classe não ocupa espaço no universo (memória), é somente uma planta;

Um objeto criado a partir de uma classe ocupa espaço no universo (memória).

## Exemplo de uma classe

[ContaBancaria](./sec01/ContaBancaria.kt)

## Construtores de classes (Método construtor)

O contrutor de uma classe consiste em inicializar as propriedades de uma classe, ele pode ser considerado uma função
especial
que quando acionada, instância (cria) um objeto.

No kotlin temos alguns modelos de construtores:

- Contrutor primário: Uma maneira concisa de inicializar uma classe.
- Contrutor secundário: Permite que você possa adicionar lógicas adicionais na inicialização de um objeto.

#### Exemplos de construtores

[Construtor primário](./sec02/ContrutoresPrimario.kt)

### Bloco inicializador

Com o construtor primário, não somos permitidos a colocar nenhum código de lógica a mais, se caso precisarmos
adicionarmos
alguma lógica na construção dos nossos objetos em Kotlin podemos utilizar um bloco inicializador o `init { }`.

[Construtor primário com init](./sec02/BlocoInicializador.kt)

### Construtor secundário

No Kotlin podemos criar vários construtores secundários, usando a palavra chave 'constructor'.

[Construtor secundário](./sec02/ConstrutoresSecundarios.kt)

## Kotlin Getters e Setters

'Getters' são utilizados para obter o valor de uma propriedade de um objeto, 'setters' são para definir um valor a uma
propriedade
do objeto.

No Kotlin eles são gerados automaticamente, então você não defini-los manualmente como em JAVA, por exemplo, mas ainda
assim
é possível defini-los manualmente.

[Getters e Setter exemplos](./sec03/GettersESetters.kt)

## Herança

A herança é um dos conceitos principais em poo, permite que criemos classes derivadas de outras classes existentes
herdando assim os seus atributos e comportamentos, ou até mesmo podemos modificar e adicionar novos recursos a nova 
classe.

Exemplo:

[Herança](./sec04)
package fundamentos

fun main() {
    // 1.
    //Escreva um programa que calcule a área de um retângulo de base 10 e lado 5.
    // Adicione comentários para explicar o seu funcionamento.
    val base = 10
    val lado = 5
    val resultado = base * lado
    println(resultado)

    // 2.
    //Escreva um programa que tenha a capacidade de:
    //Armazenar seu nome completo
    //Armazenar o número que você calça
    //Armazenar a população do Brasil (212.500.000)
    val nomeCompleto = "Christian Mattos Moreira"
    val numeroCalcado = 41
    val populacaoBr = 212500000
    println(nomeCompleto)
    println(numeroCalcado)
    println(populacaoBr)

    //3.
    //Escreva um programa que seja capaz de realizar as operações aritméticas básicas, explicadas abaixo:
    //Soma de dois números
    //O valor da divisão de dois números
    //O valor do resto da divisão de dois números
    //O valor de incrementar e decrementar uma variável (pré e pós incremento, pré e pós decremento)
    var numero1 = 1
    var numero2 = 1

    val soma = numero1 + numero2
    val divisao = numero1 / numero2
    val resto = numero1 % numero2

    println(soma)
    println(divisao)
    println(resto)

    println("Pós ++: ${numero1++}")
    println("Pós --: ${numero1--}")
    println("Pós ++: ${++numero1}")
    println("Pré --: ${--numero1}")

}
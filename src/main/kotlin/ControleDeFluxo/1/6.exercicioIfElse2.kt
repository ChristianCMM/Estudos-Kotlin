package ControleDeFluxo.`1`

/*1.
Escreva um programa capaz de ler dois números inteiros que representam os lados
de uma figura geométrica. Informar se formam um quadrado (lados iguais).*/
fun ehQuadrado(lado1:Int,lado2:Int):String{
    return if (lado1==lado2) {
        "É quadrado"
    }else {
        "Não é quadrado"
    }
}

/*
* 2.
Escreva um programa capaz de ler três números inteiros que representam os lados de
* um triângulo. Informar se é um triângulo equilátero (todos os lados iguais).*/
fun ehTriangulo(lado1:Int,lado2:Int,lado3:Int):String{
    return if (lado1 == lado2 && lado2 == lado3) {
        "É Triangulo"
    }else {
        "Não é triangulo"
    }
}

/*
* 3.
Considere o código abaixo. Qual a saída do programa caso informado o valor 4?*/
fun qualASaida(num:Int){ // <-- "Segunga String"
    if (num>=0){
        if (num==0){
            println("Primeira String")
        }else{
            println("Segunda String")
        }
        println("TerceiraString")
    }
}

/*4.
Escreva um programa para ser usado na de portaria de um evento.

a. Peça a idade. Menores de idade não são permitidos. Mensagem: “Negado. Menores de idade não são permitidos.”.

b. Peça o tipo de convite. Os tipos de convite são comum, premium e luxo. Negar a entrada caso não seja nenhum destes. Mensagem: “Negado. Convite inválido.”.

c. Peça o código do convite. Convites premium e luxo começam com “XL”. Convites comuns começam com “XT”.
Caso o código não esteja nos padrões, negar a entrada. Mensagem: “Negado. Convite inválido.”.

d. Caso todos os critérios sejam satisfeitos, exibir “Welcome :)”.
* */
fun portaria(){
    println("Qual sua idade?")
    val idade = readLine().toString().toInt()

    if (idade<18){
        return println("Acesso negado para menores de 18 anos.")
    }

    println("Qual o tipo do seu convite?")
    val tipoConvite = readLine().toString().lowercase()
    if (tipoConvite != "luxo" && tipoConvite != "comum"
        && tipoConvite != "premium"){
        return println("Tipo de convite inválido.")
    }

    println("Qual o código do seu convite?")
    val codigoConvite = readLine().toString().lowercase()

    if (codigoConvite.startsWith("xl") && (tipoConvite == "luxo" || tipoConvite == "premium")){
        return println("Welcome :)")
    } else if (codigoConvite.startsWith("xt") && tipoConvite == "comum"){
        return println("Welcome :)")
    }else {
        return println("Negado. convite inválido.")
    }



}
// código com early return
fun portaria2(){
    println("Qual sua idade?")
    val idade = readLine()

    return if (idade.toString().toInt()<18){
        println("Acesso negado para menores de 18 anos.")
    } else {
        println("Qual o tipo do seu convite?")
        val tipoConvite = readLine()

        return if (tipoConvite.toString().lowercase() != "luxo" && tipoConvite.toString().lowercase() != "comum"
            && tipoConvite.toString().lowercase() != "premium"){
            println("Tipo de convite inválido.")
        }else{
            println("Qual o código do seu convite?")
            val codigoConvite = readLine()

            return if (codigoConvite.toString()[1].lowercase()=="l" &&
                (codigoConvite.toString()[1].lowercase() == "luxo" || tipoConvite.toString() == "premium") &&
                codigoConvite.toString()[0].lowercase() == "x"){

                println("Welcome :)")
            } else if (codigoConvite.toString()[1].lowercase() == "t" && tipoConvite.toString() == "comum" &&
                codigoConvite.toString()[0].lowercase()=="x"){

                println("Welcome :)")
            }else {
                println("Negado. convite inválido.")
            }
        }
    }
}

fun main() {
    println(ehQuadrado(2,2))
    println(ehTriangulo(3,3,3))
    println(qualASaida(4))
    portaria()
    portaria2()
}
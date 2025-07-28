package `1`.fundamentos

import java.util.Locale

//1
//Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas, minutos e segundos.

fun tranformaAno(ano:Int){
    val meses = ano * 12
    val dias = ano * 365
    val horas = dias * 24
    val minutos = horas * 60
    val segundos = minutos * 60
    return println("%d Anos tem %d Meses, %d Dias, %d Horas, %d Minutos, %d Segundos"
        .format(Locale.US,ano,meses,dias,horas,minutos,segundos))
}
//2
//Escreva uma função capaz de receber uma string e retornar a quantidade de caracteres.
fun contaCaracteres(palavra:String) = println("A palavra tem ${palavra.length} Caracteres")

//3
//Escreva uma função capaz de calcular o cubo de um número
fun calculaAoCubo(valor:Int) = "Cubo de $valor é ${valor * valor * valor}"

//4
//Escreva uma função capaz de receber milhas e converter em km
fun calculaTemp(temp:Double) = println("${(temp*9/5)+32} fahrenheit")

//5
//Escreva uma função capaz de receber Celsius e converter Fahrenheit.
fun calculaMilhaEmKm(milha:Float) = println("${milha * 1.6} Quilometros")

//6
//Escreva um programa que seja capaz de receber uma string e fazer a troca de todas as letras “a” ou “A” por “x”.
fun trocaLetras(palavra:String):String{
    return palavra.lowercase().replace("a","x")
}

//7
//Escreva as funções dos exercícios 2, 3, 4 e 5 como funções de única linha.

fun main() {
    tranformaAno(2)
    contaCaracteres("palavra")
    calculaAoCubo(3)
    calculaTemp(24.0)
    calculaMilhaEmKm(1F)
    println(trocaLetras("PALAVRA"))
}
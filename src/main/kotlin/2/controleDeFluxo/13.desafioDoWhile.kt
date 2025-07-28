package `2`.controleDeFluxo

//for
fun imprimirNumerosCrescente(){
//    Imprima os números de 1 a 50 na mesma linha em ordem crescente.
//Saída esperada:
//“1 2 3 4 5 6 7 8 9 10 … … 49 50”
    for (i in 1 .. 50){
        if (i%5==0){
            continue
        }
        print("$i ")
    }
}

fun imprimirNumerosDecrescente(){ //    Imprima os números de 1 a 50 na mesma linha em ordem decrescente.
//Saída esperada:
//“50 49 48 47 … … 2 1”
    for (i in 50 downTo 1){
        if (i%5==0){
            continue
        }
        print("$i ")
    }
}

fun somarNumerosate500(){
//Faça a soma de todos os números no intervalo de 1 a 500.

    var contador = 0
    for (i in 1 .. 500){
        contador += i
        println(contador) // 56
    }
}

//while
fun caidaDagua(){
    // Considere uma caixa d’água de 2 mil litros.
    // Rômulo gostaria de encher a caixa d’água com balões de água de 7 litros. Quantos balões cabem na caixa d’água sem que o volume seja excedido?
    var contador = 0
    val capacidadeAgua = 2000
    while (contador+1<capacidadeAgua){
        contador += 7
        println(contador/7)
    }
}

fun fizzBuzz(){
    // FizzBuzz. Imprima os números de 1 a 50 em ordem crescente de acordo com a regra abaixo:
    //a. Quando um número for divisível por 3, imprimir Buzz.
    //b. Quando um número for divisível por 5, imprimir Fizz.
    //c. Quando um número for divisível por 3 e 5, imprimir FizzBuzz.
    for (i in 1 .. 50){
        if (i % 3 == 0 && i % 5 != 0){
            println("Buzz")
        }else if(i % 5 == 0 && i % 3 != 0){
            println("Fizz")
        }else if(i % 3 == 0 && i % 5 == 0){
            println("FizzBuzz")
        }else{
            println(i)
        }

    }
}

fun nomeInvertido(){
    // Escreva um programa capaz de receber um texto e imprimi-lo invertido.
    //Entrada: Meu nome é Julius.
    //Saída: .suiluJ é emon ueM
    println("Escreva seu Nome: ")
    val nome = readLine().toString()
    println(nome.reversed())

}

fun contadorXEO(): Boolean{
    // Escreva uma função que recebe uma string, verifica se existe a mesma quantidade de caracteres ‘x’ e ‘o’ e retorna true ou false. Caso não exista nem ‘x’ nem ‘o’, retornar false.
    //
    //Exemplos:
    //“xoxoox” -> true
    //“xxxxx” -> false
    //“bdefghij” -> false
    //“ooooxzzzzz” -> false
    println("Escreva uma palavra")
    val palavra = readLine().toString().lowercase()
    var contador = 0
    var contaX = 0
    var contaO = 0
    while (contador < palavra.length){
        if (palavra[contador]=='x'){
            contaX++
        }else if(palavra[contador]=='o'){
            contaO++
        }
        contador++
    }
    return if (contaX==contaO && contaX != 0){
        true
    }else if (contaX == 0 && contaO == 0 ){
        false
    }else{
        false
    }
}

fun main() {
    // Do
    imprimirNumerosCrescente()
    println()
    imprimirNumerosDecrescente()
    println()
    somarNumerosate500()
    println()
    // While
    caidaDagua()
    fizzBuzz()
    nomeInvertido()
    println(contadorXEO())
}
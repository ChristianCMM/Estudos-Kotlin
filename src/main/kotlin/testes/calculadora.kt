package testes

import java.lang.invoke.CallSite

fun identificarSinal(contaMatematica: String): Char{
    var contador = 0
    var sinal = ' '
    for (i in contaMatematica){
        when(i){
            '+'->{
                sinal= '+'
                break
            }
            '-'->{
                sinal= '-'
                break
            }
            '*'->{
                sinal= '*'
                break
            }
            '/'->{
                sinal= '/'
                break
            }
        }
        contador++
    }
    return sinal
}

fun identificarNumero1(contaMatematica: String): Float{
    var contador = 0
    val numero = mutableListOf<Char>()
    for (i in contaMatematica){
        when(i){
            '+'->{
                break
            }
            '-'->{
                break
            }
            '*'->{
                break
            }
            '/'->{
                break
            }
        }
        numero.add(i)
        contador++
    }
    return numero.joinToString(separator = "", prefix = "", postfix = "").toFloat()
}

fun identificarNumero2(contaMatematica: String): Float{
    val numero = mutableListOf<Char>()
    for (i in contaMatematica.length-1 downTo 0){
        val letra = contaMatematica[i]
        if (letra=='+'||letra=='-'||letra=='*'||letra=='/'){
            break
        }
        numero.add(letra)
    }
    return numero.joinToString(separator = "", prefix = "", postfix = "").reversed().toFloat()
}

fun realizarCalculo(contaMatematica:String): Float{
    val sinal = identificarSinal(contaMatematica)
    val num1 = identificarNumero1(contaMatematica)
    val num2 = identificarNumero2(contaMatematica)
    var resultado = 0F
    when (sinal){
        '+'->{
            resultado= num1+num2
        }
        '-'->{
            resultado= num1-num2
        }
        '*'->{
            resultado= num1*num2
        }
        '/'->{
            resultado = num1/num2
        }
    }
    return resultado
}

fun calcular(){
    println("Informe a conta que deseja fazer:")
    val conta = readLine().toString()
    println(realizarCalculo(conta))
}

fun main() {
    calcular()
}
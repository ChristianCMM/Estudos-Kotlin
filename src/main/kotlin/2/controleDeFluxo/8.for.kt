package `2`.controleDeFluxo

import kotlin.text.iterator

fun main() {

    val str = "Programação Kotlin!"

    for (i in str){// percorre a String
        print(i)
    }

    for (j in 1 .. 10){ // conta de 1 em 1
        print(j)
    }

    for (k in 0 .. 20 step 2){ // conta de 2 em 2
        print(k)
    }

    for (l in 20 downTo  0 step 2){ // decrescente, de 2 em 2
        print(l)
    }



}
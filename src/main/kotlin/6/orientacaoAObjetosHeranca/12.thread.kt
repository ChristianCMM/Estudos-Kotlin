package `6`.orientacaoAObjetosHeranca

import kotlin.concurrent.thread

fun main() {
    println("Antes da Thread")
    // Thread = linha paralela de processamento
    thread {
        println("Dentro da Thread") // Executado por ultimo
        Thread.sleep(2500) //
    }
    println("Depois da Thread")
}
package `8`.topicosAvancados

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    // coroutines necessita de uma biblioteca
    // coroutines parecido com Thread, mas não é uma Thread
    // coroutines usa uma Thread para ser executada

    println("a")
    println("b")
    println("c")

    // bloqueia a interface para rodar uma função até ser concluida
    // runblocking é executado de forma sincrona
    // não indicado para produção
    runBlocking {
        // "launch" lança uma nova coroutine
        launch {
            // "delay" aguarda para executar o proximo item
            delay(2000) // função suspensa
            println("f1")
            helloworld()
        }
        launch {
            // "delay" aguarda para executar o proximo item
            delay(500)
            println("f2")
        }
    }

    // "coroutineScope"
    coroutineScope {

    }

    println("d")
    println("e")
}

suspend fun helloworld(){
    println("olá, mundo!")
}
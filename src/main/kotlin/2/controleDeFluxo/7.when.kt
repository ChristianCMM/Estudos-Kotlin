package `2`.controleDeFluxo

fun exemploWhen():String{
    println("Escreva um numero:")
    val numero = readLine().toString().toInt()
    return when (numero){
        1->{
            "numero é 1"
        }
        in 2..9->{
            "numero de 2 a 9"
        }
        else -> {
            "numero é $numero"
        }
    }
}

fun main() {
    println(exemploWhen())
}
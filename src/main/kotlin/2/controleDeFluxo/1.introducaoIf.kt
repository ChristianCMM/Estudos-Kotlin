package `2`.controleDeFluxo

fun ehManha(manha: Boolean){
    if (manha){
        println("acorde!!")
    }
}

fun main() {
    val str = "Programação Kotlin"

    if (str.contains("a")){
        println("verdadeiro")
    }
    ehManha(true)
    ehManha(false)
}
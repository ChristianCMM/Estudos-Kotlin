package `3`.exceçõesNullSafety

fun main() {
    // PARTE1 ?: PARTE2
    var str: String? = null
    println(str?:"Texto")

    str = "Outro texto"
    println(str?:"Texto")
    // Usado para tratamento de valores nulos <---
}
package `3`.exceçõesNullSafety

// Throw

fun divisao(n1: Int, n2: Int):Int{
    if(n2==0){
        throw Exception("Divisor não pode ser Zero.")
    }
    return n1/n2
}

fun main() {
    try {
        divisao(6,0)
    }catch (e: Exception){
        println(e.message)
    }
}
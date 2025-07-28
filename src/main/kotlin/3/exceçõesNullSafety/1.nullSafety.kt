package `3`.exceçõesNullSafety

fun main() {
    // val str: String = null <- Erro (null safety)
    // forçando a declaração de null com ?
    val str: String? = null

    // acessando os parametros de null com ?
    println(str?.length)

    // forcando acessar a String, mesmo podendo ser null e apresentando excessão
    println(str!!.length)

    // lidando com uma variavel que pode ser null
    val abc = readLine()
    if (abc != null){
        abc.toShort()
    } else {
        "Informe um valor valido."
    }
}
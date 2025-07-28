package `3`.exceçõesNullSafety

/* parametro LET é usado para variaveis que podem ser nulas
*Dentro do escopo, deve-se utilizar o "it" para se referir a propria
* variavel
*/

// caso o valor seja NULL, não será apresentado nada
fun main() {
    var str: String? = null

    str?.let {
        println(it.length) // não apresenta nada (Null)
    }

    str = "Outro texto"
    str?.let {
        println(it.length) // apresenta o tamanho da String
    }
}
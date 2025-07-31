// retorno Nothing não pode existir
// apenas utilizado para "Throw" com uma "exception()"
// utilizado apenas para marcar uma função que quer criar, mas sem corpo atualmente
fun abc(): Nothing{
    //lógica
    throw Exception("Função ainda não criada")
}

// Any suporta todos os tipos de dados
fun media(vararg valores:Any){
    for (i in valores){
        if(i is String){
            println("String")
        }

        when(i){
            is Float -> println("Float")
            is Int ->  println("Int")
            is String ->  println("String")
            is Boolean -> println("Boolean")
            is Char -> println("Char")
        }
    }
}

fun main() {
    media(10F,1,"",true,'a')
    abc()
}
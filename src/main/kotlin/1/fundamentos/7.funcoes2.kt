package `1`.fundamentos

fun helloWorld(nome: String){
    println("Olá, $nome!")
}

fun media(n1: Int,n2:Int):Int{
    val media = (n1+n2)/2
    return media
}

fun main() {
    helloWorld("Christian")
    println(media(2,2))
}

// declarando um tipo gererico com qualquer letra (Ex: "T")
// desta forma, não é necessário fazer uma validação com IF para verificar o tipo do parametro
fun <T> empacotar(x: T):T{
    return x
}

class MyClass<T>{
    fun save():T{
        return TODO("Provide the return value")
    }
    fun delete():T{
        return TODO("Provide the return value")
    }
}

fun main() {
    listOf(10)
    val abc = empacotar(10)
    val abc2 = empacotar("texto")

}
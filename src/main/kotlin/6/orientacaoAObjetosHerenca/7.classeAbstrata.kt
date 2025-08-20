// uma classe abstrata serve para utilizar os mesmos metodos para outros objetos com funções diferentes
abstract class Mamifero(val nome:String){
    abstract fun falar()

    fun dormir(){}
    fun acordar(){
        println("Acordei")
    }
}

class Cachorro(nome:String): Mamifero(nome){
    override fun falar() {
        println("au au")
    }
}

class Gato(nome:String): Mamifero(nome){
    override fun falar() {
        println("miau")
    }
}

fun main() {

}
package `6`.orientacaoAObjetosHerenca

// diferença entre Interface e Classe Abstrata: interface não pode armazenar Estado(Ex: declarar variaveis)
interface Selvagem {
    var str: String

    fun atacar()

}

abstract class Mamifero(val nome:String){
    abstract fun falar()

    fun dormir(){}
    fun acordar(){
        println("Acordei")
    }
}

class Cachorro(nome:String): Mamifero(nome), Selvagem/*implementando a interface*/{
    override fun falar() {
        println("au au")
    }

    override var str: String
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun atacar() {
        TODO("Not yet implemented")
    }
}

class Gato(nome:String): Mamifero(nome){
    override fun falar() {
        println("miau")
    }
}

fun main() {

}
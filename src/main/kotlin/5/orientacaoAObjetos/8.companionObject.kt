// companion object serve para acessar atributos das classes, sem precisar instancia-las
class Matematica{
    val PI = 3.1415
    companion object{
        val PI = 3.1415

        fun abc(){
            println("sou a classe Matemática")
        }
        init {
            println("Fui chamado!")
        }
    }

    object Obj1{
        var abc = "minhaString"
        fun minhaFuncao(){

        }
        init {
            println("fui chamado! OBJ1")
        }
    }
    object Obj2{

    }
}

fun main(){
    // acessando PI pelo Companion Object
    // está fora do Escopo do Objeto
    // está dentro do Escopo da Classe
    Matematica.PI
    Matematica.abc()

    // Acessando PI inicializando a variavel
    Matematica().PI

    // Explorando o Companion Object
    // companion objetc só é inicializado no momento em que é chamado pela primeira vez

    // neste exemplo, o "init" deve aparecer apenas 1 vez, pois o init é chamado quando a classe é inicializada
    println(Matematica.PI)
    println(Matematica.PI)

    //chamando Objetos dentro das classes
    Matematica.Obj1.abc
    Matematica.Obj1.minhaFuncao()


}
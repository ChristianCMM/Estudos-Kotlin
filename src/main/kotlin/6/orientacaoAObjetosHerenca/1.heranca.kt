package `6`.orientacaoAObjetosHerenca

open class Eletronico(var marca:String, preco: Float){
    fun ligar(){}
    fun desLigar(){}
}

class Computador(marca:String, preco:Float): Eletronico(marca,preco){
    fun instalarSoftware() {
        super.ligar() // referenciando a classe superior (Eletronico)
        println("Instalando...")
        println("Instalado.")
        super.desLigar()
    }
}

class Microfone (marca: String, preco: Float): Eletronico(marca,preco){
    fun gravar(){

    }
}

fun main() {
    val computador= Computador("Dell", 5000F).instalarSoftware()
    val mic=Microfone("",25F)

}
fun main() {
    val cachorro = CriarAnimal(Animais("cachorro", "amarelo", "au au"))
    cachorro.barulho()
    cachorro.possuemMamas()
    println(cachorro.raca)
    println(cachorro.som)
    println(cachorro.cor)
}

open class Mamiferos(){
    open fun possuemMamas(): Boolean{
        return true
    }
}

class CriarAnimal(animal: Animais):Mamiferos(){
    val raca = animal.raca
    val cor = animal.cor
    val som = animal.som
    fun barulho():String{
        return "O $raca de cor $cor faz $som"
    }
}



data class Animais(var raca:String, val cor: String, val som:String)
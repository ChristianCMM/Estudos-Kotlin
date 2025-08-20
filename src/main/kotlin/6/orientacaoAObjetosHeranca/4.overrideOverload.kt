open class Eletronico(var marca:String, preco: Float){
    private var correnteEletrica = false
    open fun ligar(){
        correnteEletrica = true
    }
    fun desLigar(){
        correnteEletrica = false
    }
}

class Computador(marca:String, preco:Float): Eletronico(marca,preco){
    // sobrescrevendo uma função
    // a função sobrescrita deve ser "open"
    override fun ligar(){
        super.ligar() // alterando a "corrente eletrica" para true
        println("Carregar o sistema Operacional")
    }

    fun instalarSoftware() {
        super.ligar() // referenciando a classe superior (Eletronico)
        println("Instalando...")
        println("Instalado.")
        super.desLigar()
    }
}

fun main() {
    val computador= Computador("Dell", 5000F).instalarSoftware()
}

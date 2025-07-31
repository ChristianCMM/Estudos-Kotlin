// Class nomeDaClass(Atributos)
class Pessoa1(var nome: String, val anoNascimento: Int) {

    // executado quando é instanciado
    // é interessante utilizar o INIT para criar regras para os objetos criados
    init {
        if (anoNascimento<0){
            throw Exception("Ano Nascimento não pode ser negativo")
        }
    }
    // init é executado ANTES do construtor secundario
    init {
        println("classe criada")
    }

    fun acordar() {}
    fun dormir() {}
}

class Pessoa2(var nome: String, val anoNascimento: Int) {
    var doc:String=""

    init {
        if (anoNascimento<0){
            throw Exception("Ano Nascimento não pode ser negativo")
        }
    }
    // init é executado ANTES do construtor secundario
    init {
        println("Primeiro: classe criada")
    }

    constructor(nome:String,anoNascimento: Int, doc: String):this(nome,anoNascimento){
        println("Segundo: Construtor secundario")
        if (doc==""){
            throw Exception()
        }
    }

    fun acordar() {}
    fun dormir() {}
}



fun main() {
    val p1: Pessoa2 = Pessoa2("Fulano", 2000, "meuDoc")
//    val p2: Pessoa2 = Pessoa2("Fulano", -2000,"meuDoc")

}
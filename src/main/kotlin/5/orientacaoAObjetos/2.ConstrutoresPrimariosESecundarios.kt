// Pessoa(Atributos)
class Pessoa(var nome: String, val anoNascimento: Int) {

    var doc:String=""

    // Construtor secunradio Secundario
    // Construtor secundario precisa chamar o primario com ":this(parametros do construtor primario)"
    constructor(nome:String,anoNascimento: Int, doc: String):this(nome,anoNascimento){
        //this - refere-se a classe, no caso, "Pessoa"
        // no construtor secundario, pode-se criar logica, como controle de fluxo
        if (doc==""){
            throw Exception()
        }

        // Atribudindo a variavel do construtor secundario a variavel do construtor primario
        this.doc = doc
    }

    fun acordar() {}
    fun dormir() {}
}

fun main() {
    val p: Pessoa = Pessoa("Fulano", 2000)
    val p2: Pessoa = Pessoa("Fulano", 2000, "meuDocumento")
    println(p2.doc)

    // construtor

}
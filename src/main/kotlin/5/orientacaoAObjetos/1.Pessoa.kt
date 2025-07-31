package `5`.orientacaoAObjetos

// Pessoa(Atributos)
class Pessoa(var nome: String, val anoNascimento: Int = 0) {

    var abc:String=""

    fun acordar() {}
    fun dormir() {}
}


fun main() {
    var p: Pessoa = Pessoa("Fulano", 2000)
    p.nome
    p.anoNascimento
    p.acordar()
}
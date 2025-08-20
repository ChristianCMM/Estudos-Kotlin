// classe aberta que há acesso externo
open class Visibilidade1{
    // variavel apenas aparente dentro das classes e de quem à herda
    protected var str: String = "minhaString"

    // função privada, sem acesso fora da classe
    private fun abc(){}
}

class VisibilidadeHerdada: Visibilidade1(){
    fun teste(){
        // abc() <- Gera Erro
        println(str)
    }
}

fun main() {
    // Public, private, protected
    VisibilidadeHerdada().teste()
}

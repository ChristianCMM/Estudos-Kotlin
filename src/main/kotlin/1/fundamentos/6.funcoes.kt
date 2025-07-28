package `1`.fundamentos

fun main() {
    //tipos de retorno
    // 1: Tipo "Unit" diz que a função não possui retorno, executando seu corpo e termina a execução

    //2: Tipo "Double, Float, "Long", "Int", "Short", "Byte", "Boolean", "String" e "Char"

    //3: Tipo "Instancia de classes

    // Exemplo:
    fun mostrarNome(nome:String):String{
        val texto = "Exemplo: $nome"
        return texto
    }
    mostrarNome("Cristian")

    // fun NomeDaFuncao (Variavel: TipoDaVariavel): TipoDeRetorno{ Corpo da Função }
}
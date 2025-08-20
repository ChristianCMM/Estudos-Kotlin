package `6`.orientacaoAObjetosHeranca

// também pode-se utilizar "Interface" ao invés de uma "abstract class"
interface Funcionario{
    fun calculaBonus(): Float
}


fun imprimiBonus(funcionario: Funcionario){// "tipo" funcionario
    // lógica
    // lógica
    // lógica
    // lógica
    println(funcionario.calculaBonus())
}

fun main() {
    imprimiBonus(object : Funcionario{
        override fun calculaBonus(): Float {
            return 0F
        }
    } )
}
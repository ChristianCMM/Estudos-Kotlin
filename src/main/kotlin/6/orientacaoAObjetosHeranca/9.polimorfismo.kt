
// também pode-se utilizar "Interface" ao invés de uma "abstract class"
abstract class Funcionario(){
    abstract fun calculaBonus(): Float
}

class Gerente: Funcionario(){
    override fun calculaBonus(): Float {
        return 3000F
    }
}

class Analista: Funcionario(){
    override fun calculaBonus(): Float {
        return 5000F
    }
}


fun imprimiBonus(funcionario: Funcionario){// "tipo" funcionario
    println(funcionario.calculaBonus())
}

fun main() {
    imprimiBonus(Gerente())// inicializando o "Gerente()" e chamando-o com a função
    imprimiBonus(Analista())
}
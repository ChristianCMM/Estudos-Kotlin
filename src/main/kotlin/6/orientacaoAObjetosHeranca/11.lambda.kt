package `6`.orientacaoAObjetosHeranca

fun interface Funcionario2{ // <-- SAM
    fun calculaBonus(str:String,id:Int): Float
}

fun imprimiBonus(funcionario: Funcionario2){// "tipo" funcionario
    println(funcionario.calculaBonus("minhaString",10))
}

fun main() {
    // Lambda e classe anonima são iguais, apenas o modo de escrever que é diferente
    // lambda pode ser utilizada em uma SAM
    // pode-se declarar variaveis dentro do lambda com "->"
    imprimiBonus { stringExemplo, idExemplo ->
        println(stringExemplo)
        0F
    }
}
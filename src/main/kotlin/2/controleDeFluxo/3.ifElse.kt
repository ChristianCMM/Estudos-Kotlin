package `2`.controleDeFluxo

fun maiorDeIdade(idade:Int): Boolean {
    // return (idade>=18) <-- outra forma de escrever o mesmo código
    // OBS: Também pode ser escrito uma função de unica linha

    if (idade>=18){
        return true
    }else{
        return false
    }
}

// Exercidio:
// escrever um código que mostra se o custo de um curso da faculdade

// informatica - 500
// geografia - 600

fun mensalidadeCurso(curso: String):Double{
    if (curso=="informatica"){
        return 500.0
    }else if(curso=="geografia"){
        return 600.0
    }else{
        return -1.0 // -1.0 = não existe
    }
}

fun main() {
    maiorDeIdade(15)
    mensalidadeCurso("direito")
}
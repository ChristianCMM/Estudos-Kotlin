fun leituraNumeroPositivo(enunciado: String): Int{
    // aguarda o usuário colocar um numero maior que Zero
    while (true){
        println(enunciado)
        val input = readLine()
        // trata o input para retornar o valor em inteiro
        if(input!=null){
            try {
                val numero = input.toInt()
                if (numero>0){
                    return numero
                }else{
                    println("Escreva um numero positivo.")
                }
            }catch (erro: Exception){
                println("Escreva um valor válido.")
            }
        }else{
            println("Escreva um numero valido.")
        }
    }
}

fun verificaQuadrado(){
    val lado1= leituraNumeroPositivo("Escreva o numero 1: ")
    val lado2= leituraNumeroPositivo("Escreva o numero 2: ")
    if(lado1==lado2){
        return println("É um quadrado.")
    }else{
        return println("Não é quadrado")
    }
}

fun main() {
    verificaQuadrado()
}
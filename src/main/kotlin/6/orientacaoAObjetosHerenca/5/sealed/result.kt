package `6`.orientacaoAObjetosHerenca.`5`.sealed

// "Sealed" fechada para herança fora do pacote
sealed class Result {
}

class Success : Result(){}
class Fail : Result(){}

fun main() {

}
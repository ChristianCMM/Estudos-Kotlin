package fundamentos

fun main() {
    val soma = 2+2
    val subtracao = 2-2
    val multiplicacao = 2 * 2
    val divisao = 2 / 2
    val resto = 2 % 2

    var valor = 0
    valor = valor + 15
    // ou
    valor+= 15
    println(valor)

    // adicionar ou diminuir em 1 unidade
    println(valor++)
    println(valor--)// o valor é incrementado depois de ser usado
    println(++valor)// o valor é incrementado antes de ser usado
    println(--valor)

    println(2+2)
}
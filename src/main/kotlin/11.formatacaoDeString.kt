import java.util.Locale

fun main() {
    val nome = "Jhon"
    println("olá $nome")

    // formatação utilizando PLACEHOLDER, com "%s" para String
    "Olá, %s".format(nome)
    "Olá, %s %s".format(nome, nome)

    // %s - String
    // %d - Int
    // %f - Float
    // %c - Char
    // %b - Bloolean

    val valor = 5
    val salario = 16855.95

    println("Valor: %d - Salario: %f".format(valor, salario))

    // Diferenças entre PLACEHOLDER e INTERPOLAÇÃO:
    // consigo modificar os valores a partir do placeholder
    //Ex:
    println("Valor: %02d - Salario: %.2f".format(valor, salario))
    // "%02d" informa que o valor tem 2 numeros, no caso "0" e "5"
    // caso fosse "%03d" o valor seria "005"
    // "%.2f" infomra a quantidade de numeros depois da virgula

    // localizando o valor que será retornado, trocando o ponto pela virgula, com "locale"
    println("Valor: %02d - Salario: %.2f".format(Locale.US,valor, salario))
}
fun main() {
    val str = "Programação Kotlin!"

    println(str[0])
    println(str.length)

    println(str.startsWith("Progra"))
    println(str.endsWith("."))

    println(str.substring(6))
    println(str.substring(6,8))
    println(str.replace("o","a"))

    println(str.uppercase())
    println(str.lowercase())
    println(str.contains("Kotlin"))

    println(str.isEmpty())
}
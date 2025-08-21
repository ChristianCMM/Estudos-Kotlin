
fun main() {
    // chave, valor
    // não aceita valores repetidos
    val map1 = mapOf<String,String>(Pair("chave", "valor"),Pair("chave", "valor2"))
    val map2 = mutableMapOf<String,String>(Pair("chave", "valor"),Pair("chave", "valor2"))
    // adicionando valor
    map2["Brasil"] = "brasilia"
    map2.remove("Brasil")

    println(map1.keys)
    println(map1.values)
    println(map1.contains("Brasil"))
    println(map1.containsKey("Brasil"))
    println(map1.containsValue("brasilia"))
    map2.clear()

    // outra maneira de declarar um MAP
    val config = mapOf(
        "URl" to "www.google.com"
    )


}
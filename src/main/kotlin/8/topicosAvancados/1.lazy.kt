package `8`.topicosAvancados

class ConfigManager{
    val UserLanguage = "pt-br"

    val databaseConfig: Map<String, String> by lazy {
        loadDatabaseConfiguration()
    }

    private fun loadDatabaseConfiguration():Map<String,String>{
        return mapOf(Pair("Config", "configuração"))
    }
}

fun main() {
    // lazy
    // atrasar o acesso a uma variavel que possa ser pesada para poupar processamento
    // nunca será inicializada caso não seja chamada
    val str: String by lazy {
        println("inicializando")
        "Meu texto"
    }

    println(str)// a partir daqui ela é inicializada
    val configManager = ConfigManager()
    configManager.databaseConfig // função custosa
}
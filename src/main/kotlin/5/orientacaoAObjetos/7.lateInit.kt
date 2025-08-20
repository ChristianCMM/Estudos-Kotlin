class DataBase{
    fun openConnection(){
        println("Conexão estabelecida.")
    }
}

class Server{
    lateinit var db: DataBase

    fun initServer(){
        // para não dar erro, é necessário verificar se a variavel foi inicializada com "::"
        if (!::db.isInitialized){
            db = DataBase()
        }
        db.openConnection()
    }
}
fun main() {
    val server = Server()
    server.initServer()
}
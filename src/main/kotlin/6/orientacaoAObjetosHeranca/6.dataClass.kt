package `6`.orientacaoAObjetosHeranca

fun main() {
    val e1 = DataEndereco("rua 1", "cidade 1")
    val e2 = DataEndereco("rua 1", "cidade 1")

    // DataClass possui uma funcionalidade para copiar dados sem alterar o apontamento de memória, com ".copy()"
    val e3 = e1.copy()

}
fun endereco(endereco: DataEndereco): Boolean{
    // exemplo
    return if (endereco.rua == "rua 1"){
        true
    }else {
        false
    }
}

class Endereco(var rua:String, var cidade:String){}

// Data class serve para agrupar dados e ficar mais enxuto para utilizar os parametros dela
data class DataEndereco(var rua:String, var cidade:String){}

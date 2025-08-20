package `5`.orientacaoAObjetos

class Animal {
    var idade: Int = 0
        set(value) {
            var valorMaximo = 10000
            if (value<valorMaximo){
                field = value
            }
        }
    var nome:String = ""
    var genero:String = ""
        set(value){
            if (value is String){
                field = value
            }
        }
    get() {
        return field
    }

}

fun main() {
    val novoAnimal: Animal = Animal()
    novoAnimal.idade=20
    println(novoAnimal.nome)

    novoAnimal.genero="masculino"
    println(novoAnimal.genero)
}
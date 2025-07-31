package `5`.orientacaoAObjetos

class Animal {
    var nome:String = ""
    var genero:String = ""
    get() {
        return field
    }
    set(value) {
        field = value
    }
}

fun main() {
    val novoAnimal: Animal = Animal()
    novoAnimal.nome="Cachorro"
    println(novoAnimal.nome)

    novoAnimal.genero="masculino"
    println(novoAnimal.genero)
}
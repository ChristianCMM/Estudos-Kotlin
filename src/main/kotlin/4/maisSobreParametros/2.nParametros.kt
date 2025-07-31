
// "vararg" = argumentos variaveis
// deve ser o ultimo parametro
fun media(vararg valores: Float): Float{
    var notas = 0F
    for (i in valores){
        notas+=i
    }
    return notas/valores.size
}
fun main() {
    media(10F,5F,15F,20F)
}
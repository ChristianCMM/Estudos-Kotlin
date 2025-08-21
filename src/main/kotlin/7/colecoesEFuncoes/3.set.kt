
fun main() {
    // set não pode ter valores repetidos
    val set1 = setOf<Int>(10,20,20,30)
    val set2 = mutableSetOf<Int>(10,20,20,30)

    println(set1)
    println(set2)
    println(set2.size)
    println(set2.add(40))
    println(set2.remove(20))
    println(set2.contains(20))
    println(set2.clear())

}
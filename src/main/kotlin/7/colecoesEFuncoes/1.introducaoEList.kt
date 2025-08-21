fun main() {
    // lista imutavel
    val list1 = listOf("texto",1,2,3,4,5,6,7,8)
    val list2 = listOf<Int>(1,2,3,4,5,6,7,8)

    val list3 = mutableListOf<Int>(1,2,3,4,5,6,7,8)
    println(list3.size)
    println(list3.add(0,9))
    println(list3.contains(2))
    println(list3)
    println(list3.removeLast())

}
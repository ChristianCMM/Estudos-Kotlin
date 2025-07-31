package codewars

fun invert(arr: IntArray): IntArray {
    for (i in arr.indices){
        arr[i]=arr[i]*-1
    }
    return arr
}

fun main() {
    println(invert(intArrayOf(1,2,3,-4)).joinToString())
}
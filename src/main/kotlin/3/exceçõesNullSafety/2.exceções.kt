package `3`.exceçõesNullSafety

fun main() {
    // simulando exceções
    //val str: String? = null

    //print(str!!.length)

//    println(10/0)

//    val abc = "jisbgs"
//    println(abc[100])
// ----------------------
    //try catch

    val abc = "christian"
    try {
        println(10/0)
        println(abc[100])
    }catch (e: IndexOutOfBoundsException){
        //capturar / tratar
        println("Erro - Index")
    }catch (e: ArithmeticException){ // varios catches em 1 try
        println("Erro na divisão por 0")
    }catch (e: Exception){ // Exceção generica (Precisa ser a ultima)
        println("Erro generico")
    } finally { // é executado, com exceção ou sem exceção
        println("Finalmente")
    }

}
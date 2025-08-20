class Visibilidade{
    var str: String = "minhaString"
    fun abc(){
        NestedClass()
    }

    // Nested - Interna
    // classe externa enxerga a classe interna
    // classe interna não enxerga a classe externa
    private class NestedClass(){
        val id: Int = 0

        fun teste(){

        }
    }
    // colocando "inner" a classe passa a enxergar os atributos da classe pai
    private inner class NestedClass2(){
        val id: Int = 0

        fun teste(){
            abc()
        }
    }
}
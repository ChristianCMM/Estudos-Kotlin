package `2`.controleDeFluxo

/*Calculo de bonus de funcionario baseado em tempo de empresa
* menos de um ano -> 500
* 1 a 3 anos      -> 2000
* 4 anos ou mais  -> 5000*/

fun calculaBonus(tempo:Int): Float{
    if (tempo==0){
        return 500F
    }else if (tempo in 1..3){
        return 2000F
    } else if(tempo >= 4){
        return 5000F
    }
    return 0F
}

fun main() {
    calculaBonus(1)
}
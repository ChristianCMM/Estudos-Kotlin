package ControleDeFluxo.`1`

fun calculaBonus(cargo:String,anosDeCasa:Int): Float{
    val cargoLowerCase = cargo.lowercase()

    return if(cargoLowerCase=="gerente"){
        return if (anosDeCasa<=2){
            2000F
        }else{
            3000F
        }
    }else if (cargoLowerCase == "coordenador"){
        return if (anosDeCasa<1){
            1500F
        }else {
            1800F
        }
    }else if (cargoLowerCase == "engenheiro"){
        1000F
    }else if (cargoLowerCase == "estagiario"){
        500F
    }else{
        0F
    }
}

fun comparacoes(){
    println(
        (true&&false&&true&&true)
    )
    println(
        (!false&&!false&&(true&&true))
    )
    println(
        (false&&((false||true)||true))
    )
    println(
        (false||((!false&&true)||true))
    )
}

fun main() {
    println(calculaBonus("gerente",1))
    println(comparacoes())
}
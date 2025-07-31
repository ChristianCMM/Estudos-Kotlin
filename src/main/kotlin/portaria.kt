fun verificaIdade(idade: Int): Boolean{
    return idade>18
}

fun verificaConvite(convite:String): Boolean{
    val conviteLow=convite.lowercase()
    if (conviteLow != "luxo" && conviteLow != "comum"
        && conviteLow != "premium"){
        return true
    }else{
        return false
    }
}

fun verificaCodigo(codigo:String,tipoConvite: String): Boolean{
    val codigoLow = codigo.lowercase()
    val tipoConviteLow = tipoConvite.lowercase()
    return if ((tipoConviteLow == "luxo" || tipoConviteLow == "premium") && codigoLow.startsWith("xl")){
        true
    } else if (tipoConviteLow == "comum" && codigoLow.startsWith("xt")){
        true
    }else {
        false
    }
}

fun portaria(idade:Int,tipoConvite: String,codigoConvite:String):String{
    if (verificaIdade(idade)==false){
        return "Entrada proibida para menores de 18 anos."
    }

    if (verificaConvite(tipoConvite)==true){
        return "Tipo de convite inválido."
    }

    if (verificaCodigo(codigoConvite, tipoConvite)==true){
        return "Welcome :)"
    }else{
        return "Tipo de convite inválido."
    }
}
//fun maisSobreParametros.main() {
//    portaria(17,"comum","xlfnuioa")
//    println(portaria(22,"comum","xtcodigo"))
//    portaria(22,"luxo","xlCodigo")
//}
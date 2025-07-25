package ControleDeFluxo.`1`

// break para e sai do laço de repetição
// continue para, mas não sai do laço de repetição

fun main() {
    for(i in 0 .. 20){
        if(i==5){
            continue
        }
        if (i==10){
            break
        }
        print(i)
    }

}

package collections

//Inicio da funçao com array
fun main(args: Array<String>) {
    //Declaracao da variavel  para Matriz
    val matriz = Array(3) { arrayOfNulls<Int>(3) }
    //Valores e suas posicoes
    matriz[0][0] = 1
    matriz[0][1] = 2
    matriz[0][2] = 3
    matriz[1][0] = 4
    matriz[1][1] = 5
    matriz[1][2] = 6
    matriz[2][0] = 7
    matriz[2][1] = 8
    matriz[2][2] = 9

    for ((linha, linhaArray) in matriz.withIndex()){
        for ((coluna, valor) in linhaArray.withIndex()) {
            println("[linha] [$coluna] = ${matriz[linha][coluna]}")
        }
}
          matriz.forEach {
             it.forEach {
        //Resultado final
        println(it)
    }
}
}
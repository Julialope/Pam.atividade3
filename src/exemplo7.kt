
package collection;

//inicio da classe
data class Frutas(var nome: String, var preco: Double)

//Inicio da funçao com array
fun main(args: Array<String>) {
    //variavel e seus valores
    var frutas = arrayListOf(Frutas("Banana", 1.50), Frutas("Laranja", 3.20))

    for (fruta in frutas) {
        //Resultado final
        println("Nome: ${fruta.nome} - R$ ${fruta.preco}")
    }
}

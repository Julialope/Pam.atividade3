
package collections

//Inicio da funçao com array
fun main(args: Array<String>) {
    // Declaração de uma lista
    val strings = arrayListOf("Carro", "Moto", "Barco", "Avião")
    
    for (item in strings) {
        // Imprime cada elemento em letras maiúsculas
        println(item.toUpperCase())
    }
}

package collections

//Inicio da funçao com array
fun main(args: Array<String>) {

    //Variavel Array com valores diferentes
    val listaMix = arrayListOf("Rafael", true, 1, 3.14, 'p')
    for(item in listaMix) {
        if(item is String) { // smart cast
            println(item.toUpperCase())
        }
        else {
            //Resultado final
            println(item)
        }
    }
}

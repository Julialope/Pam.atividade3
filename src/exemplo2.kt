
 // Início da função principal
fun main(args: Array<String>) {

    // Solicitação do primeiro número
    println("Digite o primeiro número: ")
    // Valor do primeiro número
    val primeiroNumero: Int = readLine()!!.toInt()

    // Solicitação do segundo número
    println("Digite o segundo número: ")
    // Valor do segundo número
    val segundoNumero: Int = readLine()!!.toInt()

    // Multiplicação dos dois números
    val resultado: Int = primeiroNumero * segundoNumero

    // Impressão do resultado da multiplicação
    println("O resultado da multiplicação é $resultado")
}

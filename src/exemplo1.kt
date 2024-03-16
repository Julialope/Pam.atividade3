
package lambdas

//Classe Aluno.
data class Aluno(val nome: String, val nota: Double)

//Inicio da função Main com Array
fun main(args: Array<String>) {

    //Variavel com lista de alunos e suas notas
    val alunos = arrayListOf(
        Aluno("Pedro", 7.4),
        Aluno("Artur", 8.0),
        Aluno("Rafael", 9.7),
        Aluno("Ricardo", 5.7)
    )
    //Variavel para alunos com nota maior que 7
    val aprovados = alunos.filter { it.nota > 7.0 }.sortedBy { it.nome }

    //Exibição de resultados finais.
    println(aprovados)
}
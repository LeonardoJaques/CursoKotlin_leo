package Lambdas

class Produto(val nome: String, val preco: Double )
val materialEscolar = listOf(
        Produto("Fichario escolar", 21.90),
        Produto("Lapis de cor", 11.90),
        Produto("Borracha Bicolor", 0.70),
        Produto("Apontador Com Depósito", 1.80)
)

fun main(args: Array<String>) {
    val totalizar = { total: Double, atual: Double -> total + atual }
    val precoTotal = materialEscolar.map { it.preco }.reduce(totalizar)

    println("O preço médio é ${precoTotal / materialEscolar.size}.")
}
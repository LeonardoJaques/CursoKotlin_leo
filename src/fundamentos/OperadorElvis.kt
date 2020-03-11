package fundamentos

fun main(args: Array<String>) {
    val opcional: String? = null
    val Obrigatoria: String = opcional ?: "Valor Padrão"

    println(Obrigatoria)
}
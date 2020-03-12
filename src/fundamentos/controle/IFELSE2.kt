package fundamentos.controle

fun main(args: Array<String>) {
    val num1: Int = 7
    val num2: Int = 3

    val maiorValor = if (num1>num2){
        println("Processando... IF")
        num1
    } else {
        println("Processando... Else")
        num2
    }
    println("O maior valor é $maiorValor.")
}
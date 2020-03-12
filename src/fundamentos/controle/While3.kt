package fundamentos.controle

fun main(args: Array<String>) {
    var opcao: Int = 0

    do {
        var line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("Você escolheu a opção $opcao")
    } while (opcao != -1)
    println("Até a próxima!")
}
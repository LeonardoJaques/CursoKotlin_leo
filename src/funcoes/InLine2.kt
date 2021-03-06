package funcoes

inline fun <T> executarComLog(nomeDaFuncao: String, funcao: () -> T): T {
    println("Entrando no método $nomeDaFuncao")
    try {
        return funcao()
    } finally {
        println("Método $nomeDaFuncao finalizado...")
    }
}

fun somar2(a: Int, b: Int): Int {
    return a + b
}

fun main(args: Array<String>) {
    val resultado = executarComLog("somar") {
        somar2(4, 5)
    }
    println(resultado)
}
package fundamentos

fun main(args: Array<String>) {
    var a:Int? = null
    print(a?.inc())

    println("Momento do Erro...")
    println(a!!.inc())
}
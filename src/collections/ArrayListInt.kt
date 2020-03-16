package collections

fun main(args: Array<String>) {
    val pares = arrayListOf(2, 4, 6)
    val imparaes = intArrayOf(1, 3, 5)

    for (n in imparaes.union(pares).sorted()){
        print("$n ")
    }
}
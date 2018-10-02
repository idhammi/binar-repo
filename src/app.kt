
fun main(args: Array<String>){
    println("Calculator")
    println(penjumlahan(1, 2))
    println(pengurangan(1, 2))
    println(pembagian(1f, 2f))
    println(perkalian(1, 2))
}

fun penjumlahan(a: Int, b: Int): Int = a + b

fun pengurangan(a: Int, b: Int): Int = a - b

fun pembagian(a: Float, b: Float): Float = a / b

fun perkalian(a: Int, b: Int): Int = a * b

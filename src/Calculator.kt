fun main(args: Array<String>) {
    try {
        print("Nilai 1: ")
        val nilai1 = readLine()?.toInt()
        print("Nilai 2: ")
        val nilai2 = readLine()?.toInt()

        println("1. Tambah")
        println("2. Kurang")
        println("3. Kali")
        println("4. Bagi")
        print("Pilihan: ")
        val pilihan = readLine()?.toInt()

        when (pilihan) {
            1 -> hitung(nilai1, nilai2) { n1, n2 ->
                println("$n1 + $n2 = ${n1 + n2}")
            }
            2 -> hitung(nilai1, nilai2) { n1, n2 ->
                println("$n1 - $n2 = ${n1 - n2}")
            }
            3 -> hitung(nilai1, nilai2) { n1, n2 ->
                println("$n1 * $n2 = ${n1 * n2}")
            }
            4 -> hitung(nilai1, nilai2) { n1, n2 ->
                println("$n1 / $n2 = ${n1 / n2}")
            }
            else -> println("Inputan tidak ada")
        }
    } catch (ex: NumberFormatException) {
        println("Inputan tidak boleh huruf")
    }
}

fun hitung(nilai1: Int? = 0, nilai2: Int? = 0, hasil: (Int, Int) -> Unit) {
    when (null) {
        nilai1 -> println("Inputan 1 tidak boleh kosong")
        nilai2 -> println("Inputan 2 tidak boleh kosong")
        else -> hasil(nilai1, nilai2)
    }
}
fun main(args: Array<String>) {
    val s = "Mantap" //tipe data fix String
    val a = 10
    val b = if (a > 10) 1 else 3
    val d = 10
    val item = arrayOf(1, "String", 3, 4f, 5.0, true, 'C')

    println(s)
    println(b)

    if (a.equals(10)) {
        println(a)
    }

    //when 1
    when (b) {
        1 -> println(b * 1)
        2 -> println(b * 2)
        else -> println("b unknown")
    }

    //when 2
    val c = 8
    when {
        c % 3 == 0 -> println("Habis dibagi 3")
        c % 2 == 0 -> println("Habis dibagi 2")
        c > 10 -> println("lebih dari 10")
    }

    //for loops
    // 1 <= d
    for (i in 1..d) {
        print(i)
    }
    println()
    // 1 < d
    for (i in 1 until d) {
        print(i)
    }
    println()
    // i-- 2
    for (i in 20 downTo d step 2) {
        print(i)
    }
    println()
    //foreach
    for (i in item) {
        print(i)
    }
    println()

    //while
    var e = 10
    while (e < 100) {
        print(e)
        e += 10
    }
    println()

    //do while
    do {
        e++
        print(e)
    } while (e < 100)
}
fun main(args: Array<String>){
    val items = arrayOf(1, "String", 3, 4f, 5.0, true, 'C')

    for (i in items){
        when (i) {
            is Int -> println("$i is Integer")
            is String -> println("$i is String")
            is Float -> println("$i is Float")
            is Boolean -> println("$i is Boolean")
            is Char -> println("$i is Character")
        }
    }
}
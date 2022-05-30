fun main() {

    iterater()

    WHENTHEN()

    lamda()


    convertNumber("1","2")
    convertNumber("a","2")
}

    fun parseInt(str: String): Int? = str.toIntOrNull()

    fun convertNumber(arg1: String, arg2: String) {
        val x = parseInt(arg1)
        val y = parseInt(arg2)

        if (x !=null && y !=null) {
            println(x * y)
        }
        else {
            println("'$arg1' or '$arg2' is not a number")
        }
    }





private fun WHENTHEN() {
    val items = listOf("apple", "banana", "kiwifruit")
    val count = items.count()

    when {
        "apple" in items -> println("맛잇는 사과")
        "banana" in items -> println("맛있는 바나나")
    }
}

private fun iterater() {
    val list = listOf("a", "B", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }

    for (x in 1..10 step 2) {
        println(x)
    }

    for (x in 9 downTo 0 step 3) {
        println(x)
    }
}

fun lamda() {
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
     fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach{ print(it)}

}
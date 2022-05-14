package woojin
import strings.lastChar

val list: ArrayList<Int> = arrayListOf()
val lists = listOf<Int>()
fun hi() {
    for (i: Int in 1 .. 10) {
        val value: Int = i
        list.add(value)
    }
}

fun<T> Collection<T>.joinToString(
    separator: String = "; ",
    prefix: String = "",
    postfix: String = ""
) :String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}



fun main() {
    val list = listOf(1,2,3)
    print("Kotllin".lastChar())
}




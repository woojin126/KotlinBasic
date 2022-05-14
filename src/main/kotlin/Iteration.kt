import kotlin.collections.HashMap

fun iter() {
        val hashMap = HashMap<Char,String>()
        for (c in 'A' .. 'F') {
            val binary = Integer.toBinaryString(c.toInt())
            hashMap[c] = binary
        }

        for ((letter,binary) in hashMap) {
            print("$letter = $binary")
        }
    }

fun collections() {
    val list = arrayListOf("10","11","1001")
    for ((index, element) in list.withIndex()) {
        print("$index : $element")
    }
}

fun isLetter(c: Char) = c in 'a' .. 'z' || c in 'A' .. 'Z'
fun isNotDigit(c: Int) = c !in 0 .. 9

fun recognize(c: Int?) = when(c) {
    in 0 .. 9  -> "false"
    in 10 .. 20 -> "false"
    else -> "Not in bound"
}

fun main() {
    println(iter())
    print(collections())
    println(isLetter('q'))
    println(isNotDigit(9))
    println(recognize(null))
}
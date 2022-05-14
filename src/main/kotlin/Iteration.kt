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

fun main() {
    println(iter())
    print(collections())
}
fun main() {
    val a :Int = 12345
    var b :Long = a.toLong()

    var intArr:Array<Int> = arrayOf(1, 2, 3, 4, 5)

    var nullArr = arrayOfNulls<Int>(5)

    intArr[2] = 8

    println(intArr[2])

    println(add(5,6,7))
}

fun add(a :Int, b: Int, c: Int): Int {

    return a + b + c
}
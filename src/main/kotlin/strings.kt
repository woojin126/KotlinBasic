package strings
import woojin.joinToString
fun String.lastChar(): Char = this.get(this.length -1)

fun main() {
    //print("Kotlin".lastChar())
    val list = listOf(1,2,3,4,5)
    print(list.joinToString())
}

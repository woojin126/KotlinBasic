import java.io.BufferedReader
import java.io.StringReader

fun except() {
    (1..100).forEach { i ->
        when(i % 2 == 0) {
            true -> print("True")

            else -> throw Exception("오류입니다")
        }
    }
}

fun readNumber(reader: BufferedReader) : Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        return null
    }
    finally {
        reader.close()
    }
}




fun main() {
    //except()
    val reader = BufferedReader(StringReader("asd"))
    val readNumber = readNumber(reader)
    print(readNumber)
}

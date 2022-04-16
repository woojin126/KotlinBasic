//https://www.youtube.com/watch?v=gJJVLju4XS0&list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN&index=5 코틀린강좌
fun main() {
    val a = 7

    if ( a > 10) {
        println("a는 10보다 크다")
    } else {
        println("a는 10보다 작거나 같다")
    }

    //doWhen(1)
   // doWhen(12L)
    doWhens(2)
    doWhens(12L)
}

fun doWhen(a : Any) {
    when(a) {
        1 -> println("정수 1입니다")
        "DiMo" -> println("디모의 코틀린 강좌입니다.")
        is Long -> println("Long 타입 입니다")
        !is String -> println("String 타입이 아닙니다")
        else -> println("어떤 조건도 만족하지 않습니다.")
    }
}

fun doWhens(b : Any) {
    val result = when (b) {
        1 -> "정수 1입니다"
        "DiMo" -> "디모의 코틀린"
        is Long -> "Long 타입입니다."
        else -> "어떤 조건도 만족하지 않아요"
    }

    println(result);

}
open class ClassTest

class Rectangle(var height: Double , var length: Double) {
    var parameter = (height+length) * 2
}

val rec = Rectangle(5.0,2.0)


class Person constructor(firstName: String) {
    var name = firstName
}

class InitOrderDemo (Name : String) {
    val fitstProperty = "첫 번째 속성 : $Name"

    init {
        println("$Name 을 출력하는 첫 번째 초기화 블록")
    }

     val secondProperty = "두 번째 속성: ${Name.length}"

    init {
        println( "${Name.length} 를 출력하는 두번째 이니셜라이즈")
    }
}

class Numbers (a : Int , b : Int) {
    fun sum(a : Int , b : Int) = a+b
}

fun main() {
    println(rec.parameter)
    println(Person("woojin").name)
    InitOrderDemo("김우형")
    println(InitOrderDemo("바보").fitstProperty)

}
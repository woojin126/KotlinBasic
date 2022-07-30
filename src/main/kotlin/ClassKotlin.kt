import java.lang.IllegalArgumentException

class Persons(
    private val name: String = "",
    private var age: Int = 0,
    airPort: String = ""
) {
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이가 ${age} 이하일 수는 업습니다.")
        }
        println("이름 ${name} 나이 ${age}")
    }

    constructor(name: String): this(name, 1) {
        println("첫 번째 부생성자")
    }

    constructor(): this("홍길동") {
        println("두 번째 부생성자")
    }

   /* fun isAdult(): Boolean {
        return this.age >= 20
    }*/

    val isAdult: Boolean
        get() = this.age >= 20

    val getName: String
        get() = this.name.toUpperCase()

    fun getNames(): String =
        this.name.toUpperCase()

    var airPort: String = airPort
        set(value) {
            field = value.toUpperCase()
        }

    fun updateAirPort(airName: String) {
        this.airPort = airName + "바보"
    }

    override fun toString(): String {
        return "Persons(name='$name', age=$age, isAdult=$isAdult, getName='$getName', airPort='$airPort')"
    }


}

fun main() {
    val persons = Persons()
    persons.updateAirPort("김우진")
    print(persons)
}
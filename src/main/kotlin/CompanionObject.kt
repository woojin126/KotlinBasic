class People private constructor(
    var name: String,
    var age: Int
) {

    companion object Factory: Log {
        private const val MIN_AGE = 1 // const는 상수일대만 붙이기
        fun newBaby(name: String): People {
            return People(name, MIN_AGE)
        }

        override fun log() {
            println("나는 펄슨클래스 동행객체입니다.")
        }
    }
}

object Singleton {
    var a: Int = 0
}
interface Log {

    fun log()
}

/* 익명 클래스 */

interface Movable {

    fun move();
    fun fly();
}

private fun  moveSomething(moveable: Movable) {
    moveable.move()
    moveable.fly()
}
fun main() {
    moveSomething(object : Movable {
        override fun move() {
            println("무프무프")
        }

        override fun fly() {
            println("날다 날다")
        }
        
    })
}
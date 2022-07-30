abstract class Animal(
    protected val species: String,
    public open val legCount: Int
) {

    abstract fun move()
}

class Cat(species: String): Animal(species,4)
 {
    override fun move() {
        println("고양이가 사뿐 사뿐 걸어가~")
    }
}

class Penguin(species: String): Animal(species,2), Swimable, Flyable {
    private val wingCount:Int = 2

    override fun move() {
        println("펭귄이 점프합니다.")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override val swimAbility: Int
        get() = 3
}

interface Flyable {

    fun act() {
        println("파닥 파닥")
    }
}

interface Swimable {

    fun act() {
        println(swimAbility)
        println("어푸 어푸")
    }

    val swimAbility: Int
}

/*--------------------------------------------------------------*/

open class Base(
    private val number: Int = 100
) {
    init {
        println("Base Class")
        println(number)
    }
}

class Derived(
    private val numbers: Int
): Base(numbers) {

    init {
        println("Derived Class")
    }
}


fun main() {
   /* val penguin = Penguin("동물")
    print(penguin.legCount)*/

    Derived(300)
}


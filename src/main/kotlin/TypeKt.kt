class Person(val name: String?, val age: Int?) {
    val names = name
    val ages = age


    override fun toString(): String {
        return "Person(name=$name, age=$age)"
    }
}



fun printAgeIfPerson(obj: Any?) {
    val person: Person = obj as? Person ?: Person("woojin",1)
    println(person.age)
}

fun getGradeWithSwitch(score: Int): String {
    return when(score / 10) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startsWithA(obj: Any): Boolean {
    return when(obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun repeat(str: String, num:Int = 10, useNewLine: Boolean = true) {
    for (count in 1..num) {
        when(useNewLine) {
             true -> println(str)
             else -> print(str)
        }
    }

}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}
fun main() {
    //repeat("우진",useNewLine = false)
    val arr = arrayOf("A","B","C")
    printAll(*arr)

}
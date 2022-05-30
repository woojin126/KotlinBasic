package woojin
import com.sun.glass.events.ViewEvent
import strings.lastChar
import java.util.Comparator

val list: ArrayList<Int> = arrayListOf()
val lists = listOf<Int>()
fun hi() {
    for (i: Int in 1 .. 10) {
        val value: Int = i
        list.add(value)
    }
}

fun<T> Collection<T>.joinToString(
    separator: String = "; ",
    prefix: String = "",
    postfix: String = ""
) :String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}


open class View {
    open fun click() = println("View click")
}

class Button: View() {
    override fun click() {
        print("button click")
    }
}

fun View.showOff() = println("im a view")
fun Button.showOff() = println("i'm a button")

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

fun main() {
    val list = listOf(1,2,3)
    println("Kotllin".lastChar())

    val a :View  = Button();
    println(a.click())

    val view: View = Button()
    view.showOff()

    val testList = mutableListOf<Int>(1,2,3)
    testList.swap(0,2)
    print(testList)
}




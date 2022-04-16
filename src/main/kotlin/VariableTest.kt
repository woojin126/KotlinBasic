

fun main( args : Array<String>) {
    incrementX()
    incrementX()
    println(x)
    printSum(1,2)
}

fun sum(a : Int, b : Int) =  a + b

fun printSum(a : Int, b : Int) {
    println("sum of $a and $b is ${a + b }")
}

val PI = 3.14
var x = 0

fun incrementX() {
    x+=1
}


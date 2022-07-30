class House(
     var address: String?,
) {

    class LivingRoom(
        private var area: Double
    ) {

    }

    override fun toString(): String {
        return "House(address='$address')"
    }


}

fun printPerson(person: Person?) {
    person?.let {
        println(it.name)
        println(it.age)
    }
}

fun main(){

    printPerson(null)
}
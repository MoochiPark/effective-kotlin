package item01

class Person {
    var name: String = "Daewon"
    var surname: String = "Park"
    val fullName
        get() = "$name $surname"
}

fun main() {
    val person = Person()
    println(person.fullName)
    person.name = "Moochi"
    println(person.fullName)
}
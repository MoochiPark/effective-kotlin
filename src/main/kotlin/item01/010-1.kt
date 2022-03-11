package item01

class Person2 {
    var name: String? = "Daewon"
    var surname: String = "Park"
    val fullName: String?
        get() = name?.let { "$it $surname" }

    val fullName2: String? = name?.let { "$it $surname" }
}

fun main() {
    val person = Person2()
    if (person.fullName != null) {
//        println(person.fullName.length) // 오류
    }

    if (person.fullName2 != null) {
        println(person.fullName2.length) // 11
    }
}
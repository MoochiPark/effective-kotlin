package item05

class Person(val email: String?)

fun sendEmail(person: Person, message: String) {
    require(person.email != null)
    val email: String = person.email
    // ...
}

fun sendEmail2(person: Person, text: String) {
    val email: String = person.email ?: return
    // ...
}
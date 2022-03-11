package item01

class User(
    private val name: String,
    private val surname: String,
) {
    fun withSurname(surname: String) = User(name, surname)
}

fun main() {
    var user = User("Daewon", "Jeong")
    user = user.withSurname("Park")
    print(user)  // Daewon Park
}

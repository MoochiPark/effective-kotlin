package item01

data class User2(
    private val name: String,
    private val surname: String,
)

fun main() {
    var user = User2("Daewon", "Jeong")
    user = user.copy(surname = "Park")
    print(user)  // Daewon Park
}

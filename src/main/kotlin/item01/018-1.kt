package item01

data class User4(val name: String)

class UserRepository {
    private val storedUsers: MutableMap<Int, String> =
        mutableMapOf()

    fun loadAll(): MutableMap<Int, String> {
        return storedUsers
    }

    // ...
}

fun main() {
    val userRepository = UserRepository()

    val storedUsers = userRepository.loadAll()
    storedUsers[4] = "Daewon"

    print(userRepository.loadAll())  // {4=Daewon}
}

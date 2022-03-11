package item01

data class User3(val name: String)

class UserRepository2 {
    private val storedUsers: MutableMap<Int, String> =
        mutableMapOf()

    fun loadAll(): Map<Int, String> {
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

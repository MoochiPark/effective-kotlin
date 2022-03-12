package item02

import item03.JavaClass

interface UserRepo {
    fun getUserName() = JavaClass().value
}

class RepoImpl : UserRepo {
    override fun getUserName(): String? {
        return null
    }
}

fun main() {
    val repo: UserRepo = RepoImpl()
    val text: String = repo.getUserName()  // 런타임 때 NPE
    print("User name length is ${text.length}")
}
package item02

import item01.User

fun main() {
    val users: List<User> = listOf()

    // 나쁜 예
    var user: User
    for (i in users.indices) {
        user = users[i]
        print("User at $i is $user")
    }

    // 조금 더 좋은 예
    for (i in users.indices) {
        val user = users[i]
        print("User at $i is $user")
    }

    // 제일 좋은 예
    for ((i, user) in users.withIndex()) {
        print("User at $i is $user")
    }
}
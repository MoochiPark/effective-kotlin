package item05

import java.awt.Point

class Cluster
class User(val email: String)

fun isValidEmail(email: String): Boolean {
    return false
}

fun factorial(n: Int): Long {
    require(n >= 0)
    return if (n <= 1) 1 else factorial(n - 1) * n
}

//fun findClusters(points: List<Point>): List<Cluster> {
//    require(points.isNotEmpty())
//    /// ...
//}

fun sendEmail(user: User, message: String) {
    requireNotNull(user.email)
    require(isValidEmail(user.email))
}
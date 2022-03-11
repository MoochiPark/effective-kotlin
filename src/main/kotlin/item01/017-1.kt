package item01

import kotlin.properties.Delegates

var names by Delegates.observable(listOf<String>()) { _, old, new ->
    println("Names changed from $old to $new")
}

fun main() {
    names += "Daewon"

    names += "Park"
}

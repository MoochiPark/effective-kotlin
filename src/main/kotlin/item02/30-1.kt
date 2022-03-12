package item02

import JavaClass

fun statedType() {
    val value: String = JavaClass().value
    // ...
    println(value.length)
}

fun platformType() {
    val value = JavaClass().value
    // ...
    println(value.length)
}

fun main() {
    statedType()
    platformType()
}
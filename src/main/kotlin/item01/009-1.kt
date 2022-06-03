package item01

fun calculate(): Int {
    println("계산합니다... ")
    return 42
}

val fizz = calculate()
val buzz
    get() = calculate()

fun main() {
    println("hi")
    println(fizz)
    println(fizz)
    println(buzz)
    println(buzz)
}
package item01

fun calculate(): Int {
    print("계산합니다... ")
    return 42
}

val fizz = calculate()
val buzz
    get() = calculate()

fun main() {
    println(fizz)
    println(fizz)
    println(buzz)
    println(buzz)
}
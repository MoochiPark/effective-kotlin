package item02

fun main() {
    val a = 1
    fun fizz() {
        val b = 2
        print(a + b)
    }
    val buzz = {
        val c = 3
        print(a + c)
    }
//    print(a + b + c)  // 오류
}
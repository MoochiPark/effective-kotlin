package item01

import kotlin.concurrent.thread

fun main() {
    var list = mutableListOf<Int>()
    for (i in 1..1000) {
        thread {
            list += i
        }
    }
    Thread.sleep(1000)
    print(list.size)  // 1000이 되지 않고 실행할 때마다 다르다.
}

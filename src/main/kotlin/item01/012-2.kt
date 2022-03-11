package item01

fun main() {
    val list = listOf(1, 2, 3)

    // 이렇게 하지 마세요!
    if (list is MutableList) {
        list.add(4)
    }
}

package item02

fun main() {
    val primes: Sequence<Int> = sequence {
        var numbers = generateSequence(2) { it + 1 }

        while (true) {
            val prime = numbers.first()
            yield(prime)
            numbers = numbers.drop(1)
                .filter { it % prime != 0 }
        }
    }
    print(primes.take(10).toList())
    // [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
}
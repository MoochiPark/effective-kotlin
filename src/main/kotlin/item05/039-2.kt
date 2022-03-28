package item05

fun factorial2(n: Int): Long {
    require(n >= 0) { "Cannot calculate factorial of $n" }
    return if (n <= 1) 1 else factorial(n - 1) * n
}
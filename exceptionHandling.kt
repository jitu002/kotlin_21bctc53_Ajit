fun divide(numerator: Int, denominator: Int): String {
    return try {
        val result = numerator / denominator
        "The result is $result"
    } catch (e: ArithmeticException) {
        "Error: Division by zero is not allowed."
    }
}

fun main() {
    val result1 = divide(10, 2)
    println(result1) // Should print: The result is 5

    val result2 = divide(10, 0)
    println(result2) // Should print: Error: Division by zero is not allowed.
}

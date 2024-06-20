fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Step 1: Square all the numbers
    val squaredNumbers = numbers.map { it * it }

    // Step 2: Filter out the even numbers
    val oddSquaredNumbers = squaredNumbers.filter { it % 2 != 0 }

    // Step 3: Sum the remaining numbers
    val sumOfOddSquares = oddSquaredNumbers.reduce { acc, num -> acc + num }

    // Print the result
    println("The sum of the squared odd numbers is: $sumOfOddSquares")
}

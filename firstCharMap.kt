package day3

fun main() {
    val strings = listOf("apple", "apricot", "banana", "blueberry", "cherry", "date", "fig", "grape", "guava")

    // Group the strings by their first character
    val groupedByFirstChar = strings.groupBy { it.first() }

    // Create a map with the count of strings in each group
    val countByFirstChar = groupedByFirstChar.mapValues { it.value.size }

    // Print the grouped map
    println("Grouped by first character: $groupedByFirstChar")

    // Print the count map
    println("Count by first character: $countByFirstChar")
}

fun sortByAge(people: List<Pair<String, Int>>): List<Pair<String, Int>> {
    return people.sortedBy { it.second }
}

fun main() {
    val people = listOf(
        "Alice" to 30,
        "Bob" to 25,
        "Charlie" to 35,
        "Diana" to 28
    )

    val sortedPeople = sortByAge(people)
    println(sortedPeople)
}

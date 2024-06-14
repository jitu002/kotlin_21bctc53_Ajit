package day1


fun main(){
    val rows = 5
    var k = 0

    for (i in 1..rows) {
        for (space in 1..rows - i) {
            print("  ")
        }

        while (k != 2 * i - 1) {
            print("* ")
            ++k
        }

        println()
        k = 0
    }

    for (i in rows downTo 1) {

        for (space in 1..rows - i) {
            print("  ")
        }

        for (j in i until 2 * i) {
            print("* ")
        }

        for (j in 0 until i - 1) {
            print("* ")
        }

        println()
    }
}
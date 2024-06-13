package day2

fun main(){
    fun String.isPalindrome():Boolean{
        var start = 0
        var end = this.length - 1
        while (start < end) {
            if (this[start] != this[end]) {
                return false
            }
            start++
            end--
        }
        return true
    }

    println("${ ("aba").isPalindrome() }")
}
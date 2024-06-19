package day3

fun main(){
    val stringList= listOf<String>("Hello","kalki","tower","respond","transmission")

    println(stringList.filter { it.length>6 })
}
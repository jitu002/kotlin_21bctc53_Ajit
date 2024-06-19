package day3

fun main(){
    var list= mutableSetOf<Int>(1,2,3)

    list.add(3)
    list.add(4)
    list.remove(3)
    println(list.contains(5))

    println(list)
}
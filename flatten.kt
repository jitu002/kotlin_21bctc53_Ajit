package day3

fun main(){
    val list1= listOf<Int>(1,2,3,4)
    val list2= listOf<Int>(3,4,5,6)
    val list3= listOf<Int>(5,6,7,8)

    val finalList= listOf(list1,list2,list3)

    println(finalList.flatten().toSet())
}
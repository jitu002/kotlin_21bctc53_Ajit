package day3

fun main(){
    val list1= listOf<Int>(1,2,3,4,5,6,7,8,9)
    val list2= listOf<Int>(4,5,6,7,8,9,10,11)

    println("Intersection of $list1 and $list2:${list1.intersect(list2)}")
    println("Union of $list1 and $list2:${list1.union(list2)}")
}
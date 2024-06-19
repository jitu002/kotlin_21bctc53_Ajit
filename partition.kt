package day3

fun main(){
    val num= listOf<Int>(1,2,3,4,5,6)
    val (even,odd)=num.partition { it%2==0 }

    println("Even number list:$even")
    println("Odd number list:$odd")

}
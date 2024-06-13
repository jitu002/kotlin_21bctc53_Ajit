package day2

fun calculateArea(l:Int, b:Int): Int {
    return l*b
}
fun calculateArea(r:Double):Double{
    return  3.14*r*r
}
fun main(){
    val areaRect=calculateArea(2,4)
    val areaCircle= calculateArea(16.45)

    println("Area of rectangle:$areaRect unit cm^2")
    println("Area of circle:$areaCircle unit cm^2")
}


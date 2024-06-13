package day2

fun add(a:Int,b:Int):Int{
    return a+b
}

fun highOrder(a:Int,b:Int,my_func:(Int,Int)->Int):Int{
    return my_func(a,b)
}
fun main(){
    var a=2
    var b=3

    var res=highOrder(a,b, ::add)
    println("Requiired operation by higher order function:$res")
}
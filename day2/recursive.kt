package day2

fun fact(a:Int):Int{
    if(a>=1){
        return a*fact(a-1)
    }
    else {
        return 1
    }
}

fun main(){
    var a=4
    println("Fact of $a: ${fact(a)}")
}
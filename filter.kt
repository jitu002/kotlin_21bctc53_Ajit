package day3

fun main(){
    var l= listOf<Int>(1,2,3,4,5,6,7)

    var lOdd=l.filter {it%2!=0}

    var tranfrm=l.map {
        if (it%2==0){
            it*2
        }
        else{
            it
        }
    }
    println(lOdd)
    println(tranfrm)
}

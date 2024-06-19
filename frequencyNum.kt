package day3


fun freq(l:List<Int>)
{
    var count=0
    val frequencyMap = mutableMapOf<Int,Int>()


    for(i in l){
        count=frequencyMap[i]?:0
        frequencyMap[i]=count+1
    }
    println(frequencyMap)
}


fun main(){
    val l= listOf<Int>(1,2,2,4,4,4)
    freq(l)
}
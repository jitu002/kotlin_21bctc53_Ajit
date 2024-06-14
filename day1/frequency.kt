package day1


fun main(){
    var a="hehe"

    val characterMap= mutableMapOf<Char,Int>()
    for(i in a){
        var freq=characterMap[i]?:0
        characterMap[i]=freq+1
    }
    for(i in characterMap.keys){
        var freq=characterMap[i]
        println("$i:$freq")
    }
}
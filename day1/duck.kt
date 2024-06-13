package day1


fun main(){
    var num=6302

    if(num>0){
        var duckstr:String=num.toString()
        if("0" in duckstr){
            if(duckstr.startsWith("0")){
                println("$num is not a duck number")
            }
            else{
                println("$num is a duck number")
            }
        }
    }
    else{
        println("$num is not a duck number")
    }
}
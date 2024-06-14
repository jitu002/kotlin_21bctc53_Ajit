package day1


fun main(){
    var num=153

    var temp=num
    var res=0
    while(temp!=0){
        var temp1=temp%10
        res+=temp1*temp1*temp1
        temp/=10
    }
    if(res==num){
        println("$num is armstrong number")
    }
    else{
        println("$num is not armstrong number")
    }
 }
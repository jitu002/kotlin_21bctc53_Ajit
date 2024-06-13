package day1



fun main(){
    var num1=20
    var num2=30

    var i=1
    var res=0

    while(i<=num1 && i<=num2){
        if(num1%i==0 && num2%i==0){
            res=i
        }
        i+=1
    }
    println("Gcd is:$res")
}
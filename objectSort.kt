package day3

data class Person(var name:String,var age:Int)



fun main(){
    val person1=Person("John",20)
    val person2=Person("Andrew",19)
    val person3=Person("Stark",28)
    val person4=Person("Ramona",18)
    val person5=Person("James",27)
    val person6=Person("Neo",26)
    val person7=Person("Senorita",21)
    val person8=Person("Sam",27)

    var personList= listOf(person1,person2,person3,person4,person5,person6,person7,person8)
    println(personList)
    println(personList.sortedBy { it.age })
}
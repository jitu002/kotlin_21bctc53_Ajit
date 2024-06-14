package day2

import java.awt.Shape

abstract class shape{
    abstract fun area(): Double
    abstract fun perimeter():Double
}

class rectangle(var l:Double,var b:Double): shape() {
    override fun area():Double {
        return l*b
    }

    override fun perimeter(): Double {
        return 2*(l+b)
    }
}
class circle(var r:Double):shape(){
    override fun area(): Double {
        return 3.14*r*r
    }

    override fun perimeter(): Double {
        return 2*3.14*r
    }
}


fun main(){
    var rect=rectangle(2.4,3.5)
    var cir=circle(3.7)
    println("Area of rectangke:${rect.area()}")
    println("Perimeter of rectangke:${rect.perimeter()}")
    println("Area of circle:${cir.area()}")
    println("Perimeter of circle:${cir.perimeter()}")
}



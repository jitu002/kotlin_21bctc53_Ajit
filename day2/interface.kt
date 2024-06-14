package day2

interface Drawable {
    fun draw()
    fun resize(factor: Double)
}

class Square(var side: Double) : Drawable {
    override fun draw() {
        println("Drawing a Square with side length $side")
    }

    override fun resize(factor: Double) {
        side *= factor
        println("Resized Square to new side length $side")
    }
}

class Triangle( var base: Double,  var height: Double) : Drawable {
    override fun draw() {
        println("Drawing a Triangle with base $base and height $height")
    }

    override fun resize(factor: Double) {
        base *= factor
        height *= factor
        println("Resized Triangle to new base $base and height $height")
    }
}

fun main() {
    val square: Drawable = Square(5.0)
    val triangle: Drawable = Triangle(3.0, 4.0)

    square.draw()
    triangle.draw()

    square.resize(2.0)
    triangle.resize(1.5)

    square.draw()
    triangle.draw()
}

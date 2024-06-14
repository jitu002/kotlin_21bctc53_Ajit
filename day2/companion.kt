package day2

class User(val name: String, val age: Int) {
    override fun toString(): String {
        return "User(name: $name, age: $age)"
    }

    companion object {
        private const val defaultAge = 18

        fun create(name: String = "Unknown", age: Int = defaultAge): User {
            return User(name, age)
        }
    }
}

fun main() {
    val user1 = User.create()
    val user2 = User.create(name = "Alice")
    val user3 = User.create(age = 25)
    val user4 = User.create(name = "Bob", age = 30)

    println(user1)
    println(user2)
    println(user3)
    println(user4)
}
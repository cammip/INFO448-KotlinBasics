package edu.uw.basickotlin

// write a "whenFn" that takes an arg of type "Any" and returns a String
fun whenFn(arg: Any): String {
    when {
        arg is String -> {
            return if (arg == "Hello") "world" else "Say what?"
        }

        arg is Int -> {
            return when (arg) {
                0 -> "zero"
                1 -> "one"
                in 2..10 -> "low number"
                else -> "a number"
            }
        }
        else -> return "I don't understand"
    }
}

// write an "add" fgradunction that takes two Ints, returns an Int, and adds the values
fun add(lhs: Int, rhs: Int): Int {
    return lhs + rhs
}

// write a "sub" function that takes two Ints, returns an Int, and subtracts the values
fun sub(lhs: Int, rhs: Int): Int {
    return lhs - rhs
}

// write a "mathOp" function that takes two Ints and a function (that takes two Ints and returns an Int), returns an Int, and applies the passed-in-function to the arguments
fun mathOp(lhs: Int, rhs: Int, op: (Int, Int) -> Int): Int {
    return op(lhs, rhs)
}

// write a class "Person" with first name, last name and age
class Person(var firstName: String, var lastName: String, var age: Int) {
    val debugString: String
        get() = "[Person firstName:${this.firstName} lastName:${this.lastName} age:${this.age}]"
}

// write a class "Money"

class Money(val amount: Int, val currency: String) {
    init {
        if (amount < 0) {
            throw IllegalArgumentException("Invalid amount")
        }
        if (currency !in setOf("USD", "GBP", "CAN", "EUR")) {
            throw IllegalArgumentException("Invalid currency")
        }
    }

    fun convert(curr: String): Money {
        if (otherCurr !in setOf("USD", "GBP", "CAN", "EUR"))
            throw IllegalArgumentException("Invalid currency")
    }

}
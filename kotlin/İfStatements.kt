fun main() {
    val num = 10

    // Simple if statement
    if (num > 0) {
        println("The number is positive.")
    }

    // if-else statement
    if (num % 2 == 0) {
        println("The number is even.")
    } else {
        println("The number is odd.")
    }

    // Nested if statements
    if (num > 0) {
        println("The number is positive.")

        if (num % 2 == 0) {
            println("The number is positive and even.")
        } else {
            println("The number is positive and odd.")
        }
    } else if (num < 0) {
        println("The number is negative.")
    } else {
        println("The number is zero.")
    }

    // if expression with assignment
    val result = if (num > 0) {
        "Positive"
    } else if (num < 0) {
        "Negative"
    } else {
        "Zero"
    }

    println("The number is $result.")
}


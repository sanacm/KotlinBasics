
fun whenExpression(x: Int) {
    val message = when (x) {
        1 -> "x is equal to 1"
        2 -> "x is equal to 2"
        3 -> "x is equal to 3"
        else -> "x is not equal to 1, 2, or 3"
    }
    println(message)
}

fun main(args: Array<String>) {
    whenExpression(1)
}


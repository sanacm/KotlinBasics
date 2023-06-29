fun main() {
    var num: Int
    var sum = 0

    do {
        print("Enter a number (enter 0 to exit): ")
        num = readLine()!!.toInt()
        sum += num
    } while (num != 0)

    println("Sum: $sum")
}


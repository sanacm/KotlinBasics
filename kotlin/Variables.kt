/*

    var (mutable variable):

    When you declare a variable using var, it means that the variable is mutable, which means you can change its value after it has been initialized.
    You can assign a new value to a var variable using the assignment operator (=).

    val (read-only variable):

    When you declare a variable using val, it means that the variable is read-only or immutable, which means its value cannot be changed once it is initialized.
    You cannot assign a new value to a val variable once it has been initialized. It behaves like a constant or a final variable in other languages.


 */
fun main() {
    var mutableVariable = 10
    val readOnlyVariable = 5

    println("Initial values:")
    println("Mutable Variable: $mutableVariable")
    println("Read-only Variable: $readOnlyVariable")

    mutableVariable = 20
    // The value of 'mutableVariable' can be changed because it was declared with 'var'

    // readOnlyVariable = 10
    // Error: Val cannot be reassigned

    println("Updated values:")
    println("Mutable Variable: $mutableVariable")
    println("Read-only Variable: $readOnlyVariable")


    
}

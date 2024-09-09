fun main(args: Array<String>) {
    println("welcome to calculator")
    println("enter the first number:")
    val a = readLine()!!.toDouble()
    println("Enter the second number:")
    val b = readLine()!!.toDouble()
    val sum = a + b
    val difference = a - b
    val product = a * b
    val quotient = a / b
    println("Sum: ${sum}")
    println("Difference: ${difference}")
    println("product: ${product}")
    println("quotient: ${quotient}")
    println("Thank you for using calculator.")
}
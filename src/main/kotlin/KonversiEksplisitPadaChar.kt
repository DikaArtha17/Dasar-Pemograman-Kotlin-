fun main(args: Array<String>) {
    //ASCII Value

    var c: Char //charcter
    var i: Int // ordinal (ASCII) value of the character
    // Conversion from text to ASCII value

    c = 'a'
    i = c.toInt()

    println("The character $c was converted to its ASCII value of $i")

    // conversion from an ASCII value to text
    i = 99
    c = i.toChar()
    println("The ASCII value of $i was converted to its textual value of $c")
}
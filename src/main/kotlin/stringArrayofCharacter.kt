fun main(args: Array<String>) {
    val myName: String = "Depandi Enda"
    for(chr in myName){
        print(chr)
    }
    println('\n')

    var text = """ 
            |Tell me and I forget. 
            |Teach me and I remember. 
            |Involve me and I learn. 
            |(Benjamin Franklin) 
            """.trimMargin()
    println(text)
}
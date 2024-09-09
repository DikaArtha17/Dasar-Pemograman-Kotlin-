fun main(args: Array<String>) {
    val s = "Rhinopotamus"
    println(s.startsWith("rhin"))
    println(s.endsWith("tamus"))
    println(s.contains("pot"))
    println(s.contains("lol"))

    var config = "Fullscreen shaDows autosave"

    config = config.toLowerCase()
    println("will the game run in fullscreen?")
    println(config.contains("fullscreen"))
    println("will shadows be turned on?")
    println(config.contains("shadows"))
    println("will sound be turned off?")
    println(config.contains("nosound"))
    println("would the player like to use autosave")
    println(config.contains("autosave"))

    var strJava = "java is the best!"
    strJava = strJava.replace("java", "kotlin")
    println(s)
    println("$strJava is ${strJava.length} characters long.")

    println("i would not banish all of these internets.".substring(2, 7))

    println("alpha".compareTo("bravo"))
}
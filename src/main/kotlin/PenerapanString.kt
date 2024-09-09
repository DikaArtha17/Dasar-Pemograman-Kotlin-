fun main(args: Array<String>) {
    var s = "A programmer gets stuck in the shower because the instructions on the shampoo were: Lather,Wash, and Repeat."
    println(s)
    s = s.toLowerCase()

    var voweIcount = 0
    var consonantCount = 0

    val vowels = "aeiouy"
    val consonants = "bcdfghjklmnpqrstvwxz"

    for (c in s) {
        if (vowels.contains(c)){
            voweIcount++
        } else if (consonants.contains(c)){
            consonantCount++
        }
    }
    println("vowels: $voweIcount")
    println("consonants: $consonantCount")
    println("other charcters: ${s.length - (voweIcount + consonantCount)}")
}
fun main() {
    val likes = 2224
    var humanDeclination = if (likes == 11 || likes % 10 != 1) "людям" else "человеку"
    println("Нравится" + ' '+ likes + ' ' + humanDeclination)
}
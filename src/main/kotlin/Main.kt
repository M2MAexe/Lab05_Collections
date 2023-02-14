import movies.*

/**
 * Collection handle function
 *
 * @param args an array of console arguments
 */
fun main(args: Array<String>) {
    println("world!")
    var m = Person(name = "string", height = 10f, hairColor = Color.WHITE, nationality = Country.RUSSIA)

    var k = Movie(name = "Str", coordinates = Coordinates(5.1, 5f), oscarsCount = 1, length = 1, genre = MovieGenre.COMEDY, mpaaRating = MpaaRating.PG_13)
    var k1 = Movie(name = "Str1", coordinates = Coordinates(5.1, 5f), oscarsCount = 1, length = 1, genre = MovieGenre.COMEDY, mpaaRating = MpaaRating.PG_13)
}
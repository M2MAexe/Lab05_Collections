package movies

import java.io.IOException
import java.time.LocalDate

/**
 * Person representation class
 */
class Person(private val name: String, private val height: Float?,
                    private val hairColor: Color?, private val nationality: Country?) {
    init {
        if (name.isEmpty())
            throw IOException("Name couldn't be zero length")
        if (height != null && height <= 0)
            throw IOException("Height couldn't be less than zero")
    }

    /**
     * Name getter method
     *
     * @return person name [String]
     */
    fun getName() = this.name

    /**
     * Height getter method
     *
     * @return person height [Float]
     */
    fun getHeight() = this.height

    /**
     * Hair color getter method
     *
     * @return person hair color [Color]
     */
    fun getHairColor() = this.hairColor

    /**
     * Nationality getter method
     *
     * @return person nationality [Country]
     */
    fun getNationality() = this.nationality
}

class Coordinates(private val x: Double, private val y: Float) {
    init {
        if (x <= -513)
            throw IOException("X must be more than -513")
        if (y > 424)
            throw IOException("Y must be less or equal 424")
    }

    /**
     * X getter method
     *
     * @return x coordinate [Double]
     */
    public fun getX() = this.x

    /**
     * Y getter method
     *
     * @return y coordinate [Float]
     */
    public fun getY() = this.y
}

class Movie(private var name: String, private var coordinates: Coordinates,
            private var oscarsCount: Int, private var length: Long,
            private var genre: MovieGenre, private var mpaaRating: MpaaRating) {
    private var id: Long = giveId()
    private var creationDate: LocalDate = LocalDate.now()

    init {
        if (name.isEmpty())
            throw IOException("Name couldn't be empty")
        if (oscarsCount < 1)
            throw IOException("Oscars couldn't be less than zero")
        if (length < 1)
            throw IOException("Length couldn't be less than zero")
    }

    private companion object {
        var cntId: Long = 0

        /**
         * Giving id to movie instance method
         *
         * @return id of new movie [Long]
         */
        @JvmStatic
        fun giveId(): Long {
            cntId += 1
            return cntId
        }
    }

    /**
     * Name getter method
     *
     * @return movie name [String]
     */
    fun getName() = this.name

    /**
     * Coordinates getter method
     *
     * @return movie coordinates [Coordinates]
     */
    fun getCoordinates() = this.coordinates

    /**
     * Oscars count getter method
     *
     * @return movie oscars count [Int]
     */
    fun getOscarsCount() = this.oscarsCount

    /**
     * Length getter method
     *
     * @return movie length [Long]
     */
    fun getLength() = this.length

    /**
     * Genre getter method
     *
     * @return movie genre [MovieGenre]
     */
    fun getGenre() = this.genre

    /**
     * Mpaa rating getter method
     *
     * @return movie mpaa rating [mpaaRating]
     */
    fun getMpaaRating() = this.mpaaRating

    /**
     * Id getter method
     *
     * @return movie id [Long]
     */
    fun getId() = this.id

    /**
     * Creation date getter method
     *
     * @return movie creation date [LocalDate]
     */
    fun getCreationDate() = this.creationDate
}


package movies

import java.util.PriorityQueue

/**
 * Movie manager representative class
 */
class MovieManager {
    val movieQueue: PriorityQueue<Movie> = PriorityQueue<Movie>()

    /**
     * Get commands documentation method
     *
     * @return commands documentation [String]
     */
    fun help(): String = ""

    /**
     * Get collection information method
     *
     * @return collection information [String]
     */
    fun info(): String = ""

    /**
     * Show all collection elements method
     *
     * @return collection elements in string representation [String]
     */
    fun show(): String = ""

    /**
     * Add new element to collection method
     *
     * @param element to add in collection [Movie]
     * @return true if element has added, false if something went wrong [Boolean]
     */
    fun add(element: Movie): Boolean = true

    /**
     * Update element by id method
     *
     * @param id of movie to update [Long]
     * @return true if element has updated, false if something went wrong [Boolean]
     */
    fun updateById(id: Long): Boolean = true

    /**
     * Remove element by its id
     *
     * @param id of element to remove [Long]
     * @return true if element has removed, false if something went wrong [Boolean]
     */
    fun removeById(id: Long): Boolean = true

    /**
     * Clear collection method
     *
     * @return true if collection has cleared, false if something went wrong [Boolean]
     */
    fun clear(): Boolean = true

    /**
     * Save collection in file method
     *
     * @param fileName of saving collection(csv) [String]
     * @return true if collection has saved, false if something went wrong [Boolean]
     */
    fun save(fileName: String): Boolean = true

    /**
     * Execute script from file method
     *
     * @param fileName of script to execute [String]
     * @return true if script has completed, false if something went wrong [Boolean]
     */
    fun executeScript(fileName: String): Boolean = true

    /**
     * End manager method
     *
     * @return true if script has stopped, false if something went wrong [Boolean]
     */
    fun exit(): Boolean = true

    /**
     * Removing first element from collection method
     *
     * @return true if element has removed, false if something went wrong [Boolean]
     */
    fun removeFirstElement(): Boolean = true

    /**
     * Show first element from collection
     *
     * @return first element in string representation [String]
     */
    fun head(): String = ""

    /**
     * Removing all elements exceeding parameter element
     *
     * @param element after which exceeding elements will be deleted [Movie]
     * @return true if elements have deleted, false if something went wrong [Boolean]
     */
    fun removeGreater(element: Movie): Boolean = true

    /**
     * Show random element with maximum height of screenwriter
     *
     * @return element in string representation [String]
     */
    fun showMaxByScreenwriter(): String = ""

    /**
     * Print elements in increasing order
     *
     * @return elements in string representation [String]
     */
    fun printAscending(): String = ""

    /**
     * Print all oscars count of all elements in descending order
     *
     * @return list of pairs (oscars count value + name of movie) in string representation [String]
     */
    fun printFieldDescendingOscarsCount(): String = ""
}

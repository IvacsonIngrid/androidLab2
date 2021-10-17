interface IDictionary {
    fun add(elem: String) : Boolean
    fun find(elem: String) : Boolean
    fun size() : Int
    companion object {val name : String = "dict.txt"}
}
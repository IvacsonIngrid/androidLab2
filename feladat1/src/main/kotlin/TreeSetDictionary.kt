import java.io.File
import java.util.*

object TreeSetDictionary: IDictionary {
    var words = TreeSet<String>()

    init
    {
        val text = File(IDictionary.name).readLines()
        for(i in 0 until text.size)
        {
            words.add(text[i])
        }
    }

    override fun add(elem: String): Boolean {
        if (elem == null) {
            return false
        }

        if (find(elem)){
            return false
        }

        words.add(elem)
        words.sorted()
        return true
    }

    override fun find(elem: String): Boolean {
        for (i in words) {
            if (elem == i) {
                return true
            }
        }
        return false
    }

    override fun size(): Int {
        return words.size
    }
}
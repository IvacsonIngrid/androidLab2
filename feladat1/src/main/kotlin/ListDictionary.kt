import java.io.BufferedReader
import java.io.File
import java.io.InputStream

object ListDictionary: IDictionary {
    val words = mutableListOf<String>()

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

        words.add(elem)
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


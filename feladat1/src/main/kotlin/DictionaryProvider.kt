class DictionaryProvider () {
    fun createDictionary(dictionary: DictionaryType) : IDictionary{
        var dict : IDictionary?
        when{
            dictionary == DictionaryType.ARRAY_LIST -> dict = ListDictionary
            dictionary == DictionaryType.TREE_SET -> dict = TreeSetDictionary
            else -> dict = HashSetDictionary
        }
        return dict
    }
}
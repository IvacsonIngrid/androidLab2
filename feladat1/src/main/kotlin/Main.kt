import java.io.File

fun main(){
    println("ListDictionary---------------------------------------")
    val dict: IDictionary = ListDictionary

    println("Number of words: ${dict.size()}")

    var word: String?
    while(true){
        print("What to find? ")
        word = readLine()
        if( word.equals("quit")){
            break
        }
        println("Result: ${word?.let { dict.find(it) }}")
    }


    println("TreeSetDictionary---------------------------------------")
    val dict2 : IDictionary = TreeSetDictionary

    println("Number of words: ${dict2.size()}")

    while(true){
        print("What to find? ")
        word = readLine()
        if( word.equals("quit")){
            break
        }
        println("Result: ${word?.let { dict2.find(it) }}")
    }



    println("HashSetDictionary---------------------------------------")
    var dicto : IDictionary
    var dict3 : DictionaryProvider = DictionaryProvider()
    dicto = dict3.createDictionary(DictionaryType.HASH_SET)

    println("Number of words: ${dicto.size()}")

    while(true){
        print("What to find? ")
        word = readLine()
        if( word.equals("quit")){
            break
        }
        println("Result: ${word?.let { dicto.find(it) }}")
    }

}

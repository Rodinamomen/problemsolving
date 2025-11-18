fun mergeTwoStrings(word1: String, word2: String): String {
    var result: String = ""
    if (word1.length < word2.length) {
        for (i in word2.indices) {
            if (i < word1.length) {
                result = result.plus(word1[i]).plus(word2[i])
            } else {
                result = result.plus(word2[i])
            }
        }
    }
    if (word1.length > word2.length) {
        for (i in word1.indices) {
            if (i < word2.length) {
                result = result.plus(word1[i]).plus(word2[i])
            } else {
                result = result.plus(word1[i])
            }
        }
    }
    if (word1.length == word2.length) {
        for (i in word1.indices) {
            result = result.plus(word1[i]).plus(word2[i])
        }
    }
    return result
}
/*fun mergeTwoStrings(word1: String, word2: String): String {
    var result =""
    for(i in 0 until maxOf(word1.length, word2.length)){
        if (i < word1.length) result= result.plus(word1[i])
        if (i < word2.length) result= result.plus(word2[i])
    }
    return result

}*/
fun main() {
    println(mergeTwoStrings("abc", "efg"))
}
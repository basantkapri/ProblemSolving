package problem

object WordSubset {

    val word1 = arrayOf("leetcode")
    val word2 = arrayOf("e", "oo")
    val result = wordSubsets(word1, word2)

    fun wordSubsets(words1: Array<String>, words2: Array<String>): List<String> {
        val output = mutableListOf<String>()
        words1.forEach { word ->
            var contain = true

            for(inner in words2) {
                if(!word.contains(inner)) {
                    contain = false
                    break
                }
            }
            if (contain) output.add(word)
        }
        return output
    }

    /*
    for (element in inner) {
                    if (!word.contains(element)) {
                        contain = false
                        break
                    }
                }
     */
}
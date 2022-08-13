package problem

object LongestPrefix {
    val strs = arrayOf("flower", "flow", "flight")
    val result = longestCommonPrefix(strs)
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty() || strs.size == 1) return ""

        var index = 0
        val firstString = strs[0]
        var result = ""
        while (index < firstString.length) {
            val str = result + firstString[index]
            var contains = false
            for (i in 1 until strs.size) {
                val string = strs[i]
                val subStr = if (string.length > index) string.substring(0, index + 1) else ""
                if (subStr != str) {
                    index == firstString.length
                    contains = false
                    break
                } else contains = true

            }
            if (contains) result += firstString[index]
            index++
        }

        return result
    }
}
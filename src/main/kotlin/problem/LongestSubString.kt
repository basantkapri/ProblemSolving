package problem

class LongestSubString {
    val s = "basant"
    val result = lengthOfLongestSubstring(s)
    fun lengthOfLongestSubstring_(s: String): Int {
        var str = ""
        for (char in s) {
            if (str.contains(char)) break
            str += char
        }
        return str.length
    }
    fun lengthOfLongestSubstring(s: String): Int {
        val list = mutableListOf<String>()
        for (i in s.indices) {
            val top = s[i]
            var str = "$top"
            for (j in i + 1 until s.length) {
                val inChar = s[j]
                if (str.contains(inChar)) break
                str += inChar
            }
            list.add(str)
        }
        var maxLen = 0

        for (i in 0 until list.size) {
            val length = list[i].length
            if (maxLen < length) maxLen = length
        }

        return maxLen
    }
}
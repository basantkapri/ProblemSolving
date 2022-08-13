package problem

object StrStr {
    fun strStr(haystack: String, needle: String): Int {
        var index = -1
        if (haystack.length < needle.length) return -1
        if (haystack.length == needle.length && haystack != needle) return -1
        for (i in haystack.indices) {
            if (haystack.elementAt(i) == needle.elementAt(0)) {
                if (haystack.length < i + needle.length) return -1
                val sub = haystack.substring(i, i + needle.length)
                if (sub == needle) {
                    index = i
                    break
                }
            }
        }
        return index
    }
}
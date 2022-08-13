package problem

object LongestPalindrome {
    val str = "babaddtattarrattatddetartrateedredividerb"
    val result = longestPalindrome(str)

    fun longestPalindrome(str: String): String {

        if (str.isEmpty()) return ""
        else if (str.length == 1) return str
        else if (str.length == 2) {
            if (str[0] == str[1]) return str
            else return "${str[0]}"
        } else {
            var isSame = true
            val firstChar = str[0]
            for (j in 0 until str.length) {
                val lastChar = str[j]
                if (firstChar != lastChar) {
                    isSame = false
                    break
                }
            }
            if (isSame) return str
        }

        val list = mutableListOf<String>()
        for (i in str.indices) {
            val char = str[i]
            val endChar = str[str.length - 1]
            if(char == endChar) list.add(str)
            for (j in i until str.length) {
                if (char == str[j]) {
                    val palindrome = str.substring(i, j + 1)
                    list.add(palindrome)
                }
            }

        }
        list.clear()
        val palindrome = mutableListOf<String>()
        println("count -> $list")
        list.forEach {
            var start = 0
            var end = it.length - 1
            var isPalindrome = false
            while (start <= end) {
                val firstChar = it[start]
                val secondChar = it[end]
                if (firstChar != secondChar) {
                    isPalindrome = false
                    break
                } else isPalindrome = true

                start++
                end--
            }
            if (isPalindrome) palindrome.add(it)
        }

        var output = ""
        var length = 0
        palindrome.forEach {
            if (length < it.length) {
                length = it.length
                output = it
            }
        }

        return output
    }
}
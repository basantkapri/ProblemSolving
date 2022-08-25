package problem

object LengthOfLastWord {
    fun lengthOfLastWord(s: String): Int {

        if (s.isEmpty()) return 0
        if (s.length == 1) {
            return if (s[0] == ' ') 0 else 1
        }
        var index = s.length - 1
        var lastString = ""
        while (index >= 0) {
            val lastChar = s[index]
            if (lastChar != ' ') lastString += lastChar
            else if (lastChar == ' ' && lastString.isNotEmpty())
                break
            index--
        }

        return lastString.length
    }
}
package problem

object Palindrome {
    val num = 12321
    val result = isPalindrome(num)

    fun isPalindrome(x: Int): Boolean {
        val str = x.toString()
        var start = 0
        var end = str.length - 1
        var isPalindrome = true
        while (start <= end) {
            val fChar = str[start]
            val sChar = str[end]
            println("fChar -> $fChar || sChar -> $sChar")
            if (fChar != sChar) {
                isPalindrome = false
                break
            }
            start++
            end--
        }

        return isPalindrome
    }
}
package problem

object Atoi {
    val num = " "
    val result = myAtoi(num)
    fun myAtoi(s: String): Int {
        if (s.isEmpty()) return 0

        var i = 0
        while (i < s.length && s[i] == ' ') i++

        var isPositive = true

        if (i >= s.length) return 0
        if (s[i] == '-' || s[i] == '+') {
            isPositive = s[i] == '+'
            i++
        }

        if (i >= s.length) return 0

        if (s[i] - '0' < 0 || s[i] - '0' > 9) {
            return 0
        }

        var num = 0

        while (i < s.length && s[i] in '0'..'9') {
            if (num > Int.MAX_VALUE / 10 || num == Int.MAX_VALUE / 10 && s[i] - '0' > 7) {
                return if (isPositive) Int.MAX_VALUE else Int.MIN_VALUE
            }
            num = num * 10 + (s[i] - '0')
            i++
        }

        return if (isPositive) num else num * -1
    }
}
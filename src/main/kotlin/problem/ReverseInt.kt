package problem

object ReverseInt {
    val num = 1534236469
    val result = reverse(num)
    fun reverse(input: Int): Int {
        var num = 0
        var reverseNum = 0
        val hasNegative = if (input < 0) {
            num = -input
            true
        } else {
            num = input
            false
        }

        while (num != 0) {
            val rem = num % 10
            num /= 10
            if (reverseNum > Integer.MAX_VALUE / 10 || reverseNum == Integer.MAX_VALUE / 10 && rem > 7) {
                return 0
            }

            if (reverseNum < Integer.MIN_VALUE / 10 || reverseNum == Integer.MIN_VALUE / 10 && rem < -8) {
                return 0
            }
            reverseNum = 10 * reverseNum + rem
        }
        return if (hasNegative) -reverseNum else reverseNum
    }
}

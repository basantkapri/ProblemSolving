package problem

object PlusOne {
    fun plusOne(digits: IntArray): IntArray {
        if (digits == null || digits.size === 0) return intArrayOf()

        var carry = 1
        for (i in digits.size - 1 downTo 0) {
            val sum = digits[i] + carry
            carry = if (sum >= 10) 1 else 0
            digits[i] = sum % 10
        }

        return if (carry == 1) {
            val result = IntArray(digits.size + 1)
            System.arraycopy(digits, 0, result, 1, digits.size)
            result[0] = 1
            result
        } else digits
    }
}
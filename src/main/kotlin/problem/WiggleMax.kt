package problem

object WiggleMax {
    val nums = intArrayOf(1, 17, 5, 10, 13, 15, 10, 5, 16, 8)
    //val nums = intArrayOf(1, 7, 4, 9, 2, 5)

    fun wiggleMaxLength_(nums: IntArray): Int {
        val n = nums.size
        if (n <= 1) return 0

        var positive = 1
        var negative = 1
        var i = 1
        while (i < n) {
            if (nums[i] > nums[i - 1]) positive = negative + 1
            else if (nums[i] < nums[i - 1]) negative = positive + 1
            i++
        }
        return if (positive > negative) positive else negative
    }

    fun wiggleMaxLength(nums: IntArray): Int {
        val n = nums.size
        if (n <= 2) return n

        var prevDiff = nums[1] - nums[0]
        var result = if (prevDiff == 0) 1 else 2
        var i = 2

        while (i < n) {
            val currDiff = nums[i] - nums[i - 1]

            if ((prevDiff < 0 && currDiff > 0) || (prevDiff > 0 && currDiff < 0)) {
                prevDiff = currDiff
                result++
            }
            i++
        }
        return result
    }
}
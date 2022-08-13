package problem

object RemoveDuplicates {
    fun removeDuplicates(nums: IntArray): Int {
        var count = 0
        var i = 0
        while (i < nums.size) {
            val first = nums[i]
            val next = if (i < nums.size - 1) nums[i + 1] else -1
            if (first != next) {
                nums[count++] = nums[i];
            }
            i++
        }

        return count
    }
}
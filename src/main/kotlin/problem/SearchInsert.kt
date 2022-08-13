package problem

object SearchInsert {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var count = 1
        for (num in nums) {
            if (num == target) break
            else if (num > target) break
            count++
        }
        return count
    }
}
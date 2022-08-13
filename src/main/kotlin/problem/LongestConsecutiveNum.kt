package problem

object LongestConsecutiveNum {
    val nums = intArrayOf(1, 2, 0, 1)
    val result = longestConsecutive(nums)
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.size <= 1) return nums.size
        val array = nums.sortedArray()
        var firstItem = array[0]
        var count = 1
        var lastLength = 0
        for (i in 1 until array.size) {
            val currItem = array[i]
            if (currItem == firstItem + 1) count++
            else if (currItem != firstItem) count = 1

            if (lastLength < count) lastLength = count
            println("currItem -> $currItem || firstItem -> $firstItem || $count")
            firstItem = currItem
        }
        return lastLength
    }
}
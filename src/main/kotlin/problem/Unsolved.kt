package problem

object Unsolved {
    val list = intArrayOf(10, 9, 2, 5, 3, 7, 101, 18)
    val result = lengthOfLIS(list)
    fun lengthOfLIS(nums: IntArray): Int {
        val listOfLists = mutableListOf<MutableList<Int>>()

        var i = 0
        while (i < nums.size) {
            var j = i + 1
            var start = nums[i]
            val list = mutableListOf<Int>()
            list.add(start)
            while (j < nums.size) {
                val next = nums[j]
                if (start < next) {
                    start = next
                    list.add(start)
                }
                j++
            }
            if (list.size > 0) listOfLists.add(list)
            i++
        }
        var maxSize = 0
        listOfLists.forEach { if (maxSize < it.size) maxSize = it.size }
        return maxSize
    }
}
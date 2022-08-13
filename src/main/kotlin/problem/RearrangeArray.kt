package problem

object RearrangeArray {
    val nums = intArrayOf(3, 1, -2, -5, 2, -4)
    fun rearrangeArray(nums: IntArray): IntArray {
        val posList = mutableListOf<Int>()
        val negList = mutableListOf<Int>()
        for (i in nums.indices) {
            val item = nums[i]
            if (item >= 0) posList.add(item)
            else negList.add(item)
        }

        val finalList = mutableListOf<Int>()
        for (i in posList.indices) {
            finalList.add(posList[i])
            if (negList.size > i) finalList.add(negList[i])
        }

        return finalList.toIntArray()
    }
}
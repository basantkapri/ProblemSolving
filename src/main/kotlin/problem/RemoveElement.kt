package problem

object RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int {

        var count = 0
        var i = 0

        if (nums.size == 1 && nums[i] != `val`) return 1
        if (nums.size == 1 && nums[i] == `val`) return 0
        while (i < nums.size) {
            if (nums[i] != `val`)
                nums[count++] = nums[i]
            i++
        }
        return count
    }
}
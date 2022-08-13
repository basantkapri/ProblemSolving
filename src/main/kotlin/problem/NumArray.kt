package problem

class NumArray(nums: IntArray) {
    val list = nums
    fun update(index: Int, `val`: Int) {
        list[index] = `val`
    }

    fun sumRange(left: Int, right: Int): Int {
        var sum = 0
        var start = left
        while (start <= right) {
            sum += list[start]
            start++
        }
        return sum
    }
}
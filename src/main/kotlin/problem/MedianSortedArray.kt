package problem

object MedianSortedArray {
    val nums1 = intArrayOf(1, 3)
    val numm2 = intArrayOf(2)
    val result = findMedianSortedArrays(nums1, numm2)

    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val array = mutableListOf<Int>()
        array.addAll(nums1.toTypedArray())
        array.addAll(nums2.toTypedArray())
        val sorted = array.sorted()

        println("sorted -> $sorted")
        val size = sorted.size

        val midVal = if (size % 2 == 0) {
            val mid = (size / 2) + 1
            (sorted[mid] + sorted[mid + 1]) / 2.0
        } else {
            val mid = (size / 2)
            sorted[mid] / 1.0
        }
        return midVal
    }
}
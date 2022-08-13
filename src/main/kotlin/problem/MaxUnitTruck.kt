package problem

import java.util.*

object MaxUnitTruck {
    val boxTypes = arrayOf(intArrayOf(5,10), intArrayOf(2,5), intArrayOf(4,7), intArrayOf(3,9))
    val truckSize = 10
    val result = maximumUnits(boxTypes, truckSize)
    fun maximumUnits(boxTypes: Array<IntArray>, truckSize: Int): Int {
        Arrays.sort(boxTypes) { a, b -> b[1] - a[1] }
        var capacity = truckSize
        var loadedItems = 0
        for (item in boxTypes) {
            val boxes = item[0]
            val unit = item[1]

            val loadCapacity = if (boxes < capacity) boxes else capacity
            loadedItems += (unit * loadCapacity)
            capacity -= loadCapacity
        }
        return loadedItems
    }
}
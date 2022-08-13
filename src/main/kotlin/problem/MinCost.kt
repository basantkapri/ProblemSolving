package problem

object MinCost {
    val cost = intArrayOf(1, 100, 1, 1, 1, 100, 1, 1, 100, 1)
    val result = minCostClimbingStairs(cost)
    fun minCostClimbingStairs(cost: IntArray): Int {
        val size = cost.size
        if (size == 0) return cost[0]
        if (size == 1) return cost[1]

        var min1 = 0
        var min2 = 0

        for (i in 0 until size) {
            val min = cost[i] + if (min1 < min2) min1 else min2
            println("result -> ${cost[i]} | $min | $min1 | $min2 ")
            min2 = min1
            min1 = min
            println("result -> $min | $min1 | $min2 ")
        }
        return if (min1 < min2) min1 else min2
    }

}
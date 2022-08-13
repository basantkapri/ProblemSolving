package problem

object Fib {
    val num = 4
    val result = fib(num)
    fun fib(n: Int): Int {
        if (n <= 1) return 0
        if (n <= 2) return 1
        if (n <= 3) return n - 1

        var i = 2

        var secondLast = 0
        var last = 1
        var lastSum = last + secondLast
        while (i < n) {
            lastSum = last + secondLast
            secondLast = last
            last = lastSum
            i++
        }
        return last + secondLast
    }
}
package problem

object LinkedListExample {
    val nums = intArrayOf(2, 4, 3)
    val nums1 = intArrayOf(5, 6, 4)

    val list1 = getListNode(nums)
    val list2 = getListNode(nums1)
    val result = addTwoNumbers(list1, list2)

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var firstItem = l1
        var secondItem = l2
        var carry = 0
        var head: ListNode? = null
        var temp: ListNode? = null

        while (firstItem != null || secondItem != null) {
            val value1 = if (firstItem != null) {
                val value = firstItem.`val`
                firstItem = firstItem.next
                value
            } else 0

            val value2 = if (secondItem != null) {
                val value = secondItem.`val`
                secondItem = secondItem.next
                value
            } else 0

            val sum = value1 + value2 + carry
            val sumVal = if (sum >= 10) {
                carry = 1
                sum % 10
            } else {
                carry = 0
                sum
            }

            val node = ListNode(sumVal, null)
            if (temp == null) {
                head = node
                temp = head
            }
            else {
                temp.next = node
                temp = temp.next
            }
        }

        if (carry > 0) {
            temp?.next = ListNode(carry, null)
        }
        return head
    }

    data class ListNode(var `val`: Int, var next: ListNode?)

    private fun getListNode(list: IntArray): ListNode {
        var next: ListNode? = null
        var current: ListNode? = null
        list.reversed().forEach {
            current = ListNode(it, next)
            next = current
        }
        return current!!
    }
}
package problem

class LinkedListMerge {
    /**
     * Example:
     * var li = ListNode(5)
     * var v = li.`val`
     * Definition for singly-linked list.
     * class ListNode(var `val`: Int) {
     *     var next: ListNode? = null
     * }
     */
    class Solution {
        fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
            val start = ListNode(0)
            while (list1?.next != null || list2?.next != null) {

                val first = list1?.`val` ?: 0
                val second = list2?.`val` ?: 0

                if (first < second) {
                    start.`val` = 0
                    start.next = start
                    list1?.next
                }
            }
            return null
        }
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

}
package problem

class LinkedListImpl() {

    fun performAction(args: Array<String>?) {
        val list = intArrayOf(1, 3, 4, 5, 7)

        val linkedList = getLinkedList(list)
        linkedList.show()
        print("\n-------------------------\n")

        linkedList.addToStart(10)
        linkedList.show()
        print("\n-------------------------\n")

        linkedList.addAt(3, 15)
        linkedList.show()
        print("\n-------------------------")

        val middle = linkedList.getMiddle()
        print("\nMiddle Element -> ${middle?.value}")
        print("\n-------------------------")
    }
}

fun getLinkedList(list: IntArray): LinkedList {
    val linkedList = LinkedList()
    list.forEach {
        linkedList.add(it)
    }
    return linkedList
}

class LinkedList {
    data class Node(var value: Any, var next: Node?)

    var head: Node? = null
    private lateinit var tail: Node

    public fun show() {
        var start = head
        while (start != null) {
            print("${start.value}, ")
            start = start.next
        }
    }

    fun add(value: Any) {
        val temp = Node(value, null)
        if (head == null) {
            head = temp
            tail = temp
        } else {
            tail.next = temp
            tail = temp
        }
    }

    fun addToStart(value: Any) {
        val temp = Node(value, null)
        if (head == null) {
            head = temp
            tail = temp
        } else {
            temp.next = head
            head = temp
        }
    }

    fun addAt(index: Int, value: Any) {
        val temp = Node(value, null)
        if (index == 0) {
            addToStart(value)
            return
        }

        var next = head
        var current = head
        var count = 1
        while (next != null && count < index) {
            current = next
            next = next.next
            count++
        }
        current?.next = temp
        temp.next = next
    }

    fun getMiddle(): Node? {
        if (head == null) return head
        var step1 = head
        var step2 = head
        while (step1?.next != null && step2?.next?.next != null) {
            step1 = step1.next
            step2 = step2?.next?.next
        }
        return step1
    }
}

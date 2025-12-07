import java.util.Stack

/* Example:
* var li = ListNode(5)
* var v = li.`val`
* Definition for singly-linked list.*/
class ListNode(var value: Int) {
    var next: ListNode? = null
}

fun reverseList(head: ListNode?): ListNode? {
 /*  // create stack to hold values
    val stack = Stack<Int>()
    var current = head
    // push values into the stack
    while (current != null) {
        stack.push(current.value)
        current = current.next
    }
    val reversedList = ListNode(0)
    var ptr : ListNode? = reversedList
    while(stack.isNotEmpty()){
        ptr?.next  = ListNode(stack.pop())
        ptr= ptr?.next
    }
    return reversedList.next*/
    if (head == null) return null
    if (head.next == null) return head
    var prev: ListNode? = null
    var cur: ListNode? = head
    while (cur != null) {
        val next = cur.next
        cur.next = prev
        prev = cur
        cur = next
    }
    return prev
}
fun main(){
    val list = ListNode(1)
    list.next = ListNode(2)
    list.next?.next = ListNode(3)
    list.next?.next?.next = ListNode(4)

    val reversed = reverseList(list)

    // Print reversed list
    var current = reversed
    while (current != null) {
        print("${current.value} ")
        current = current.next
    }
}

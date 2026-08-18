


class Solution {

    /*
    1 -> 2 -> 3 -> 4 -> 5
    1 -> 2 -> 3 -> 4 <- 5 (revese the pointers in second half of the list)
    1 -> 5 -> 2 -> 4 <- 3
    */
    public void reorderList(ListNode head) {
        if (head.next == null || head.next.next == null)
            return;

        // step 1: identify mid node (slow-fast pointers)
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // step 2: reverse second half of list (3 var; 4 steps)
        ListNode prev = null;
        ListNode cur = slow.next; // cur: second half from which we have to reverse
        while(cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        slow.next = null;  // last node
        
        // step 3: merge: head and prev
        ListNode first = head;
        ListNode second = prev;
        while(second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4};
        ListNode head = ListNode.createSingleLinkedList(values);

        System.out.print("Original List: ");
        ListNode.printLinkedList(head);

        Solution sc = new Solution();
        sc.reorderList(head);

        System.out.print("New List: ");
        ListNode.printLinkedList(head);

    }
}


class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        ListNode head = ListNode.createSingleLinkedList(values);

        System.out.print("Original List: ");
        ListNode.printLinkedList(head);

        // Reverse the linked list
        Solution sc = new Solution();
        ListNode reversedHead = sc.reverseList(head);

        System.out.print("Reversed List: ");
        ListNode.printLinkedList(reversedHead);
    }
}


class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(0, head);
        ListNode cur = res;

        for (int i = 0; i < n; i++) {
            head = head.next;
        }

        while (head != null) {
            head = head.next;
            cur = cur.next;
        }

        cur.next = cur.next.next;
        return res.next;
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        ListNode head = ListNode.createSingleLinkedList(values);

        System.out.print("Original List: ");
        ListNode.printLinkedList(head);

        Solution sc = new Solution();
        ListNode newHead = sc.removeNthFromEnd(head, 5);

        System.out.print("New List: ");
        ListNode.printLinkedList(newHead);

    }
}


class Solution {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] values = {3, 2, 0, -4};
        ListNode head = ListNode.createSingleLinkedList(values);

        int pos = 1;
        ListNode.linkNode(head, pos);

        Solution sc = new Solution();
        boolean cyclic = sc.hasCycle(head);
        if (!cyclic) {
            System.out.print("Original List: ");
            ListNode.printLinkedList(head);
        } else {
            System.out.println("Linked list is cyclic");
        }
    }
}

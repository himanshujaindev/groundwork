
class Solution {

    /*
    two pointers (list1 and list2)
    dummy node and temp pointer to build the merged list
    return next of dummy node
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if (list1 != null) {
            temp.next = list1;
        }

        if (list2 != null) {
            temp.next = list2;
        }

        return dummyNode.next;
    }

    public static void main(String[] args) {
        int[] values1 = {2, 5, 10};
        ListNode head1 = ListNode.createSingleLinkedList(values1);
        System.out.print("List 1: ");
        ListNode.printLinkedList(head1);

        int[] values2 = {1, 3, 6};
        ListNode head2 = ListNode.createSingleLinkedList(values2);
        System.out.print("List 2: ");
        ListNode.printLinkedList(head2);

        // Reverse the linked list
        Solution sc = new Solution();
        ListNode mergedList = sc.mergeTwoLists(head1, head2);

        System.out.print("Merged List: ");
        ListNode.printLinkedList(mergedList);
    }
}

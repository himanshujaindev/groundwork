
class Solution {

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    private ListNode divideAndConquer(ListNode[] lists, int low, int high) {
        if (low == high) {
            return lists[low];
        }
        int mid = (low + high) / 2;
        ListNode l1 = divideAndConquer(lists, low, mid);
        ListNode l2 = divideAndConquer(lists, mid + 1, high);
        return mergeTwoLists(l1, l2);
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        return divideAndConquer(lists, 0, lists.length - 1);
    }

    public static void main(String[] args) {
        int[][] values = {{1, 4, 5}, {1, 3, 4}, {2, 6}};
        ListNode[] lists = new ListNode[values.length];
        for (int i = 0; i < values.length; i++) {
            ListNode head = ListNode.createSingleLinkedList(values[i]);
            lists[i] = head;
        }

        System.out.println("Original List of linked list: ");
        for (int i = 0; i < values.length; i++) {
            ListNode.printLinkedList(lists[i]);
        }

        Solution sc = new Solution();
        ListNode newHead = sc.mergeKLists(lists);

        System.out.println("Merged List: ");
        ListNode.printLinkedList(newHead);

    }
}


public class ListNode {

    int val;
    ListNode next;

    // Default constructor
    public ListNode() {
    }

    // Constructor with a value
    public ListNode(int val) {
        this.val = val;
    }

    // Constructor with value and next node
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // Method to add elements to the linked list
    public static ListNode createSingleLinkedList(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    // Method to print the linked list
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + (current.next != null ? " -> " : ""));
            current = current.next;
        }
        System.out.println();
    }

    public static void linkNode(ListNode head, int pos) {
        ListNode cur = head;
        ListNode tail = head;

        while (tail.next != null) {
            tail = tail.next;
        }

        int i = 0;
        while (i++ < pos) {
            cur = cur.next;
        }

        tail.next = cur;
    }
}

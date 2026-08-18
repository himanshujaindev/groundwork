package DataStructures.Implementation.LinkedList;

public class single_linked_list {
    Node head; // initially pointing to nothing

    public static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // insert node method
    public static single_linked_list insert(single_linked_list list, int data) {

        Node node = new Node(data);

        if (list.head == null) {
            list.head = node;
        }

        else {
            Node temp = list.head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = node;
        }

        return list;
    }

    // print list
    public static void print(Node head) {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    // reverse list
    public static Node reverse_list(single_linked_list list) {
        // 3 pointers; 4 steps

        Node cur = list.head;
        Node prev = null;
        while (cur != null) {
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        single_linked_list list = new single_linked_list();

        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        print(list.head);

        Node start = reverse_list(list);
        print(start);
    }

}

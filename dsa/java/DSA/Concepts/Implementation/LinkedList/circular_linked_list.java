package DataStructures.Implementation.LinkedList;

public class circular_linked_list {

    Node head;
    Node tail;

    public static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static circular_linked_list insert(circular_linked_list list, int data) {
        Node node = new Node(data);

        if (list.head == null) {
            list.head = node;
            list.tail = node;
        } else {
            Node cur = list.head;
            while (cur != list.tail) {
                cur = cur.next;
            }

            // Insertion
            node.next = list.head;
            list.tail.next = node;
            list.tail = list.tail.next;
        }

        return list;

    }

    public static void display(circular_linked_list list) {
        Node cur = list.head;
        while (cur != list.tail) {
            System.out.print(cur.data + "->");
            cur = cur.next;
        }

        System.out.println(cur.data);
    }

    public static void main(String[] args) {
        circular_linked_list list = new circular_linked_list();
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);

        display(list);
    }
}

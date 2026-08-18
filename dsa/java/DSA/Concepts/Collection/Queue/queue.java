package DataStructures.Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

/*
Reference: https://www.geeksforgeeks.org/queue-interface-java/
*/

public class queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue.toString());

        int elem = queue.remove();

        int head = queue.element();
        int head1 = queue.peek();

        int head_remove = queue.poll();
        int head1_remove = queue.remove();

        System.out.println(queue.toString());
    }

}

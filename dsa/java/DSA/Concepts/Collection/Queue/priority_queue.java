package DataStructures.Collection.Queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class priority_queue {
    public static void main(String[] args) {
        Queue<Character> pq1 = new PriorityQueue<>();
        pq1.add('a');
        pq1.add('o');
        pq1.add('e');

        // ['a', 'e', 'o'] - Default priority = Min ascii value

        System.out.println(pq1.toString());

        // Printing the top element of
        // the PriorityQueue
        System.out.println(pq1.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pq1.poll());

        // Printing the top element again
        System.out.println(pq1.peek());

        PriorityQueue<Integer> pq2 = new PriorityQueue<>(); // min PQ
        pq2.add(3);
        pq2.add(1);
        pq2.add(2);
        System.out.println(pq2.toString());
        System.out.println(pq2.poll());
        System.out.println(pq2.poll());
        System.out.println(pq2.poll());

        PriorityQueue<Integer> pq3 = new PriorityQueue<>(Collections.reverseOrder()); // max PQ
        pq3.add(3);
        pq3.add(1);
        pq3.add(2);
        System.out.println(pq3.toString());
        System.out.println(pq3.poll());
        System.out.println(pq3.poll());
        System.out.println(pq3.poll());

        // min-heap: based on processing_time; if equal -> index
        int[][] process = { { 4, 2, 1 }, { 2, 10, 4 }, { 3, 2, 0 }, { 1, 1, 3 } }; // [enqueue_time, processing_time, index]
        PriorityQueue<int[]> pq4 = new PriorityQueue<>((a, b) -> a[1] != b[1] ? a[1] - b[1] : a[2] - b[2]);
        for (int i = 0; i < 4; i++)
            pq4.add(process[i]);

        while (!pq4.isEmpty()) {
            int[] top = pq4.poll();
            System.out.println(top[0] + " " + top[1] + " " + top[2]);
        }
    }
}

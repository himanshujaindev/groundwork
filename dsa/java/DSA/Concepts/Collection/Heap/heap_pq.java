package DataStructures.Collection.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

// Using priority queue

public class heap_pq {
    public static void main(String[] args) {

        // MIN HEAP - Default
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1000);
        pq.add(100);
        pq.add(-10);
        pq.add(1);

        System.out.println(pq); // [-10, 1, 100, 1000] -> Default is MIN HEAP

        pq.poll();
        System.out.println(pq);

        // MAX HEAP
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());

        pq2.add(1000);
        pq2.add(100);
        pq2.add(-10);
        pq2.add(1);

        System.out.println(pq2); // [-10, 1, 100, 1000] -> Default is MIN HEAP

        pq2.poll();
        System.out.println(pq2);
    }
}

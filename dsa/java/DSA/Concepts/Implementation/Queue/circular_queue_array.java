package DataStructures.Implementation.Queue;

class MyCircularQueue {
    int[] queue;
    int start = 0, end = -1, size = 0; // and points to last inserted element
    int maxCapacity;

    public MyCircularQueue(int k) {
        queue = new int[k];
        maxCapacity = k;
        return;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }

        size++;
        end = (end + 1) % maxCapacity;
        queue[end] = value;

        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }

        size--;
        start = (start + 1) % maxCapacity;
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }

        return queue[start];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }

        return queue[end];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxCapacity;
    }
}

public class circular_queue_array {

    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        System.out.println(myCircularQueue.enQueue(1)); // return True
        System.out.println(myCircularQueue.enQueue(2)); // return True
        System.out.println(myCircularQueue.enQueue(3)); // return True
        System.out.println(myCircularQueue.enQueue(4)); // return False
        System.out.println(myCircularQueue.Rear()); // return 3
        System.out.println(myCircularQueue.isFull()); // return True
        System.out.println(myCircularQueue.deQueue()); // return True
        System.out.println(myCircularQueue.enQueue(4)); // return True
        System.out.println(myCircularQueue.Rear()); // return 4
    }
}

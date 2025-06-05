
import java.util.*;

public class QueueMethods {
    public static void main(String[] args) {
        // Creating a Queue
        Queue<String> queue = new LinkedList<>();

        // 1. add(element): Adds an element to the queue. Throws an exception if the
        // queue is full.
        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");
        System.out.println("Queue after add(): " + queue);

        // 2. offer(element): Adds an element to the queue. Returns false if the queue
        // is full, instead of throwing an exception.
        queue.offer("date");
        System.out.println("Queue after offer(): " + queue);

        // 3. element(): Retrieves the head of the queue without removing it. Throws an
        // exception if the queue is empty.
        System.out.println("Head of the queue using element(): " + queue.element());

        // 4. peek(): Retrieves the head of the queue without removing it. Returns null
        // if the queue is empty.
        System.out.println("Head of the queue using peek(): " + queue.peek());

        // 5. remove(): Retrieves and removes the head of the queue. Throws an exception
        // if the queue is empty.
        System.out.println("Removed element using remove(): " + queue.remove());
        System.out.println("Queue after remove(): " + queue);

        // 6. poll(): Retrieves and removes the head of the queue. Returns null if the
        // queue is empty.
        System.out.println("Removed element using poll(): " + queue.poll());
        System.out.println("Queue after poll(): " + queue);

        // 7. size(): Returns the number of elements in the queue
        System.out.println("Size of the queue: " + queue.size());

        // 8. isEmpty(): Checks if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());

        // Clearing the queue to demonstrate isEmpty()
        queue.clear();
        System.out.println("Queue after clear(): " + queue);
        System.out.println("Is the queue empty after clear()? " + queue.isEmpty());
    }
}

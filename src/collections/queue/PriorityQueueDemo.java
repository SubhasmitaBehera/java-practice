package collections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        PriorityQueue<Integer> queue1 = new PriorityQueue<>();

        queue.add("Amit");
        queue.add("Bibhu");
        queue.add("Karan");
        queue.add("Jai");
        queue.add("Rahul");
        System.out.println(queue1.peek());
        System.out.println("Head: " + queue.element());    // if the queue is Empty it will throw Exception
        System.out.println("Head: " + queue.peek());       // Same as elements() but returns NULL if the queue is Empty
        System.out.println("Iterating the queue elements:");

        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        queue.remove();
        queue.remove();
        queue.remove();


        queue.poll(); // same as remove but it returns NULL when the Queue is empty

        System.out.println("----------------------------------------------");

        System.out.println("After removing two elements:");

        Iterator<String> itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());  // the out put after removing will not come in order as it is a priority Queue
        }

        System.out.println(queue);
    }
}


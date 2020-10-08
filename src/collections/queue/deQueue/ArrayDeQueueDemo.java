package collections.queue.deQueue;

import java.util.ArrayDeque;

//ArrayDeque is faster than LinkedList and Stack
public class ArrayDeQueueDemo {  //Interface : De-Queue
    public static void main(String[] args) {
        ArrayDeque<String> ad = new ArrayDeque<>();

        ad.add("Name1");  //3
        ad.add("Name2");  //4
        ad.addFirst("Name3");  //2
        ad.addLast("Name4");  //5
        ad.offer("Name5"); //6
        ad.offerFirst("Name6");  //1
        ad.offerLast("Name7");  //7
        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());
        System.out.println(ad.element());
        System.out.println(ad.peek());
        System.out.println(ad.remove());
        System.out.println(ad.removeFirst());
        System.out.println(ad.removeLast());
        ad.poll();
        ad.pollFirst();
        ad.pollLast();
        System.out.println("The elements in the ArrayDeque are : " +ad);
    }
}

package collections.queue;

import java.util.PriorityQueue;

class Book implements Comparable {  // We have to implement as a user-defined object can not be added directly to queue

    int price;
    String bookName;
    String author;

    public Book(int price, String bookName, String author) {
        this.price = price;
        this.bookName = bookName;
        this.author = author;
    }

    @Override      // We have to override as Comparable is a Interface and compareTo is a method inside Comparable
    public int compareTo(Object o) {
        return 0;
    }
}

public class PriorityQueueExample {
    public static void main(String[] args) {
        Book b1 = new Book(1200,"Java By Bablu","Bablu");
        Book b2 = new Book(1400,"Python By Bibhu","Bibhu");
        Book b3 = new Book(1600,"C++ By Miki","Miki");

        PriorityQueue<Book> queue = new PriorityQueue();

        queue.add(b1);
        queue.add(b2);
        queue.add(b3);

        System.out.println("The List of Books in Queue are : "+ queue); // [ [1200,java by bablu],[] ]

//        Iterator it = queue.iterator();
//        while (it.hasNext())
//            System.out.println(it.next());
// The above will not work as there are two different classes and the fields of book can be accessed by the below way

        for (Book b : queue)
            System.out.println("The Book name is : "+b.bookName + " & Price is : "+b.price+ " Author of the book is" +
                    " "+ b.author);

    }
}


package collections.queue.deQueue;


import java.util.ArrayDeque;

class Book{
    int price;
    String nameOfBook,author;

    public Book(int price, String nameOfBook, String author) {
        this.price = price;
        this.nameOfBook = nameOfBook;
        this.author = author;
    }
}
public class ArrayDequeueExample {
    public static void main(String[] args) {

        ArrayDeque<Book> adq = new ArrayDeque<>();
        Book obj = new Book(1200,"Java","Bibhu");
        Book obj1 = new Book(1100,"Java","Saroj");
        Book obj2 = new Book(1300,"Java","Mik & Sum");

        adq.add(obj);
        adq.add(obj1);
        adq.add(obj2);

        for (Book o : adq)
            System.out.println("Name of the book "+o.nameOfBook+"Price = "+o.price+"Author is :"+o.author);


        System.out.println("Name of the book "+obj.nameOfBook+"Price = "+obj.price+"Author is :"+obj.author);
        System.out.println("Name of the book "+obj1.nameOfBook+"Price = "+obj1.price+"Author is :"+obj1.author);
        System.out.println("Name of the book "+obj2.nameOfBook+"Price = "+obj2.price+"Author is :"+obj2.author);
    }
}

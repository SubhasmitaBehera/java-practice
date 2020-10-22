package thread.threadManipulation;

// Another way to calling multiple threads using anonymous class (using thread class)
public class ThreadManipulation1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                System.out.println("Running for t1...");
                Thread.yield();
                for (int i = 0; i < 3; i++)
                    System.out.println("t1 :" +i);
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                System.out.println("Running for t2...");
                for (int i = 0; i < 3; i++)
                    System.out.println("t2 : " +i);
            }
        };
        t1.start();
        t2.start();
    }
}

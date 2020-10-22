package thread.threadManipulation;

//thread manipulation using anonymous class (using runnable interface)
public class ThreadManipulation2 {
    public static void main(String[] args) {

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running r1 ....");
            }
        };
        Runnable r2 = () ->
                System.out.println("Running r2....");  //using lambda , will discuss lambda later
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }

}

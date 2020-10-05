package thread;

public class ThreadSleep extends Thread {
    public void run(){
        for (int i = 1; i<5; i++){
            try {
                Thread.sleep(5000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadSleep t1 = new ThreadSleep();
        ThreadSleep t2 = new ThreadSleep();
        t1.start();
        t2.start();
    }
}

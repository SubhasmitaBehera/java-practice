package thread;

public class ThreadSleep extends Thread {
    public void run(){
        for (int i = 1; i<5; i++){
            try {
                Thread.sleep(5000);
            }
            catch (InterruptedException e) {
                System.out.println(e);;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadSleep t1 = new ThreadSleep();  //New state
        ThreadSleep t2 = new ThreadSleep();
        t1.start();  //Runnable
        t2.start();  //Thread scheduler
    }
}

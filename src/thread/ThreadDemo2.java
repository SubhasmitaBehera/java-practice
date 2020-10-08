package thread;

public class ThreadDemo2 implements Runnable {
    public void run(){
        System.out.println("Thread is running...");   //RUNNING
    }

    public static void main(String[] args) {
        ThreadDemo2 threadDemo2 = new ThreadDemo2();  //NEW
        Thread thread = new Thread(threadDemo2);
        thread.start();  //RUNNABLE
    }
}

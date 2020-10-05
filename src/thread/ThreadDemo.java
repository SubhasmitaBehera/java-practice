package thread;

public class ThreadDemo extends Thread {
    public void run(){
        System.out.println("Thread is running...");  //RUNNING
    }

    public static void main(String[] args) {
        ThreadDemo thread = new ThreadDemo();  //NEW
        thread.start();   //RUNNABLE
    }
}

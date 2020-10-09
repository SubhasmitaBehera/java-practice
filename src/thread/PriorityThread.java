package thread;

public class PriorityThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName() +" Running...");
    }

    public static void main(String[] args) {
        PriorityThread m1 = new PriorityThread();
        PriorityThread m2 = new PriorityThread();
        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);
        m1.start();
        m2.start();
        System.out.println(m1.getPriority());
        System.out.println(m2.getPriority());
    }
}

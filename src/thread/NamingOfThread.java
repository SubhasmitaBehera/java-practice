package thread;

public class NamingOfThread extends Thread {
    public void run() {
        Thread.yield();
        System.out.println(Thread.currentThread().getName()); //Returns the name of the Currently running thread
        System.out.println("Running...");
    }

    public static void main(String[] args) {
        NamingOfThread t1 = new NamingOfThread();
        NamingOfThread t2 = new NamingOfThread();
        NamingOfThread t3 = new NamingOfThread();

        t1.start();
        t2.start();
        t3.start();

        System.out.println("____________________________________________");
        System.out.println("Name of First thread by default : " +t1.getName());
        System.out.println("ID of First thread : " + t1.getId());
        System.out.println("Priority of First thread : " + t1.getPriority());
        System.out.println("Minimum priority of First thread : " + t1.MIN_PRIORITY);
        System.out.println("Maximum priority of First thread : " + t1.MAX_PRIORITY);
        System.out.println("State of First thread : " + t1.getState());

        System.out.println("____________________________________________");
        System.out.println("Name of Second thread by default : " +t2.getName());
        System.out.println("ID of Second thread : " + t2.getId());
        System.out.println("Priority of Second thread : " + t2.getPriority());
        System.out.println("Minimum priority of Second thread : " + t2.MIN_PRIORITY);
        System.out.println("Maximum priority of Second thread : " + t2.MAX_PRIORITY);
        System.out.println("State of Second thread : " + t2.getState());

        System.out.println("____________________________________________");
        System.out.println("Name of Third thread by default : " +t3.getName());
        System.out.println("ID of Third thread : " + t3.getId());
        System.out.println("Priority of Third thread : " + t3.getPriority());
        System.out.println("Minimum priority of Third thread : " + t3.MIN_PRIORITY);
        System.out.println("Maximum priority of Third thread : " + t3.MAX_PRIORITY);
        System.out.println("State of Third thread : " + t3.getState());

        t1.setName("First Thread...");
        t2.setName("Second Thread...");
        t3.setName("Third Thread...");
        System.out.println("------------------------------------------------");

        System.out.println("Name of First thread after change : " +t1.getName());
        System.out.println("Name of Second thread after change : " +t2.getName());
        System.out.println("Name of Third thread after change : " +t3.getName());
    }
}

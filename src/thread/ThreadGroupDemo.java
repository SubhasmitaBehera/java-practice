package thread;

public class ThreadGroupDemo implements Runnable{
    public void run(){
        System.out.println("Thread name is: " +Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadGroupDemo runnable = new ThreadGroupDemo();
        ThreadGroup tg = new ThreadGroup("ThreadGroup-1");
        Thread t1 = new Thread(tg,runnable,"One"); //Thread-0
        Thread t2 = new Thread(tg,runnable,"Two"); //Thread-1
        Thread t3 = new Thread(tg,runnable); //Thread-2

        //1-10[MIN = 1 MAX 10 NORP = 5]

        t1.setName("Miki-0");
        t2.setName("Miki-1");
        t3.setName("Miki-2");

        t1.start();
        t2.start();
        t3.start();

//        t1.stop();

        t1.setPriority(9);
        t2.setPriority(8);
        t3.setPriority(4);
//        [name = ThreadGroup-1, MaxPri = 10]

        tg.list(); //information about the thread belonging the thread group [name, priority, thread group]
    }
}

package thread;

public class DaemonThreadDemo extends Thread {
    // Daemon thread is a low priority thread
    // its life depends upon the user thread
    // We have two methods to set a thread or to check a thread as Daemon
    // 1. setDaemon() - to set a thread as daemon
    // 2. isDaemon() - to  check a thread daemon or not
    public void run() {
        if (Thread.currentThread().isDaemon())
            System.out.println("Its a Daemon Thread");
        else {
            Thread.yield();
            try {
                Thread.sleep(1100);
            } catch (InterruptedException i){
                System.out.println(i);
            }
            for (int i = 1; i < 5; i++) {
                System.out.println("Values are : " + i);
            }
            System.out.println("user thread executed..");
        }
    }

    public static void main(String[] args) {
        DaemonThreadDemo t1 = new DaemonThreadDemo();
        DaemonThreadDemo t2 = new DaemonThreadDemo();

        t1.setDaemon(true); // to set t1 thread as Daemon
        t1.start();
        t2.start();
    }
}

package thread.types;

public class SuspendWaitResumeNotifyStop implements Runnable {

    public Thread t;
    private String threadName;
    boolean suspended = false;

    SuspendWaitResumeNotifyStop(String name) {
        threadName = name;
        System.out.println("Creating " + threadName); // Thread 1
    }

    public void run() {
        System.out.println("Running " + threadName); // Thread 1
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(300);
                synchronized (this) {
                    while (suspended) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName); // Thread 1
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

    void suspend() {
        suspended = true;
    }

    synchronized void resume() {
        suspended = false;
        notify();
    }
}

class TestThread1 {

    public static void main(String args[]) {

        SuspendWaitResumeNotifyStop R1 = new SuspendWaitResumeNotifyStop("Thread-1");
        R1.start();

        SuspendWaitResumeNotifyStop R2 = new SuspendWaitResumeNotifyStop("Thread-2");
        R2.start();

        try {
            Thread.sleep(1000);
            R1.suspend();
            R1.start();
            System.out.println("Suspending First Thread");
            Thread.sleep(1000);
            R1.resume();
            R1.start();
            System.out.println("Resuming First Thread");

            R2.suspend();
            System.out.println("Suspending thread Two");
            Thread.sleep(1000);
            R2.resume();
            System.out.println("Resuming thread Two");
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        try {
            System.out.println("Waiting for threads to finish.");
            R1.t.join();
            R2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}

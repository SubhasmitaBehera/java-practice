package thread.types;

class RunnableDemo extends Thread {
    private Thread t;
    private String threadName; // thread -1

    RunnableDemo( String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }

    public void run() {
        System.out.println("Running " +  Thread.currentThread().getName());
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println( Thread.currentThread().getName() + ", " + i);// Thread-1- new, 4
                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +   Thread.currentThread().getName() + " exiting.");
    }

    public void start () {
        System.out.println("Starting " +  threadName ); // Thread - 1
        if (t == null) {
            t = new Thread (new RunnableDemo("Thread-1-new")); // way 1
            t = new Thread (this,threadName); // way2 - better approach
            t.start ();
        }
    }

}

class TestThread {
    public static void main(String args[]) {
        RunnableDemo R1 = new RunnableDemo("Thread-1");
        R1.start();
        RunnableDemo R2 = new RunnableDemo( "Thread-2");
        R2.start();
    }
}
package thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class ThreadPoolDemo implements Runnable
{
    private String name;

    public ThreadPoolDemo(String s)
    {
        name = s;
    }

    // Prints task name and sleeps for 1s
    // This Whole process is repeated 5 times
    public void run()
    {
        System.out.println("Active Threads : "+Thread.activeCount());
        try
        {
            for (int i = 0; i<=5; i++)
            {
                if (i==0)
                {
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Initialization Time for"
                            + " task name - "+ name +" = " +ft.format(d)+" Value of i = "+i);
                    //prints the initialization time for every task
                }

                else
                {
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Executing Time for task name - "+
                            name +" = " +ft.format(d)+" Value of i = "+i);
                    // prints the execution time for every task
                }
                Thread.sleep(1000);

            }
            System.out.println(name+" complete");
        }

        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
class Task
{
    // Maximum number of threads in thread pool
    static final int MAX_T = 3;

    public static void main(String[] args)
    {
        // creates five tasks
        Runnable r1 = new ThreadPoolDemo("task 1");
        Runnable r2 = new ThreadPoolDemo("task 2");
        Runnable r3 = new ThreadPoolDemo("task 3");
        Runnable r4 = new ThreadPoolDemo("task 4");
        Runnable r5 = new ThreadPoolDemo("task 5");

        // creates a thread pool with MAX_T no. of
        // threads as the fixed pool size(Step 2)
        ExecutorService  pool = Executors.newFixedThreadPool(MAX_T);

        // passes the Task objects to the pool to execute (Step 3)
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);
        try {

            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println(e);
        }
        Runnable r6 = new ThreadPoolDemo("task 6");
        Runnable r7 = new ThreadPoolDemo("task 7");
        Runnable r8 = new ThreadPoolDemo("task 8");

        pool.execute(r6);
        pool.execute(r7);
        pool.execute(r8);
        // pool shutdown ( Step 4)
        pool.shutdown();
    }
}

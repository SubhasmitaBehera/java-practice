package thread.threadManipulation;

class X implements Runnable{
    public void run(){
        for (int i = 1 ; i <=5 ; i++ ){
            if (i==1)
                Thread.yield();   //Stops temporarily the  execution of current thread
            System.out.println("From thread X : i = " +i);
        }
        System.out.println("Exit from X...");
    }
}
class Y extends Thread{
    public void run(){
        for(int j = 1 ; j<=5 ; j++){
            if (j == 3)
                stop();
            System.out.println("From Thread Y : j = " +j);
        }
        System.out.println("Exit form Y...");
    }
}
class Z extends Thread{
    public void run() {
        for (int k = 1 ; k<=5 ; k++){
            if (k==1)
                try {
                    sleep(3000);
                    System.out.println(k);
                } catch (Exception e) {
                    System.out.println("Exception");
                }
        }
        System.out.println("Exit from Z...");
    }
}

public class ThreadManipulation {
    public static void main(String[] args) {
        X obj1 = new X();
        Thread thread = new Thread(obj1);
        Y obj2 = new Y();
        Z obj3 = new Z();
        thread.start();
        obj2.start();
        obj3.start();
    }
}

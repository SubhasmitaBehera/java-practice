package thread;

public class JoinMethod extends Thread{
    public void run() {
        for (int i = 0 ; i<=5 ; i++){
            try{
                Thread.yield();
            }
            catch (Exception ie){
                System.out.println(ie);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        JoinMethod obj1 = new JoinMethod();
        JoinMethod obj2 = new JoinMethod();
        JoinMethod obj3 = new JoinMethod();

        obj1.start();
        try{
            obj1.join();
        }
        catch (InterruptedException ie){
            System.out.println(ie);
        }
        obj2.start();
        obj3.start();
    }
}

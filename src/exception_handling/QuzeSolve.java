package exception_handling;

public class QuzeSolve {
    public static void meth() throws Exception{
        try {
            System.out.println("Normal Statement");
            throw new Exception();
        }
        finally {
            System.out.println("Finally block");
        }
    }
    public static void main(String[] args) {
        try {
            meth();
        }
        catch (Exception e){
            System.out.println("Inside catch block");
        }
        System.out.println("Another Normal Statement");
    }
}

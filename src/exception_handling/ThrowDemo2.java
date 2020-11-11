package exception_handling;

public class ThrowDemo2 {
    void m(){
//            throw new java.io.IOException("device error");   //checked exception not propagate
        throw new ArithmeticException("Got Arithmetic Exception "); // It will propagate
    }
    void n(){
        System.out.println("Hi");
        m();
    }
    void p() {

        try{
            n();
        } catch(Exception e) {System.out.println(e);}
    }
    public static void main(String args[]) {
        ThrowDemo2 obj = new ThrowDemo2();
        obj.p();
        System.out.println("normal flow");
    }
}

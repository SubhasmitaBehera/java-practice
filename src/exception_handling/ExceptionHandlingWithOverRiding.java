package exception_handling;


import java.io.IOException;

class A {
    void miki() throws IOException {
        System.out.println("Miki Method");
    }
}
class B extends A{
    void miki() /*throws ArrayIndexOutOfBoundsException*/ {
        System.out.println("Miki Method in SubClass");
        throw new ArithmeticException();
//        int d = 19/0;
    }
}
public class ExceptionHandlingWithOverRiding {
    public static void main(String[] args) throws IOException {
        B obj = new B();
        obj.miki();
    }
}





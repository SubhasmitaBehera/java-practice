package exception_handling;

public class Quize3 {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException("try");
        }
        catch (ArithmeticException ae) {
            throw new ArithmeticException("catch");
        }
        finally {
            throw new ArithmeticException("finally");
        }
    }
}

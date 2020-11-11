package exception_handling;

public class Quize2 {
    public static void main(String[] args) {
        try {
            badMethod();
            System.out.println("a");
        } catch (Throwable e) {
            System.out.println("Exc");
        } finally {
            System.out.println("finally");
        }
        System.out.println("another normal srat");
    }
    public static void badMethod(){
        throw new Error();
    }
}

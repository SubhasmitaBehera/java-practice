package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;
// Exception in Java often divide into two types
// 1 . Checked Exception(Compile  Time exception)
// 1 . Unchecked  Exception(Run time Exception)
//
public class ExceptionHandling {
    //****************** part 1  of the program***********************//
    // Knowing Various types of Exception(Unchecked )

    public static void main(String[] args) {
        int a,b,c;
//        float arr[] ={16,26,36};
//        float arr1[] = {1.2f,2,5,4,5,7};
//        float arr2[]= new float[10];
//
////        String str = null;
////        System.out.println(str.length());  // Null Pointer Exception
//
////        String str1 = "Sangeta";           // String index out of bound Exception
////        for (int j = 0 ; j < 9; j++){
////            System.out.println(str1.charAt(j));
////        }
//
        Scanner in = new Scanner(System.in);
//        try {
//            for (int i = 0; i <= 10; i++) {  // ArrayIndexOutOfBoundException
//                arr2[i] = arr[i] / arr1[i];
//                System.out.println(arr2[i]);
//            }
//            System.out.println("Hi");
//            System.out.println("Hi");
//
//        }
//
//        catch (ArrayIndexOutOfBoundsException  ee){
//            System.out.println("Error:- "+ ee.getMessage());
////            System.exit(0);                     // If we Write Exit then Final block will not be called
//        }
//
//        finally {
//            System.out.println("hi hello bye bye");
//        }
//
//        System.out.println("rst of d code"); // Here this code will not be executed if the above exception not
//        // handled but inspite of exception not handled the finally block will always be executed
//
//
//
//        //****************** part 2  of the program***********************//
//        //" Multi try catch" with "Nested try and catch"
//
//        try {
//
//            System.out.println("Enter A string :");
//            String str = in.nextLine();
//            int d = Integer.parseInt(str); // NumberFormat Exception
//
//            System.out.print("Enter The value of A : ");
//            a = in.nextInt();                         // InputMismatch Exception if String is given input
//            System.out.print("Enter The value of B : ");// or if ctrl+D is given input "Unhandled Exception" shown
//            b = in.nextInt();
////
//            try {
//                c = a / b;
//                System.out.println("a/b ="+ c);
//            }
//
//            catch (ArrayIndexOutOfBoundsException ae) {
//                System.out.println("Error   :-  "+ ae.getMessage());
////            System.exit(0);
//                // If we Write Exit then Final block will not be called
//            }
//        }
//
//        catch (ArithmeticException ae){
//            System.out.println("Error   :-  "+ ae.getMessage());
//            System.exit(0);
//            // If we Write Exit then Final block will not be called
//        }
//
//        catch (InputMismatchException ew){
//            System.out.println("Error : "+ew);
//        }
//
//        catch (Exception ew){
//            System.out.println("Error general : "+ew);
//        }
//// We have always place the typed Exceptions first then put the General Exception
//        finally {
//            System.out.println("This statement always executed");
//        }
//
//
//        System.out.println("Hello");  // flow of the execution would be normal if all the exceptions are handled
//        //****************** part 3  of the program***********************//
//        // Just another example of nested try and catch of another type
//
//        try {
//            try{
//                System.out.println("going to divide");
//
//                int e =39/0;
//
//            }catch(ArithmeticException e){System.out.println(e);}
//
//            try{
//                int f[]=new int[5];
//                f[5]=4;
//            } catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
//
//            System.out.println("other statement");
//
//        } catch(Exception e) {System.out.println("handeled");}
//
//        System.out.println("normal flow..");
//
//        //****************** just a program from udemy (Reason Still unsolved)***********************//

        while (true){
            try {
                System.out.println("Enter an Integer :");
                a = in.nextInt();
            }catch (InputMismatchException im){
                in.nextLine();
//                System.out.println(s);
                System.out.println("Enter an integer only ");
            }
        }
    }
}


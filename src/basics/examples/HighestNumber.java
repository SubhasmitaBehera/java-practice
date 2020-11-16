package basics.examples;

import java.util.Scanner;
//
//public class HighestNumber {
//    public static void main(String[] args) {
//        System.out.println("Enter the Number and Hit Enter Key to Proceed !");
//        Scanner myObj  = new Scanner(System.in); //Scanner - Used to take input from user, new- Create a new object
//        System.out.print("Enter 1st Number : ");
//        int a = myObj.nextInt() ;
//        System.out.print("Enter 2nd Number : ");
//        int b = myObj.nextInt() ;
//        System.out.print("Enter 3rd Number : ");
//        int c = myObj.nextInt() ;
//
//
//        if (a==b && b==c && c==a){
//            System.out.println("The numbers are : A = " + a + ", B = " + b + " & C = " + c);
//            System.out.println("All Numbers Are same i.e " + a);
//        }
//
//        else if (a== b && a > c){
//            System.out.println("The numbers are : A = " + a + ", B = " + b + " & C = " + c);
//            System.out.println("Both A and B are Same and are larger than  C");
//        }
//
//        else if (a== c && a > b){
//            System.out.println("The numbers are : A = " + a + ", B = " + b + " & C = " + c);
//            System.out.println("Both A and C are Same and are larger than  B");
//        }
//
//        else if (c== b && c > a){
//            System.out.println("The numbers are : A = " + a + ", B = " + b + " & C = " + c);
//            System.out.println("Both B and C are Same and are larger than  A");
//        }
//
//        else if (a > b && a > c) {
//            System.out.println("The numbers are : A = " + a + ", B = " + b + " & C = " + c);
//            System.out.println("A is the Largest Number ");
//        }
//
//        else if (b > a && b > c) {
//            System.out.println("The numbers are : A = " + a + ", B = " + b + " & C = " + c);
//            System.out.println("B is the Largest Number ");
//        }
//
//        else {
//            System.out.println("The numbers are : A = " + a + ", B = " + b + " & C = " + c);
//            System.out.println("C is the Largest Number ");
//        }
//    }
//}
//
public class HighestNumber {
    public static void main(String[] args) {
        int a = 22,b= 22,c= 22;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);


//        System.out.println(ab);
        if (a==b && b==c && c==a){
            System.out.println("The numbers are : A = " + a + ", B = " + b + " & C = " + c);
            System.out.println("All Numbers Are same i.e " + a);
        }

        else if (a > b && a > c) {
            System.out.println("The numbers are : A = " + a + ", B = " + b + " & C = " + c);
            System.out.println("A is the Largest Number ");
        }

        else if (b > a && b > c) {
            System.out.println("The numbers are : A = " + a + ", B = " + b + " & C = " + c);
            System.out.println("B is the Largest Number ");
        }

        else {
            System.out.println("The numbers are : A = " + a + ", B = " + b + " & C = " + c);
            System.out.println("C is the Largest Number ");
        }
    }
}



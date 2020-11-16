package basics.operators;

import java.util.Scanner;

public class OperatorsMain {

    public static void main(String[] args) {
        int a = -13;  // left shift = msb  00000010
        int b = 2;  // ight shift = lsb

        Scanner rg = new Scanner(System.in);
        System.out.print("Enter Your name : ");
        String name = rg.nextLine();
        System.out.println("The entered name is : " + name + (a + b));
        System.out.println("My Name is : Subhasmita Behera");

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a>>b); //  00000000
        System.out.println(a<<b); //  00000011
        System.out.println(a%b);
        System.out.println(a!=b);
//
    }

}

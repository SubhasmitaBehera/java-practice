package oops.interface_class;

import java.util.Scanner;

interface Inter{
    void PrintIt(int x);
    void Square(int X);
}

class Child implements Inter {
    public void PrintIt(int x){
        System.out.println("The number is :- "+x);
    }
    public void Square(int x){
        System.out.println("The square of the number is:- " +x*x);
    }
}

public class InterFace_Class2 {
    public static void main(String[] args) {
        Child obj = new Child();
        Scanner sc = new Scanner(System.in );
        System.out.print("Enter a number:- ");
        int input= sc.nextInt();
        obj.PrintIt(input);
        obj.Square(input);
    }
}

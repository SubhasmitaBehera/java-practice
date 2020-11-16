package basics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int sum=0;
        int x=0;
        int y=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a range to see fibonacci series:- ");
        int num= sc.nextInt();
        int temp= num;
        System.out.println("basics.Fibonacci series of first " +num +" number is :-");
        if (num==1){
            System.out.println("x");
        }
        else if(num!=1){
            System.out.println(x);
            System.out.println(y);
            while (num-2 >0){
                int z = x+y;
                x=y;
                y=z;
                num--;
                System.out.println(z);
                sum=sum+z;

            }
        }
        System.out.println("The sum of first "+ temp +" number is :- "+sum);
    }
}

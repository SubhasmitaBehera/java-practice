package basics.examples;

import java.util.Scanner;

public class PrimeInARange {
    public static void main(String[] args){
        int counter = 0;
        int temp = 0;

        System.out.println("Enter a range of prime numbers to find Prime Numbers");
        Scanner Obj = new Scanner(System.in);
        System.out.print("Enter 1st Num : ");
        int a = Obj.nextInt();
        System.out.print("Enter 2nd Num : ");
        int b = Obj.nextInt();
        int total_num = b - a +1 ;

        if (a == 1) {
            System.out.println("1 is a special number ");
            temp = a;
            a++;
        }

        if (a < b){
            for (int i = a ; i <= b ; i++){
                int c = 0;
                for (int j= 2 ; j < i ; j++){
                    if ( i % j == 0){
                        c = 0;
                        c+= 1;
                        System.out.println( i + " is not a prime number !");
                        break;
                    }
                }
                if ( c != 1 ){
                    System.out.println(i +" is a prime number !");
//                        int counter = 0;
                    counter +=1;
                }
            }
        }
        else {
            System.out.println("Please Enter 1st num Greater than Second num !");
        }
        System.out.println("Total no of prime nos from " +  temp + " to " + b + " is = " + counter  );
        System.out.println("Total no of non-prime nos from " + temp + " to " + b + " is = " + (total_num-counter)  );
    }
}
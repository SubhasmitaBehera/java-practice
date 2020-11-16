package basics.examples;

import java.util.Scanner;
public class PrimeRange {
    public static void main(String[] args) {
        int a = 0, b = 0, c=0;
        System.out.println("Enter a range of numbers to find the Prime Numbers ");
        System.out.println("Enter Your range ");
        Scanner myObj = new Scanner(System.in);
        System.out.println(" Enter 1st no of your range: ");
        int first_num = myObj.nextInt();
        System.out.println(" Enter 2st no of your range: ");
        int second_num = myObj.nextInt();

        for (int i = first_num; i <= second_num; i++)
        {
            int counter = 0;
//            if (i == 1)
//
            if (i > 1)
            {
                //            continue;
                for (int j = 2; j < i; j++)
                {
                    if (i % j == 0)
                    {
                        counter = counter + 1;
                        break;
                    }
                }
                if (counter == 1) {

                }
                else
                {
                    a += 1;
                    System.out.println(i + " is a prime number");
                    if (i %2 == 0)
                        b +=1;
                    else
                        c+=1;
                }
            }
            else
                System.out.println(i + " is a special number");

        }
        System.out.println(" total no of prime nos from " +first_num + " to " +second_num + " is " + a);
        System.out.println(" total no of even prime nos  is " + b);
        System.out.println(" total no of odd prime nos  is " + c);
    }
}

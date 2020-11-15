package strings;

import java.util.Scanner;

import static java.lang.String.copyValueOf;

public class StringPractice {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String a = obj.nextLine();
//        char b = a.charAt(2);
        int d = a.length();

//        int c = a.codePointAt(3);
//        System.out.println(d);
        char arr[] = new char[d];
//        System.out.println(arr);
        for (int i = 0;i < d; i++){
            arr[d-i-1] = a.charAt(i);
        }
        String str = copyValueOf(arr);
        System.out.println(str);
        if (a.equals(str)){
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not Palindrome");

    }
}


package array;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        String s = "mam";
        
        char[] ch = s.toCharArray();
        System.out.println(ch);
        int i = 0;
        int j = ch.length - 1;

        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

            i = i + 1;
            j = j - 1;
        }

        System.out.println(String.copyValueOf(ch));
        String s1= String.copyValueOf(ch);


        if (s .equals(s1)){
            System.out.println ("This is a palindrome.");
        }
        else
            System.out.println("This is not a palindrome.");

    }
}

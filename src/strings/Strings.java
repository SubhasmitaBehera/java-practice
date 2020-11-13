package strings;

import java.util.Scanner;

import static java.lang.String.copyValueOf;

public class Strings {
    void show(String p){

    }
    public static void main(String[] args){
        int a = 2;
        int b = 2;
                System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));

        if (a==b){
            System.out.println("Hi....");
        }

        String str = new String("hi");
        String str1 = new String("hi");

        String str2 = "hii";
        String str3 = "hi";  // why this is an object ? if objects then why the memory addresses are same

        if (str==str1){
            System.out.println("hello");
        }
        if (str2==str3){
            System.out.println("hellooooooooooooo");
        }

        if (str2.equals(str3) ){
            System.out.println("Bye");
        }



        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str1));

        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));

//        String str = "Sangita Mahanta";
//        String str1 = "Sangi Mahanta";

        str = str.concat(str1);
        System.out.println(str);

        String str11 = str.replace("Sangi","Jhikichika");
        System.out.println(str11);
        Strings st = new Strings();
//        String str = "Ritu";
//        String str1 = "Rituii";
//        String str3 = "Rituii";
        String str4 = "Rituii";
//        st.show(str,str1,str3,str4);
    }
}


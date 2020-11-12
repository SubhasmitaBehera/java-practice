package wrapperclass;


import java.util.ArrayList;

public class AutoBoxing {


    // AutoBoxing
    // Java program to demonstrate Autoboxing
    public static void main(String[] args) {

        int ch = 'a';  //

//        System.out.println(c);
        Character a = (char)ch;
//        Character obj = a;
        System.out.println(a);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(25);
        System.out.println(arrayList.get(0));


    }
}


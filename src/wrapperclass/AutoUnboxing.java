package wrapperclass;

import java.util.ArrayList;

public class AutoUnboxing {
    //Unboxing
    // Java program to demonstrate Unboxing
                public static void main(String[] args)
                {
                    Character ch = 'a';
                    System.out.println(ch.getClass().getName());
                    char a = ch;
                    ArrayList<Integer> arrayList = new ArrayList<Integer>();
                    arrayList.add(24);
                    int num = arrayList.get(0);
                    System.out.println(num);
                }
}

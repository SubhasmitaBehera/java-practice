package annotations.predefined;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SuppressWarning {
//    @SuppressWarnings("unchecked")
// also can be write as @SuppressWarnings(value = "unchecked")
    public static void main( String[] arg) {
        Scanner sc = new Scanner(System.in);
        String choice ;
        List fruits = new ArrayList();
// this causes unchecked warning
        fruits.add("Apple");
        System.out.println( fruits);
//        while (true){
//            System.out.println("This is while loop...");
//            choice = sc.nextLine();
//            if (choice.equals("y")){
//                continue;
//            }
//            else
//                break;
//        }
    }
}


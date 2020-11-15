package strings;

import java.util.Scanner;

public class StringBufferAndBuilder {
//
//     void pass(String x){
//          System.out.println(x);
//          show("hi");
//     }
//
//     void show(String y){
//          System.out.println(y);
//          display("Morning");
//     }
//
//     void display(String z){
//          show("Good");
//          System.out.println(z);
//     }

    public static void main(String[] args) {
//        ob.pass("our String...");
//        String obj = new String();
//        String str = new String();
//        StringBufferAndBuilder obj = new StringBufferAndBuilder();
//        obj.pass("ritu");

//        StringBuffer s = new StringBuffer("Geeksfor");   // Uncomment this line to use
        // String Buffer Class
        StringBuilder s = new StringBuilder("Geeksfor");
        s.append("Geeks");
        System.out.println(s); // GeeksforGeeks
        s.append(1);
        System.out.println(s); // GeeksforGeeks1

//            String str = "Bablu";
//            str.concat(" Saroj");
//            System.out.println(str);

        s.insert(5, "for");
        System.out.println(s); // GeeksforforGeeks1

//            Java StringBuilder class
//            Java StringBuilder class is used to create mutable (modifiable) string.
//            The Java StringBuilder class is same as StringBuffer class except that
//            it is non-synchronized. It is available since JDK 1.5.
//            That means its execution speed is faster as it reads all the statements
//            at once .

        s.insert(0, 5);
        System.out.println(s); // 5GeeksforforGeeks1
//
        s.insert(3, true);
        System.out.println(s); // 5GetrueeksforforGeeks1
//
        s.insert(5, 41.35d);
        System.out.println(s); // 5Getr41.35ueeksforforGeeks1

        s.insert(8, 41.35f);
        System.out.println(s); // 5Getr41.41.3535ueeksforforGeeks1

        char[] geeks_arr = { 'p', 'a', 'w', 'a', 'n' };
        s.insert(2, geeks_arr);
        System.out.println(s); // 5Gpawanetr41.41.3535ueeksforforGeeks1

        s.reverse();
        System.out.println(s); // 1skeeGrofrofskeeu5353.14.14rtenawapG5
//
//
        s.delete(0,2);
        System.out.println(s); // keeGrofrofskeeu5353.14.14rtenawapG5

        s.deleteCharAt(7);
        System.out.println(s); // keeGrofofskeeu5353.14.14rtenawapG5
//
//
        s.replace(5, 8, "are");
        System.out.println(s);  // keeGr are  fskeeu5353.14.14rtenawapG5

        System.out.println(s.substring(2,6)); // keeGrarefskeeu5353.14.14rtenawapG5

        StringBuffer ss = new StringBuffer("10"); // [ cap * 2 + 2 ]
        ss.append("1&21&21&21&21&21&21&21&21&21&21&21&2M");
        System.out.println(ss);
        System.out.println(ss.length());
        System.out.println(ss.capacity());
//
//          String a = "Kathani";
//          String b = new String("Kathani");
//
//          System.out.println(System.identityHashCode(a));
//          System.out.println(System.identityHashCode(b));
////          System.out.println(IdentityHashCode());
//
//          if (a.equals(b)){
//               System.out.println("Correct");
//          }
//
//          if (a==b){
//               System.out.println("Correct");
//          }
//
//          String str = "Bibhu";
//          str.concat("Dash");
//          str = "Bibhuuuuu";
//          System.out.println(str); //BibhuKukura //
    }

}


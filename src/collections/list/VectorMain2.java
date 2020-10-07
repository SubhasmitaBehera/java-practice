package collections.list;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorMain2 {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();
        Vector<Integer> vector1 = new Vector<>();

        vector.add(11);
        vector.add(122);
        vector.add(133);
        vector.add(14);
        vector.add(16);
        vector.add(111);

        System.out.println(vector.subList(2,4));  // last index is exclusive
        Collections.sort(vector);
        System.out.println(vector);

        vector1.add(111);
        vector1.add(111);
        vector1.add(111);
        vector1.add(111);
        vector.remove("11");
        vector.remove(1);
        vector.removeAllElements();
        vector.set(2,12);

        vector.add(2,15);
        vector.indexOf(11);

        Object obj = vector.clone();
        System.out.println(obj); // [ 11 12 13]
        Collections.copy(vector,vector1);
        System.out.println(vector); // [111,111,111,111]

        System.out.println(vector.removeAll(vector1));  // true
        System.out.println(vector);

        System.out.println(vector.size());
        System.out.println(vector.capacity());

        System.out.println(vector);


        for (int i = 0; i < vector.size(); i++){
            System.out.println(vector.get(i));
        }

        System.out.println("---------------------------------------------");
        for (int num : vector)
            System.out.println(num);


        System.out.println("---------------------------------------------");

        Iterator itr = vector.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("---------------------------------------------");

        Enumeration en = vector.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}

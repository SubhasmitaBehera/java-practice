package collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetMain {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>() ;
        //Maintains insertion order

        linkedHashSet.add("Bablu");
        linkedHashSet.add("Bibhu");
        linkedHashSet.add("Miki");
        linkedHashSet.add("Ritu");
        linkedHashSet.add("Summu");
        linkedHashSet.add(null);


        System.out.println(linkedHashSet);

        linkedHashSet.remove("Bablu");

        Iterator itr = linkedHashSet.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}

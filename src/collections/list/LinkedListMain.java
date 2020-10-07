package collections.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> lt = new LinkedList<>(); // any type can be added to this list
        LinkedList<String> lt1 = new LinkedList<>();
        LinkedList<String> lt2 = new LinkedList<>();
        lt1.add("kathani");
        lt1.add("Bibhu");
        lt.add(12);
        lt.add(13);
        lt.add(14);
        lt.addFirst(10);
        lt.addLast(15);

        lt.add(1, 111);
        Collections.sort(lt);
        System.out.println(lt);

//        to remove
        lt.remove(1);
        lt.removeFirst();
        lt.removeLast();
        System.out.println(lt);
        lt1.remove("kathani");
        lt.set(1, 22);
        System.out.println(lt.get(1));

        Object res = lt.get(0);
        System.out.println(res);

        System.out.println(lt.poll()); // same work
        System.out.println(lt.remove()); //

        for (Object nums : lt)
            System.out.println(nums);

        System.out.println(lt);

//        LinkedList<Integer> anotherlt = lt;
        Object anotherlt = lt.clone(); // clone to be checked
        System.out.println(anotherlt);   // clone() is present inside the class Object

        lt2.add("Q1");
        lt2.add("Q2");
        lt2.add("Q3");
        lt2.add("Q4");
        System.out.println(lt1.addAll(lt2)); // to be checked


        for (String str : lt1) {
            System.out.println(str);
        }
        System.out.println("___________________________________________");

        Iterator<String> itr = lt2.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}


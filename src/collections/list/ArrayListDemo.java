package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListDemo {

    //List :- Array List, Linked List, Stack, Vector

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();

        //____________Taking User Input In Array List____________

        int choice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ArrayList:~ ");
        do {
            System.out.println("Enter List: ");
            list1.add(sc.next());
        }
        while (false);

        while (true) {
            System.out.println("Enter 1 to add more and 2 to exit from adding...");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter List: ");
                list1.add(sc.next());
            } else if (choice == 2) {
                break;
            } else
                System.out.println("Invalid Choice...");
        }
        System.out.println(list1);
        System.out.println("---------------------------------------------");

        //____________Performing Operation On Arraylist_______________
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);

        list1.add("Bibhu");
        list1.add("Ritu");
        list1.add("Miki");
        list1.add("Sumi");


        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("______________________________________________");
        System.out.println(list1); // print in the form of Array
        System.out.println(list); // print in the form of Array
        System.out.println("_________________________________________");
        for (String str : list1) { //for each
            System.out.println(str);
        }
        System.out.println("_________________________________________");

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        list1.add(0, "Bablu");
        System.out.println(list1);
        System.out.println(list1.size());

        System.out.println(list1.get(1));

        list1.set(2, "Kathanee");
        System.out.println(list1);

        list1.remove(1);
        System.out.println(list1);

        System.out.println("----------------------------------------");


        Collections.sort(list1);
        System.out.println(list1);

        Collections.sort(list);
        System.out.println(list);

        int ind = list.indexOf(122);      // returns the index number of  the list object
        int indx = list.indexOf(1123);    // returns -1 if the object not present

        System.out.println(ind);
        System.out.println(indx);

        System.out.println(list.contains(122));
        System.out.println(list.contains(1223));

        list.clear();
        System.out.println(list);
        for (int str : list) {
            System.out.println(str);
        }

        Iterator ilt1 = list1.iterator();
        while (ilt1.hasNext()) {
            System.out.println(ilt1.next());
        }
    }

}



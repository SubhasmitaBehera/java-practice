//package collections.set.sortedSet;
//
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.TreeSet;
//
//public class TreeSetMain {
//    public static void main(String[] args) {
//        TreeSet<String> treeSet = new TreeSet<>();
//        HashSet<String> hashSet = new HashSet<>();
//        HashSet<Integer> hashSet1 = new HashSet<>();
//
//        treeSet.add("A");
//        treeSet.add("B");
//        treeSet.add("C");
//        treeSet.add("D");
//        treeSet.add("E");
//
//        hashSet.add("Amulya");
//        hashSet.add("Bibhu");
//        hashSet.add("C");
//        hashSet.add("D");
//        hashSet.add("E");
//
//        hashSet1.add(11);
//        hashSet1.add(12);
//        hashSet1.add(13);
//        hashSet1.add(14);
//
//        System.out.println(treeSet.ceiling("A"));  //A
//        System.out.println(treeSet.floor("A"));  //A
//        System.out.println(treeSet.higher("A"));  //B
//        System.out.println(treeSet.lower("A"));  //null
//        System.out.println(treeSet.pollFirst());  //A
//        System.out.println(treeSet.pollLast());   //E
//        System.out.println(treeSet.headSet("B"));  //[]
//        System.out.println(treeSet.tailSet("B"));  //B,C,D
//        System.out.println(treeSet.first());  //B
//        System.out.println(treeSet.last());   //D
//        System.out.println(treeSet.addAll(hashSet));   //true  (boolean type)
////        System.out.println(treeSet.addAll(hashSet1));   //cannt be add integer and string type
//
//        Iterator itr = treeSet.iterator();
//        while (itr.hasNext())
//            System.out.println(itr.next());  //A B C D E
//
//    }
//}

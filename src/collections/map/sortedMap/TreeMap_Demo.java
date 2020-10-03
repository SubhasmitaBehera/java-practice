//package collections.map.sortedMap;
//
//import java.util.TreeMap;
//
//public class TreeMap_Demo {
//    public static void main(String[] args) {
//        TreeMap<Integer , String> treeMap =new TreeMap<>();
//
//        treeMap.put(1,"sumi");
//        treeMap.put(3,"ritu");
//        treeMap.put(8,"miki");
//        treeMap.put(5,"bibhu");
//        treeMap.put(2,"bablu");
//
//        System.out.println(treeMap.firstEntry());   //least key and it's value
//        System.out.println(treeMap.lastEntry());   //greatest key and it's value
//        System.out.println(treeMap.higherEntry(5));   //strictly greater than key of given key and that's value.
//        System.out.println(treeMap.ceilingEntry(4));   //equal to the key of the given key and that's value , if the given key is not available then greater key and value of the given key.
//        System.out.println(treeMap.ceilingKey(4));   //equal to the key of the given key , if that key is not available then the greater key of the given key. It'll only print the key not value.
//        System.out.println(treeMap.firstKey());   //least key
//        System.out.println(treeMap.lastKey());    //greatest key
//        System.out.println(treeMap.get(1));    // value of the given key
//        System.out.println(treeMap);    //the total treeMap entry set
//        System.out.println(treeMap.entrySet());  //the total treeMap entry set
//
//    }
//}

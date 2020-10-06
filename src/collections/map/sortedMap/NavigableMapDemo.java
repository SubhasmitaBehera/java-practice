package collections.map.sortedMap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
//        TreeMap<Integer, String> treeMap = new TreeMap<>();

        navigableMap.put(2,"Bablu");
        navigableMap.put(3,"Ritu");
        navigableMap.put(8,"Miki");
        navigableMap.put(5,"Summu");
        navigableMap.put(4,"Bibhu");

        System.out.println(navigableMap.descendingMap());
        System.out.println(navigableMap.headMap(3));  //will show up-to the given key
        System.out.println(navigableMap.tailMap(3));  //will show that key as well as the key later on
        System.out.println(navigableMap.subMap(3,8));
    }
}

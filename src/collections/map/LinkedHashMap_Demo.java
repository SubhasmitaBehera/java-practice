package collections.map;

import java.util.LinkedHashMap;

public class LinkedHashMap_Demo {
    public static void main(String[] args) {
        LinkedHashMap<Integer ,String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(1,"Name1");
        linkedHashMap.put(2,"Name2");
        linkedHashMap.put(3,"Name3");
        linkedHashMap.put(4,"Name4");
        linkedHashMap.put(5,"Name5");
        linkedHashMap.put(6,"Name6");

        System.out.println(linkedHashMap);

        linkedHashMap.remove(3);

        System.out.println(linkedHashMap);
    }
}

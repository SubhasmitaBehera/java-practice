//package collections.map;
//
//import java.util.*;
//
//public class HashTableDemo {
//    public static void main(String[] args) {
//        // Synchronised
//        // Values stored in the basis of the hashCode
//        Hashtable<Integer,String> hashtable = new Hashtable<>();
//
//
//        hashtable.put(2,"bablu");
//        hashtable.put(3,"Ritu");
//        hashtable.put(8,"Miki");
//        hashtable.put(5,"Summu");
//        hashtable.put(4,"Bibhu");
////        hashtable.put(null,"Amu"); // Key and Value can't be null , it will throw runTime Exception
//
//        System.out.println(hashtable.get(2));
//
//        System.out.println(hashtable.getOrDefault(2,"Key is Found"));
//        System.out.println(hashtable.getOrDefault(1,"Key is not Found"));
//
//        System.out.println(hashtable.hashCode());
//        String name = hashtable.toString();
//        System.out.println(name);
//
//        System.out.println(hashtable.keySet().toString());
//
//        String c = hashtable.keySet().toString();
////        Integer d = hashtable.keySet().toString();
//
//        System.out.println(hashtable.keySet());
//
//        Set<Integer> a = hashtable.keySet();
////        Set<String> b = hashtable.keySet();
//
//        System.out.println(hashtable.values());
//
//        System.out.println(hashtable); // OutPut will be in reverse order
//
//        for (Map.Entry o : hashtable.entrySet())
//            System.out.println(" Key = "+o.getKey()+" and value is "+o.getValue());
//
//
//        Enumeration<Integer> e = Collections.enumeration(hashtable.keySet());
//        while(e.hasMoreElements())
//        {      Integer key=e.nextElement();
//            String value = hashtable.get( key );
//            System.out.println("key: " + key + ", value: " + value);
//        }
//    }
//}

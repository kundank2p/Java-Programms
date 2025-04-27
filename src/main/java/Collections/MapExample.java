package Collections;

//      The Map interface in Java represents a collection of key-value pairs, where each key is unique, and each key maps to exactly one value.
//      Unlike List or Set, a Map is not a subtype of the Collection interface, but it's an equally essential part of the Java Collections Framework .
//      In a Map, each key must be unique. However, values can be duplicated — multiple keys can point to the same value.
//      If you try to insert a new value using an existing key, the old value gets replaced with the new one,keeping the key unique in the map.
//      Some of the most commonly used implementations of the Map interface include HashMap, LinkedHashMap,and TreeMap.

//      HashMap is the most commonly used implementation of the Map interface.
//      It allows storing key-value pairs with no guaranteed order of keys — the elements may appear in a different sequence each time you access them.
//      HashMap offers fast performance for basic operations like insertion, deletion, and lookup.

//      LinkedHashMap is a subclass of HashMap that maintains the insertion order of entries — meaning keys are returned the order they were added.
//      This makes it useful when the order of elements matters.
//      However, due to the extra overhead of maintaining this order, it is slightly slower than a regularHashMap in terms of performance.

//      TreeMap is a sorted map implementation that stores its keys in natural order (like alphabetical for strings or ascending for numbers), or according to a custom comparator.
//      It’s ideal when you need the data to be automatically sorted by key.
//      The benefit is having a consistently ordered map without additional sorting logic.


import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, String> capitalMap = new HashMap<>();

        capitalMap.put("India", "Delhi");
        capitalMap.put("USA", "New York");
        capitalMap.put("Russia", "Moscow");
        capitalMap.put("Germany", "");
        capitalMap.put("England", "London");
        System.out.println(capitalMap);
        capitalMap.remove("Germany");
        capitalMap.put("USA", "Washington DC");
        System.out.println(capitalMap);
        System.out.println(capitalMap.containsKey("England"));
        System.out.println(capitalMap.containsValue("Moscow"));

        System.out.println("All Keys : " + capitalMap.keySet());
        System.out.println("All values : " + capitalMap.values());

        capitalMap.putIfAbsent("Greenland", "Iceland");
        capitalMap.replace("Delhi", "New Delhi");


        for (Map.Entry<String, String> entry : capitalMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        capitalMap.forEach((key, value) -> System.out.println(key + ":" + value));//Lambdas Function

        System.out.println(capitalMap.size());
        capitalMap.clear();
        System.out.println(capitalMap.isEmpty());
    }
}

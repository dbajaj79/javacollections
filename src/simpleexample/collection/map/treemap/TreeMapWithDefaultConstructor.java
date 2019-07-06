package simpleexample.collection.map.treemap;

import java.util.TreeMap;

/*
 * Characteristics of TreeMap
 * 1 version 1.2
 * 2 null value not allowed
 * 3 duplicate values key is unique,Value maybe duplicate
 * 4 insertion order is preserved or not not
 * 5 Synchronized not Synchronized
 * 6 Underlying Data Structure red-black tree
 * 7 Heterogeneous not supported
 *
 * Default Constructor Support Default Sorting Order means Ascending Order
 * Condition for Sort in Collection
 * Data must be homogeneous
 * Implement comparable Interface
 * Default Class which implement comparable interface are String and All Wrapper Classes
 * */
public class TreeMapWithDefaultConstructor {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(50, "A");
        treeMap.put(10, "B");
        treeMap.put(310, "C");
        treeMap.put(4, "D");
        treeMap.put(90, "E");
        System.out.println(treeMap);
        TreeMap<String, Integer> treeMap1 = new TreeMap<>();
        treeMap1.put("Z", 1);
        treeMap1.put("K", 2);
        treeMap1.put("P", 3);
        treeMap1.put("X", 9);
        treeMap1.put("R", 4);
        System.out.println(treeMap1);
    }
}

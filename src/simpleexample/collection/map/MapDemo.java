package simpleexample.collection.map;

import java.util.HashMap;
import java.util.Map;

/*
* Map can store two objects at time
* Map Store Two objects as KEY and Value Pair
* Key are unique in Map
* Value can be duplicate
* Important Methods of Map interface
* values()-Collection to get All Values of Map
* keySet() - Set to get All Keys of Map
* entrySet() - Set get All key value Pair
* Implementation class of Map interface are following :-
* HashMap
* LinkedHashMap 1.4
* TreeMap 1.2
*
* Interfaces of Map interface
* SortedMap
* NavigableMap(Child of Sorted Map)
*
* */
public class MapDemo {


    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5,"E");
        map.put(6,"F");
        map.put(7,"F");

        System.out.println(map);
        System.out.println("All Keys of Map"+map.keySet());
        System.out.println("All Values of Map"+map.values());
        System.out.println("All Entries of Map"+map.entrySet());
    }

}

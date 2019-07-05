package simpleexample.collection.map.hashMap;

import simpleexample.model.Empolyee;

import java.util.*;

/*Characteristics of Hash Map
* 1. Version 1.2
* 2. Heterogeneous
* 3. null allowed
* 4. Insertion order not preserved
* 5. non Synchronized
* 6. Underlying Data Structure HashTable
* 7. Keys are unique values may be duplicate
* */
public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer, Empolyee>hashMap = new HashMap<>();
        hashMap.put(1,new Empolyee(1,"A"));
        hashMap.put(2,new Empolyee(2,"B"));
        hashMap.put(3,new Empolyee(3,"C"));
        hashMap.put(3,new Empolyee(6,"E"));

        System.out.println(hashMap);
        Set<Integer> keys = hashMap.keySet();
        for(Integer i:keys)
        {
            System.out.println(i);
        }
        Collection<Empolyee> empolyees = hashMap.values();
        for(Empolyee e:empolyees)
        {
            System.out.println(e.toString());
        }
        Set<Map.Entry<Integer,Empolyee>> entries = hashMap.entrySet();
        for(Map.Entry<Integer,Empolyee>entry:entries)
        {
            System.out.println("Key="+entry.getKey()+" "+"Value="+entry.getValue());
        }
    }




}

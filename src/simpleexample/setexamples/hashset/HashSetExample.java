package simpleexample.setexamples.hashset;

import simpleexample.model.Empolyee;

import java.util.HashSet;

/*
 * HashSet
 * Characteristics of HashSet
 * v1.2
 * Heterogeneous data allowed
 * null allowed
 * duplicate not allowed
 * insertion order not persevered
 * non synchronized
 * underlying data structure HashTable
 * Cursor Iterable
 * */
public class HashSetExample {

    public static void main(String[] args) {
        HashSet<Empolyee>empolyees  = new HashSet<>();
        empolyees.add(new Empolyee(50,"Hello"));
        empolyees.add(new Empolyee(23,"A"));
        empolyees.add(new Empolyee(26,"B"));
        empolyees.add(new Empolyee(8,"C"));
        empolyees.add(new Empolyee(9,"D"));
        System.out.println(empolyees);
    }
}

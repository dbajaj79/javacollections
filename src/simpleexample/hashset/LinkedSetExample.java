package simpleexample.hashset;

import simpleexample.model.Empolyee;

import java.util.LinkedList;
/*
 * HashSet
 * Characteristics of HashSet
 * v1.2
 * Heterogeneous data allowed
 * null allowed
 * duplicate not allowed
 * insertion order is persevered
 * non synchronized
 * underlying data structure HashTable
 * Cursor Iterable
 * */
public class LinkedSetExample {
    public static void main(String[] args) {
        LinkedList<Empolyee> empolyeeLinkedList = new LinkedList<>();
        empolyeeLinkedList.add(new Empolyee(20,"Z"));
        empolyeeLinkedList.add(new Empolyee(2,"A"));
        empolyeeLinkedList.add(new Empolyee(9,"C"));
        empolyeeLinkedList.add(new Empolyee(90,"D"));
        empolyeeLinkedList.add(new Empolyee(87,"E"));
        empolyeeLinkedList.add(new Empolyee(6,"F"));
        empolyeeLinkedList.add(new Empolyee(7,"K"));
        System.out.println(empolyeeLinkedList);

    }
}

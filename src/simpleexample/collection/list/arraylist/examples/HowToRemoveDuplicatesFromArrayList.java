package simpleexample.collection.list.arraylist.examples;

import java.util.ArrayList;
import java.util.HashSet;
/*
* ArrayList can store duplicate values so First Create a ArrayList With Duplicate values
* HashSet can't store duplicate values so will create a HashSet from Constructor where will Pass above created
* ArrayList as Constructor parameter
* After that Re-Initialize the array with Constructor where we can pass above created HashSet as Parameter
* Print the ArrayList using System.out.println
* Please Check the Below Example
*
*
* */

public class HowToRemoveDuplicatesFromArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("A");
        names.add("B");
        names.add("C");
        names.add("A");
        names.add("B");
        names.add("C");
        names.add("A");
        names.add("B");
        names.add("C");

        System.out.println("Actual ArrayList:"+names);
        HashSet<String>hashSet = new HashSet<>(names);
        names = new ArrayList<>(hashSet);
        System.out.println("ArrayList without Duplicates:"+names);

    }
}

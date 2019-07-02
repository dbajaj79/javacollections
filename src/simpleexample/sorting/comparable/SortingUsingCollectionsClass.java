package simpleexample.sorting.comparable;

import java.util.ArrayList;
import java.util.Collections;

/*
* Conditions for Sorting
* All Elements should be Homogeneous
* Element implement Comparable Interface
* String and All Wrapper Classes by default implement comparable interface
* Collections.sort() return 1 method internally use compareTo() method to compare objects with following rules
* return positive value need to change
* return negative value no need to change
* return 0 value no need to Change
*
* Different Cases
* Sorting All Elements of Wrapper Classes and String Class
* if try to Sort like "name",null then will give null pointer exception
* if try to sort like "a", 10 class not find exception
* */
public class SortingUsingCollectionsClass {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("B");
        names.add("Z");
        names.add("K");
        names.add("P");
        names.add("J");
        names.add("K");
        names.add("A");
        System.out.println("Names values without Sorting");
        System.out.println(names);
        Collections.sort(names);
        System.out.println("Names values after Sorting");
        System.out.println(names);

        //Case Class not Find Exception
        /*Error
        * java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer
        *  (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
        *
        ArrayList arrayList = new ArrayList();
        arrayList.add("Hello");
        arrayList.add(10);
        Collections.sort(arrayList);
        */
        //Case Class not find Null Pointer Exception
        /*
        *
        *Exception in thread "main" java.lang.NullPointerException
        *
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("A");
        arrayList1.add(null);
        Collections.sort(arrayList1);*/


    }

}

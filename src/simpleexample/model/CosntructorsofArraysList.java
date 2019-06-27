package simpleexample.model;

import java.util.ArrayList;

/*
 * Three Constructors of ArrayList
 * Default Constructor ArrayList() with default initial capacity 10
 * constructor with initial capacity ArrayList(16)
 * constructor with Collection<T> parameter of add passed collection in new created arraylist
 * ArrayList(Collection<T> list)
 * Check Following Example
 *
 * */
public class CosntructorsofArraysList {

    public static void main(String[] args) {

        System.out.println("ArrayList with Default Constructor");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Kuldeep");
        arrayList.add("Hardeep");
        arrayList.add("Sandeep");
        System.out.println(arrayList);
        System.out.println("Constructor with custom initial Capacity:");
        ArrayList<String> arrayList1 = new ArrayList<>(5);
        arrayList1.add("Second");
        arrayList1.add("Third");
        arrayList1.add("Fourth");
        arrayList1.add("Fifth");
        System.out.println(arrayList1);
        System.out.println("Constructor with Another ArraList as Parameter");
        ArrayList<String> arrayList2 = new ArrayList<>(arrayList1);
        arrayList2.add("Six");
        arrayList2.add("Seven");
        arrayList2.add("Eight");
        arrayList2.add("Nine");
        arrayList2.add("Ten");
        System.out.println(arrayList2);
    }


}

package simpleexample.arraylist.methodsexample;

import java.util.ArrayList;

public class AddAndRemoveCollectionData {
    /*
     * Add And Remove Collections Data
     * addAll vs removeAll
     *
     *
     * */

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Deepak");
        arrayList.add("Kuldeep");
        arrayList.add("Sandeep");
        arrayList.add("Navdeep");
        arrayList.add("Hello");
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("A");
        arrayList1.add("B");
        arrayList1.add("C");
        arrayList1.add("D");
        arrayList1.add("E");
        arrayList1.addAll(arrayList);
        System.out.println("All Elements of arrayList1 = " + arrayList1);
        arrayList1.removeAll(arrayList);
        System.out.println("All Elements of arrayList1 After Removal = " + arrayList1);

    }
}
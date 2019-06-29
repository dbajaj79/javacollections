package simpleexample.arraylist.methodsexample;

import java.util.ArrayList;

public class RemoveAllAndRetainAll {

    public static void main(String[] args) {
        ArrayList<String>names = new ArrayList<>();
        names.add("Deepak");
        names.add("Kuldeep");
        names.add("Pardeep");
        names.add("Hardeep");
        names.add("Sandeep");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add("F");
        ArrayList<String> arrayList1 = new ArrayList<>(arrayList);
        arrayList1.add("Good");
        arrayList1.add("K");
        arrayList1.addAll(names);
        System.out.println("arrayList1 = " + arrayList1);
        arrayList1.removeAll(names);
        System.out.println("arrayList After Remove Names From  = " + arrayList1);
        arrayList1.retainAll(arrayList);
        System.out.println("arrayList After Retain All="+arrayList1);

    }
}

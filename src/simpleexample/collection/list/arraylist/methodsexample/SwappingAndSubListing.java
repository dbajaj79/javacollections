package simpleexample.collection.list.arraylist.methodsexample;

import java.util.ArrayList;
import java.util.Collections;

public class SwappingAndSubListing {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Deepak");
        arrayList.add("Kuldeep");
        arrayList.add("Sandeep");
        arrayList.add("Pardeep");
        arrayList.add("Sunny");
        arrayList.add("Navdeep");
        System.out.println("ArrayList="+arrayList);
        Collections.swap(arrayList,1,4);
        System.out.println("ArrayList After Swapping="+arrayList);
        ArrayList arrayList1 = new ArrayList(arrayList.subList(2,4));
        System.out.println("ArrayList After SubList from ArrayList="+arrayList1);

    }
}

package simpleexample.arraylist.methodsexample;
import java.util.ArrayList;
/*
* ContainsAll and Contains
* ContainsAll is used to check CollectionData Available in Collections
* contains is used to check single item Available in collection data or not
* */
public class ContainAndContainsAll {

    public static void main(String[]args)
    {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Deepak");
        arrayList.add("Kuldeep");
        arrayList.add("Hardeep");
        arrayList.add("Sandeep");
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("Hello");
        arrayList1.add("Kuldeep");
        arrayList1.add("Hardeep");
        arrayList1.add(arrayList);

        System.out.println(arrayList.containsAll(arrayList));
        System.out.println(arrayList.contains("Deepak"));

    }
}

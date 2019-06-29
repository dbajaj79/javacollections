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
        arrayList.add(10);
        arrayList.add('A');
        arrayList.add('K');
        arrayList.add("Sandeep");
        arrayList.add(true);
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("Hello");
        arrayList1.add("Navdeep");
        arrayList1.add("Sir");
        arrayList1.addAll(arrayList);

        System.out.println(arrayList1);
        System.out.println(arrayList1.containsAll(arrayList));
        System.out.println(arrayList.contains("Sandeep"));
        arrayList.remove("Sandeep");
        System.out.println(arrayList1.contains(arrayList));


    }
}

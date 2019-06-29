package simpleexample.arraylist.methodsexample;

import java.util.ArrayList;
import java.util.Arrays;

public class ConversionFromArrayToCollection {
    /*
     * Conversion between Array to Collection and Collection to Array
     * Array to Collection Arrays.asList()
     * Array to Collection for Generic collection arrayList.toArray[T[])
     * Array to Collection for Normal Version arrayList.toArray()
     *
     *
     * */
    public static void main(String[] args) {
        //Generic Version of Collection
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Deepak");
        arrayList.add("Kumar");
        arrayList.add("Hello");
        arrayList.add("Sandeep");
        System.out.println("Collection Before Array Conversion=" + arrayList);
        String[] names = new String[arrayList.size()];
        arrayList.toArray(names);
        System.out.println("Array After Conversion From Collection");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        //Collection Normal Version
        ArrayList arrayList1 = new ArrayList<>();
        arrayList1.add("Deepak");
        arrayList1.add('a');
        arrayList1.add(1);
        arrayList1.add(10.9f);
        arrayList1.add(10.90);
        arrayList1.add(true);


        System.out.println("Normal Colection without Conversion"+arrayList1);
        Object[] object = arrayList1.toArray();

        System.out.println("Array After Conversion From Normal Collection");
        for (int i = 0; i < object.length; i++) {
            System.out.println(object[i]);
        }

        ///Array to Collection Conversion
        String[] names1 = new String[]{"Deepak","Kuldeep","Sandeep","Pardeep"};
        ArrayList<String> namesCollection = new ArrayList(Arrays.asList(names1));
        System.out.println(namesCollection);


    }
}

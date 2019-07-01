package simpleexample.arraylist.cursors.examplesoflistiterator;

import java.util.ArrayList;
import java.util.ListIterator;

/*
 * ListIterator
 * 1. version 1.2
 * 2. list classes
 * 3. not universal customer
 * 4. listIterator
 * 5. 9 Methods
 * 6. bi Directional
 * 7. all operations
 * 8. interface
 * 9.normal and generic
 * Importent Points
 * hasPrevious is Worked only if Cursor move to last index
 * else if will not Work
 *
 * */
public class ListIteratorCursor {
    public static void main(String[] args) {
        //Normal Version
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            String value = (String) listIterator.next();
            System.out.println(value);
        }
        //Previous Operation
        while (listIterator.hasPrevious()) {
            String value = (String) listIterator.previous();
            System.out.println(value);
        }

        //Generic Version
        ArrayList arrayList1 = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        ListIterator<String> listIterator1 = arrayList1.listIterator();
        while (listIterator1.hasNext()) {
            String value = listIterator1.next();
            System.out.println(value);
        }
        //Previous Operation
        while (listIterator1.hasPrevious()) {
            String value = listIterator1.previous();
            System.out.println(value);
        }


    }
}

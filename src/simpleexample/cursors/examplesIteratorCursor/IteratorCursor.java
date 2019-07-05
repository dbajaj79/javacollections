package simpleexample.cursors.examplesIteratorCursor;
/*
 * Iterator Cursor
 * 1.version 1.2
 * 2.all classes
 * 3.universal cursor
 * 4.read and remove
 * 5.one directional
 * 6. iterator
 * 7. hasnext next and remove
 * 8. interface
 * 9. normal and Generic Version
 *
 * */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class IteratorCursor {

    public static void main(String[] args) {
        //Normal versions of Collection
        ArrayList arrayList = new ArrayList();
        arrayList.add("Deepak");
        arrayList.add("Sandeep");
        arrayList.add("C");
        arrayList.add("Rinku");
        arrayList.add("Chicku");
        arrayList.add("Pinku");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String value = (String) iterator.next();
            System.out.println(value);
        }

        //Generic Version of Collection

        Vector<String> strings = new Vector<>();
        strings.add("Mango");
        strings.add("Orange");
        strings.add("Banana");
        strings.add("Plum");
        strings.add("Peach");
        strings.add("Lichi");
        Iterator<String> iterator1 = strings.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

    }
}

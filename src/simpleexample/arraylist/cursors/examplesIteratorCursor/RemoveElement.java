package simpleexample.arraylist.cursors.examplesIteratorCursor;

import java.util.Iterator;
import java.util.Vector;

public class RemoveElement {

    public static void main(String[] args) {
        Vector<String> strings = new Vector<>();
        strings.add("A");
        strings.add("B");
        strings.addElement("C");

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("B")) {
                iterator.remove();
            }
        }
        System.out.println(strings);

    }
}

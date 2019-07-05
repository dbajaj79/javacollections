package simpleexample.cursors;

import java.util.*;

public class GetAllElementUsingThreeCursors {
    public static void main(String[] args) {
        //Normal Collection version
        Vector names = new Vector();
        names.add("A");
        names.add("B");
        names.add("C");
        names.add("D");
        names.add("E");
        names.add("F");
        Enumeration enumeration = names.elements();
        while (enumeration.hasMoreElements())
        {
            String s=(String)enumeration.nextElement();
            System.out.println(s);
        }
        Iterator iterator = names.iterator();
        while (iterator.hasNext())
        {
            String s = (String)iterator.next();
            System.out.println(s);
        }
        ListIterator listIterator = names.listIterator();
        while (listIterator.hasNext())
        {
            String s = (String)listIterator.next();
            System.out.println(s);
        }
        //Generic  Collection version
        Vector<String> names1 = new Vector();
        names1.add("A");
        names1.add("B");
        names1.add("C");
        names1.add("D");
        names1.add("E");
        names1.add("F");
        Enumeration<String> enumeration1 = names.elements();
        while (enumeration1.hasMoreElements())
        {
            String s=enumeration1.nextElement();
            System.out.println(s);
        }
        Iterator<String> iterator1 = names.iterator();
        while (iterator1.hasNext())
        {
            String s = iterator1.next();
            System.out.println(s);
        }
        ListIterator<String> listIterator1 = names.listIterator();
        while (listIterator1.hasNext())
        {
            String s = listIterator1.next();
            System.out.println(s);
        }

    }
}

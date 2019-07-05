package simpleexample.cursors;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

/*
 * Enumeration Cursors
 * 1 Introduced in 1.0
 * 2 Legacy Class
 * 3 not universal cursor
 * 4 read only
 * 5 elements
 * 6 hasMoreElements,nexElement
 * 7 interface
 * 8 one directional
 * 9 Normal and Generic Version
 * */
public class EnumerationCursor {
    //Normal Version of Collection

    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.addElement("Deepak");
        vector.addElement("Kuldeep");
        vector.add("Nav");
        vector.add("Pardeep");
        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            String value = (String) enumeration.nextElement();
            System.out.println(value);

        }

        //Generic Version of Collections
        Stack<String> stringStack = new Stack<>();
        stringStack.add("A");
        stringStack.add("B");
        stringStack.add("C");
        stringStack.add("D");
        stringStack.add("E");
        stringStack.add("F");

        Enumeration enumeration1 = stringStack.elements();
        while (enumeration1.hasMoreElements()) {
            System.out.println("enumeration1.nextElement() = " + enumeration1.nextElement());
        }

    }

}

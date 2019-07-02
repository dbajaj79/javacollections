package simpleexample.setexamples.hashset;

import simpleexample.model.Color;

import java.util.HashSet;
import java.util.Iterator;

public class PrintHashSetElementsUsinIterator {
    public static void main(String[] args) {
        HashSet<Color>colors = new HashSet<Color>();
        colors.add(new Color(1,"RED"));
        colors.add(new Color(5,"Pink"));
        colors.add(new Color(0,"Purple"));
        colors.add(new Color(90,"Orange"));
        Iterator<Color>iterator = colors.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}

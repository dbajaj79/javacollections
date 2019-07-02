package simpleexample.sorting.comparaotor.customcomparator;

import simpleexample.model.Color;

import java.util.Comparator;

public class ColorNameComparator implements Comparator<Color> {


    @Override
    public int compare(Color o1, Color o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

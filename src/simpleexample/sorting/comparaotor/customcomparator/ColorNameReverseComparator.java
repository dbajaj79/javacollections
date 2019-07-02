package simpleexample.sorting.comparaotor.customcomparator;

import simpleexample.model.Color;

import java.util.Comparator;

public class ColorNameReverseComparator implements Comparator<Color> {

    @Override
    public int compare(Color o1, Color o2) {
        return o2.getName().compareTo(o1.getName());
    }
}

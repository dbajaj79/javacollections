package simpleexample.sorting.comparaotor;

import simpleexample.model.Color;
import simpleexample.sorting.comparaotor.customcomparator.ColoarIdReverseComparator;
import simpleexample.sorting.comparaotor.customcomparator.ColorIdCompartor;
import simpleexample.sorting.comparaotor.customcomparator.ColorNameComparator;
import simpleexample.sorting.comparaotor.customcomparator.ColorNameReverseComparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExample {

    public static void main(String[] args) {
        ArrayList<Color> colors = new ArrayList<>();
        colors.add(new Color(1, "Yellow"));
        colors.add(new Color(25, "Red"));
        colors.add(new Color(20, "Green"));
        colors.add(new Color(2, "Purple"));
        colors.add(new Color(5, "Alfa"));
        colors.add(new Color(0, "Aqua"));
        System.out.println("Colors Without Sorting" + colors);
        Collections.sort(colors, new ColorIdCompartor());
        System.out.println("colors Sorting based on Id" + colors);
        Collections.sort(colors, new ColorNameComparator());
        System.out.println("Colors Sorting based on Name:" + colors);
        Collections.sort(colors, new ColoarIdReverseComparator());
        System.out.println("Colors Sorting Based on Id in Reverse Order:" + colors);
        Collections.sort(colors, new ColorNameReverseComparator());
        System.out.println("Colors Sorting Based on Name in Reverse Order:" + colors);


    }
}

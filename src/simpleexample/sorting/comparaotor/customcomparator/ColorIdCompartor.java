package simpleexample.sorting.comparaotor.customcomparator;

import simpleexample.model.Color;

import java.util.Comparator;

public class ColorIdCompartor implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Color color =(Color)o1;
        Color color1 = (Color)o2;
        if(color.getId()==color1.getId())
        {
         return 0;

        }
        else if(color.getId()>color1.getId())
        {
            return 1;
        }
        else
        return -1;
    }
}

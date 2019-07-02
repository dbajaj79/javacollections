package simpleexample.sorting.comparaotor.customcomparator;

import simpleexample.model.Color;

import java.util.Comparator;

public class ColoarIdReverseComparator implements Comparator<Color> {

    @Override
    public int compare(Color o1, Color o2) {
        if(o1.getId()==o2.getId())
        {
            return 0;
        }
        else if(o1.getId()<o2.getId())
        {
            return 1;
        }
        else
        {
            return -1;
        }

    }
}

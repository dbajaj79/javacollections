package simpleexample.setexamples.treeset;

import java.util.Comparator;

public class IntegerCompartorOption2 implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}

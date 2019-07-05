package simpleexample.collection.set.setexamples.treeset;

import java.util.Comparator;
/*
 * Reversing String Elements of TreeSet
 * First Option: prefix - in front of return result of compareTo method in compare
 * Second Option  check o2.compareTo(o1)
 * */

public class StringCompartorOption2 implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}

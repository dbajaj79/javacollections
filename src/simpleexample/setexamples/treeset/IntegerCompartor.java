package simpleexample.setexamples.treeset;

import java.util.Comparator;
/*
* Reversing Integer Elements of TreeSet
* First Option: prefix - in front of return result of compareTo method in compare
* Second Option  check o2.compareTo(o1)
* */
public class IntegerCompartor implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return -o1.compareTo(o2);
    }
}

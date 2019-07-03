package simpleexample.setexamples.treeset;

import java.util.TreeSet;
/*
 * Reversing Integer Elements of TreeSet
 * First Option: prefix - in front of return result of compareTo method in compare
 * Second Option  check o2.compareTo(o1)
 * */

public class ReversingIntegerValueInTreeSet {

    public static void main(String[] args) {
        System.out.println("Reversing Values using Option 1:");
        TreeSet<Integer>numbers = new TreeSet<>(new IntegerCompartor());
        numbers.add(39);
        numbers.add(809);
        numbers.add(9);
        numbers.add(99);
        numbers.add(319);
        numbers.add(890);
        numbers.add(609);
        numbers.add(109);
        System.out.println(numbers);
        System.out.println("Reversing Values using Option 2:");

        TreeSet<Integer>numbers1 = new TreeSet<>(new IntegerCompartor());
        numbers1.add(39);
        numbers1.add(809);
        numbers1.add(9);
        numbers1.add(99);
        numbers1.add(319);
        numbers1.add(890);
        numbers1.add(609);
        numbers1.add(109);
        System.out.println(numbers1);

    }
}

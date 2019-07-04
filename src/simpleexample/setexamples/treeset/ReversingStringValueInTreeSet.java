package simpleexample.setexamples.treeset;

import java.util.TreeSet;
/*
 * Reversing Integer Elements of TreeSet
 * First Option: prefix - in front of return result of compareTo method in compare
 * Second Option  check o2.compareTo(o1)
 * */

public class ReversingStringValueInTreeSet {

    public static void main(String[] args) {
        System.out.println("Reversing Values using Option 1:");
        TreeSet<String>names = new TreeSet<>(new StringCompartor());
        names.add("A");
        names.add("H");
        names.add("J");
        names.add("P");
        names.add("l");
        names.add("k");
        names.add("s");
        names.add("n");
        System.out.println(names);
        System.out.println("Reversing Values using Option 2:");
        TreeSet<String>names1 = new TreeSet<>(new StringCompartor());
        names1.add("J");
        names1.add("A");
        names1.add("B");
        names1.add("N");
        names1.add("P");
        names1.add("R");
        names1.add("L");
        names1.add("S");
        System.out.println(names1);
    }
}

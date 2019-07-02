package simpleexample.hashset;

import simpleexample.model.Empolyee;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Empolyee>empolyees = new TreeSet<>();
        empolyees.add(new Empolyee(5,"Good"));
        empolyees.add(new Empolyee(2,"Great"));
        empolyees.add(new Empolyee(8,"Greeting"));
        empolyees.add(new Empolyee(4,"gone"));
        empolyees.add(new Empolyee(1,"Go"));
        empolyees.add(new Empolyee(90,"Goal"));
        System.out.println(empolyees);
    }
}

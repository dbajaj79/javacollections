package simpleexample.sorting.comparable;

import simpleexample.model.Empolyee;

import java.util.ArrayList;
import java.util.Collections;

public class SortingCustomObjectUsingComparable {

    public static void main(String[] args) {
        ArrayList<Empolyee>empolyees = new ArrayList<>();
        empolyees.add(new Empolyee(10,"Lk"));
        empolyees.add(new Empolyee(20,"P"));
        empolyees.add(new Empolyee(5,"K"));
        empolyees.add(new Empolyee(6,"S"));
        empolyees.add(new Empolyee(7,"Hd"));
        empolyees.add(new Empolyee(8,"San"));
        empolyees.add(new Empolyee(9,"Par"));
        empolyees.add(new Empolyee(2,"Kul"));
        System.out.println("Before Sorting:");
        System.out.println(empolyees);
        Collections.sort(empolyees);
        System.out.println("After Sorting");
        System.out.println(empolyees);



    }
}

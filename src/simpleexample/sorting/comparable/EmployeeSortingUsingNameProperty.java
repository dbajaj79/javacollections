package simpleexample.sorting.comparable;

import simpleexample.model.Empolyee1;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSortingUsingNameProperty {

    public static void main(String[] args) {
        ArrayList<Empolyee1>empolyee1s =new ArrayList<>();
        empolyee1s.add(new Empolyee1(112,"Z"));
        empolyee1s.add(new Empolyee1(201,"D"));
        empolyee1s.add(new Empolyee1(245,"H"));
        empolyee1s.add(new Empolyee1(670,"J"));
        System.out.println("EmployeeList without Sorting:"+empolyee1s);
        Collections.sort(empolyee1s);
        System.out.println("Employee After Sorting:"+empolyee1s);
    }
}

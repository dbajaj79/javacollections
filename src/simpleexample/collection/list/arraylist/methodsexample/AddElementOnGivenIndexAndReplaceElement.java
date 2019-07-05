package simpleexample.collection.list.arraylist.methodsexample;

import java.util.ArrayList;
/*
* you can add element in collection using Two ways add(Object) and add(0,Object);
* Note: You can add Element using index and Object Method(add(0,Object) only in sequential order
* for Replacing element in Array we used set(i,object) method
* */

public class AddElementOnGivenIndexAndReplaceElement {

    public static void main(String[] args) {
        ArrayList<String>names = new ArrayList<>();
        names.add(0,"Deepa");
        names.add(1,"A");

        names.add(2,"pardeep");
        names.add(3,"B");

        names.add(4,"Sandeep");
        names.add(5,"C");

        System.out.println("All Elements of ArrayList"+names);
        names.set(0,"Pinku");
        System.out.println("After Replace Deepa with Pinku"+names);

    }
}

package simpleexample.arraylist.methodsexample;

import java.util.ArrayList;

public class AddAndRemoveSingleObject {

    public static void main(String[] args) {
        ArrayList<String>names = new ArrayList<>();
        names.add("Kuldeep");
        names.add("Hardeep");
        names.add("Pardeep");
        names.add("Sandeep");
        names.add("Ricky");
        names.add("Vicky");
        System.out.println("All Elements of ArrayList");
        System.out.println(names);
        System.out.println("Adding Element at Specific Position");
        names.add(0,"I am Adding on First Index");
        System.out.println(names);
        System.out.println("After Removing First Element Kuldeep");
        names.remove(0);
        System.out.println(names);
        System.out.println("After Removing  Element by Ricky");
        names.remove("Ricky");
        System.out.println(names);
    }
}

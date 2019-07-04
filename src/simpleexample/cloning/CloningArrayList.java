package simpleexample.cloning;

import java.util.ArrayList;

/*
* All Collections class implement Cloneable and Serializable interfaces
* to cloning and Serialization
* */
public class CloningArrayList {

    public static void main(String[] args) {
        ArrayList<String>strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("E");
        strings.add("F");
        strings.add("G");
        strings.add("H");
        System.out.println(strings);
        ArrayList<String>strings1 = (ArrayList<String>) strings.clone();
        System.out.println(strings1);
    }
}

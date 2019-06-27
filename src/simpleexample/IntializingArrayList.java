package simpleexample;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class IntializingArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Deepak");
        names.add("Kuldeep");
        names.add("Hardeep");
        names.add("Pardeep");
        System.out.println(names);
        printArraylistUsingForEach(names);
    }

   static void printArraylistUsingForEach(List<String> stringList)
    {
        for(String value:stringList)
        {
            System.out.println(value);
        }
    }
}

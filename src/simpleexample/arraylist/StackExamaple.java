package simpleexample.arraylist;

import java.util.Stack;

public class StackExamaple {

    public static void main(String[] args) {
        Stack<String>names = new Stack<>();
        names.push("A");
        names.push("B");
        names.push("C");
        names.push("D");
        names.push("E");
        System.out.println(names);
        System.out.println(names.peek());
        System.out.println(names.search("A"));
        System.out.println(names.search("E"));
        System.out.println(names.pop());
        System.out.println("After Pop Element of Names:"+names);
    }
}

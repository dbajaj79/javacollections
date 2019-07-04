package simpleexample.cloning;

import java.util.LinkedList;

public class CloningLinekedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("E");
        linkedList.add("D");
        linkedList.add("F");

        System.out.println(linkedList);
        LinkedList<String>linkedList1 = (LinkedList<String>) linkedList.clone();
        System.out.println(linkedList1);
    }
}

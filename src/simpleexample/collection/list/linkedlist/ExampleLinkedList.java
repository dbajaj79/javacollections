package simpleexample.collection.list.linkedlist;

import java.util.LinkedList;

public class ExampleLinkedList {

    public static void main(String[] args) {
        LinkedList<String>linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("F");
        linkedList.add("G");
        System.out.println(linkedList);
        //linkedList.set(0,"z");
        System.out.println(linkedList);
        linkedList.addFirst("Good");
        linkedList.addLast("Great");
        System.out.println("Print Linked list After Adding First and Last Elements");
        System.out.println(linkedList);
        System.out.println("Peek"+linkedList.peek());
        System.out.println("Peek First"+linkedList.peekFirst());
        System.out.println("Peek Last"+linkedList.peekLast());
        System.out.println("Poll"+linkedList.poll());
        System.out.println("Poll First"+linkedList.pollFirst());
        System.out.println("Poll Last"+linkedList.pollLast());
    }
}

package simpleexample.collection.list.linkedlist;

import simpleexample.model.Book;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/*
* Underlying Data Structure is Doubly Linked List
* Best for Frequently insertion
* Consume Much Memory as compared to ArrayList
* Search Element is slow
* Accessing Element is Slow than ArrayList Because ArrayList implement Random Access Interface which Marker interface
*
*
* */
public class ReadingDataFromLinekedListUsingGet {

    public static void main(String[] args) {
        LinkedList<Book>books = new LinkedList<>();
        books.add(new Book(10,"A","Java 2"));
        books.add(new Book(20,"B","Kotlin"));
        books.add(new Book(30,"C","Kotlin for Android"));

        //Reading Data using get Method
        System.out.println("Printing using get Method");
        for(int i=0;i<books.size();i++)
        {
            System.out.println(books.get(i));
        }
        //Reading Data using For Each
        System.out.println("Printing Using ForEach Loop");
        for (Book b:
             books) {
            System.out.println(b);
        }
        System.out.println("Printing Using List Iterator");
        ListIterator<Book>listIterator = books.listIterator();
        while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
        System.out.println("Printing Using  Iterator");
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}

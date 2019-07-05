package simpleexample.collection.set.setexamples.linkedset;

import simpleexample.model.Product;

import java.util.Iterator;
import java.util.LinkedList;

public class PrintingLinkedSetUsingIterator {
    public static void main(String[] args) {
        LinkedList<Product>products = new LinkedList<>();
        products.add(new Product("Dettol","ITC",10,"Hello"));
        products.add(new Product("Lux","PTC",20,"Good"));
        products.add(new Product("Dove","ITC",10,"Hello"));
        products.add(new Product("RIN","PTC",20,"Good"));
        products.add(new Product("TIDE","ITC",10,"Hello"));
        products.add(new Product("Lux","PTC",20,"Good"));

        Iterator<Product>productIterator = products.iterator();
        while (productIterator.hasNext())
        {
            System.out.println(productIterator.next());
        }




    }
}

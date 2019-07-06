package simpleexample.collection.map.linkedmap;

import simpleexample.model.Empolyee;
import simpleexample.model.Product;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
 * Removing  Entries from LinkedHashMap using Iterator
 * Get All Entries of Map using entrySet method
 * Get Iterator from entrySet
 * Get Key Object from Map.Entry  using  Iterator and check the condition for remove
 * Get Value from form Map.Entry using Iterator and check the condition and use iterator.remove method to Remove Elements
 * */
public class RemoveEntryFromMapUsingIterator {

    public static void main(String[] args) {
        LinkedHashMap<Empolyee, Product> productLinkedHashMap = new LinkedHashMap<>();
        productLinkedHashMap.put(new Empolyee(1, "Test"), new Product("Dettol", "Test", 10, "soap"));
        productLinkedHashMap.put(new Empolyee(2, "Hello"), new Product("Lux", "Test", 10, "soap"));
        productLinkedHashMap.put(new Empolyee(3, "hi"), new Product("Dove", "Test", 10, "soap"));
        productLinkedHashMap.put(new Empolyee(4, "Jon"), new Product("Pearls", "Test", 10, "soap"));
        productLinkedHashMap.put(new Empolyee(5, "Jacky"), new Product("Nima", "Test", 10, "soap"));
        productLinkedHashMap.put(new Empolyee(6, "rocky"), new Product("Neem", "Test", 10, "soap"));
        productLinkedHashMap.put(new Empolyee(7, "Jenny"), new Product("Margo", "Test", 10, "soap"));
        productLinkedHashMap.put(new Empolyee(8, "Jill"), new Product("Haldi Chandan", "Test", 10, "soap"));
        productLinkedHashMap.put(new Empolyee(9, "Joe"), new Product("LifeBuoy", "Test", 10, "soap"));
        productLinkedHashMap.put(new Empolyee(10, "king"), new Product("Rexona", "Test", 10, "soap"));
        productLinkedHashMap.put(new Empolyee(11, "ring"), new Product("Liral", "Test", 10, "soap"));

        Set<Map.Entry<Empolyee, Product>> entries = productLinkedHashMap.entrySet();
        Iterator<Map.Entry<Empolyee, Product>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<Empolyee, Product> empolyeeProductEntry = iterator.next();
            Empolyee empolyee = empolyeeProductEntry.getKey();
            Product product = empolyeeProductEntry.getValue();
            if (empolyee.getId() == 10) {
                iterator.remove();
            }
            if (product.getName().equalsIgnoreCase("Dettol")) {
                iterator.remove();
            }
        }

        System.out.println("After Removing Entries are:");
        for (Map.Entry<Empolyee, Product> productEntry : productLinkedHashMap.entrySet()) {
            System.out.println("Key:" + productEntry.getKey().getId() + productEntry.getKey().getName() + "\n"
                    + productEntry.getValue().getName() + productEntry.getValue().getPrice() +
                    productEntry.getValue().getType() + productEntry.getValue().getManfacture());
        }

    }
}

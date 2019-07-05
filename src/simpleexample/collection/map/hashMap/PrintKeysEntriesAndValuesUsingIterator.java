package simpleexample.collection.map.hashMap;

import simpleexample.model.Animal;
import simpleexample.model.Empolyee;

import java.util.*;
/*
* Map does not support any Cursor like Iterator,ListIterator or Enumeration
* But I you want to Cursor like Iterator and ListIterator you can use in following ways
* values function return Collection object which means you can use create ArrayList,LinkedList HashSet,LinkedSet etc
* and apply cursors on it
* keySet and entrySet methods return set of Map Keys and Entries of Map mean you can use Iterator cursor with it
*
* */

public class PrintKeysEntriesAndValuesUsingIterator {
    public static void main(String[] args) {
        HashMap<Empolyee, Animal> empolyeeAnimalHashMap = new HashMap<>();
        empolyeeAnimalHashMap.put(new Empolyee(1, "A"), new Animal(2, "Red", "Dog"));
        empolyeeAnimalHashMap.put(new Empolyee(2, "B"), new Animal(3, "Green", "Cat"));
        empolyeeAnimalHashMap.put(new Empolyee(3, "C"), new Animal(4, "Pink", "Cow"));
        empolyeeAnimalHashMap.put(new Empolyee(4, "D"), new Animal(5, "Purple", "Ox"));
        Set<Map.Entry<Empolyee, Animal>> entries = empolyeeAnimalHashMap.entrySet();
        System.out.println("Printing Entries of Map");
        Iterator<Map.Entry<Empolyee, Animal>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Empolyee, Animal> entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
        System.out.println("Printing Keys of Map");
        Set<Empolyee>empolyeeSet = empolyeeAnimalHashMap.keySet();
        Iterator<Empolyee>empolyeeIterator = empolyeeSet.iterator();
        while (empolyeeIterator.hasNext())
        {
            Empolyee empolyee = empolyeeIterator.next();
            System.out.println(empolyee);
        }

        System.out.println("Printing Values of Map");
        Collection<Animal> collection = empolyeeAnimalHashMap.values();
        Iterator<Animal>animalIterator = collection.iterator();
        while (animalIterator.hasNext())
        {
            Animal animal = animalIterator.next();
            System.out.println(animal);
        }
    }
}

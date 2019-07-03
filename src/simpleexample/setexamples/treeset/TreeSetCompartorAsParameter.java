package simpleexample.setexamples.treeset;

import simpleexample.model.Animal;
import simpleexample.model.Empolyee;

import java.util.TreeSet;
/*
*
* */
public class TreeSetCompartorAsParameter {

    public static void main(String[] args) {
        TreeSet<Animal> personTreeSet = new TreeSet<>(new AnimalNameCompartor());
        personTreeSet.add(new Animal(1,"Red","Rocky"));
        personTreeSet.add(new Animal(2,"Green","Jacky"));
        personTreeSet.add(new Animal(3,"Pink","Jony"));

        personTreeSet.add(new Animal(4,"Brown","Bozo"));

        System.out.println(personTreeSet);

    }
}

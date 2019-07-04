package simpleexample.treeset;

/*
* Three to get SortedSet in TreeSet
* subSet()
* tailSet()
* headSet()
* TreeSet Constructor with sortedSet as Parameter
* */

import java.util.SortedSet;
import java.util.TreeSet;

public class TreesetWithSortedSetAsParameter {

    public static void main(String[] args) {
        TreeSet<Integer>treeSet = new TreeSet<>();
        for(int i=21;i<=40;i++)
        {
            treeSet.add(i);
        }
        System.out.println(treeSet);
        SortedSet<Integer> sortedSet = treeSet.subSet(28, 40);
        TreeSet<Integer>treeSet1 = new TreeSet<>(sortedSet);
        System.out.println(treeSet1);


        SortedSet<Integer> sortedSet1 = treeSet.tailSet(35);
        TreeSet<Integer>treeSet2 = new TreeSet<>(sortedSet1);
        System.out.println(treeSet2);
        SortedSet<Integer>sortedSet2 = treeSet.headSet(31);
        TreeSet<Integer>treeSet3 = new TreeSet<>(sortedSet2);
        System.out.println(treeSet3);
    }

}

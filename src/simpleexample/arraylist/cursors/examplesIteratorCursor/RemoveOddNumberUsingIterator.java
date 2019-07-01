package simpleexample.arraylist.cursors.examplesIteratorCursor;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveOddNumberUsingIterator {
    public static void main(String[] args) {
        ArrayList<Integer> nummbers = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            nummbers.add(i);
        }

        Iterator<Integer>iterator = nummbers.iterator();
        while (iterator.hasNext())
        {
            if(iterator.next()%2!=0)
            {
                iterator.remove();
            }
        }

        System.out.println(nummbers);

    }
}

package simpleexample.cursors.examplesoflistiterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class AddRemovAndReplaceUsingListItrator {

    public static void main(String[] args) {
        ArrayList<String>names = new ArrayList<>();
        names.add("A");
        names.add("B");
        names.add("C");
        names.add("D");
        names.add("E");
        ListIterator<String> listIterator = names.listIterator();
        listIterator.add("Top Element");
        while (listIterator.hasNext())
        {
            String  nameValue = listIterator.next();
            if(nameValue.equalsIgnoreCase("A"))
            {
                listIterator.set("Z");
            }
            if(nameValue.equalsIgnoreCase("C"))
            {
                listIterator.remove();
            }

        }
        System.out.println("Names After All ListIterator Operations:"+names);
    }
}

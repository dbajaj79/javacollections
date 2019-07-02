package simpleexample.setexamples.treeset;

import simpleexample.model.Person;

import java.util.Iterator;
import java.util.TreeSet;

public class PrintingTreeSetUsingIterator {

    public static void main(String[] args) {

        TreeSet<Person> personTreeSet = new TreeSet<>();
        personTreeSet.add(new Person("Deepak","dk@gmail.com","99234445445","Delhi"));
        personTreeSet.add(new Person("ABC","ck@gmail.com","99234445445","Kolkata"));
        personTreeSet.add(new Person("KLM","pk@gmail.com","99234445445","Goa"));
        personTreeSet.add(new Person("PQR","mk@gmail.com","99234445445","Patiala"));
        personTreeSet.add(new Person("CH","kk@gmail.com","99234445445","Chandigarh"));
        personTreeSet.add(new Person("PK","ddk@gmail.com","99234445445","Patnakot"));
        personTreeSet.add(new Person("Kuru","ldk@gmail.com","99234445445","KuruShetra"));
        personTreeSet.add(new Person("Bar","dkd@gmail.com","99234445445","Hisar"));

        System.out.println(personTreeSet);
        Iterator<Person>personIterator = personTreeSet.iterator();
        while (personIterator.hasNext())
        {
            System.out.println(personIterator.next());
        }

    }
}

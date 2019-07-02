package simpleexample.model;

public class Empolyee implements Comparable{

    int id;
    String name;


    public Empolyee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Empolyee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Empolyee empolyee = (Empolyee)o;
        if(id==empolyee.id)
        {
            return 0;
        }
        else if(id>empolyee.id)
        {
            return 1;
        }
        else
        {
            return -1;
        }

    }
}

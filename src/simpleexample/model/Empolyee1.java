package simpleexample.model;

public class Empolyee1 implements Comparable<Empolyee1>{

    int id;
    String name;


    public Empolyee1(int id, String name) {
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
    public int compareTo(Empolyee1 o) {

        return name.compareTo(o.name);

    }
}

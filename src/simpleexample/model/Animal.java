package simpleexample.model;

public class Animal implements Comparable<String>{
    int id;
    String color,name;

    public Animal(int id, String color, String name) {
        this.id = id;
        this.color = color;
        this.name = name;
    }



    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(String o) {
        return name.compareTo(o);
    }
}

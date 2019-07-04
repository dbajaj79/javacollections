package simpleexample.model;

import java.io.Serializable;

public class School implements Serializable {

    String name;
    String city;
    String area;

    public School(String name, String city, String area) {
        this.name = name;
        this.city = city;
        this.area = area;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}

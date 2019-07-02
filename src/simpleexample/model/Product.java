package simpleexample.model;

public class Product {

    private String name;
    private String manfacture;
    private int price;
    private String type;

    public Product(String name, String manfacture, int price, String type) {
        this.name = name;
        this.manfacture = manfacture;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", manfacture='" + manfacture + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getManfacture() {
        return manfacture;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}

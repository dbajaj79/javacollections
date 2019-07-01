package simpleexample.model;

public class Book
{
    int price;
    String author,name;

    public Book(int price, String author, String name) {
        this.price = price;
        this.author = author;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "price=" + price +
                ", author=" + author +
                ", name=" + name +
                '}';
    }
}

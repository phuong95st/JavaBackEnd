package basic.buoi4.homework.bt3;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    // constuctor

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    // getter, setter

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    // method
    public String toString() {
        return String.format("Book[name=%s," + this.author.toString() + ",price=%.2f,qty:%d]", this.name, this.price, this.qty);
    }
}

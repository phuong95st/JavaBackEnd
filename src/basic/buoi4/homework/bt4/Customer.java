package basic.buoi4.homework.bt4;

public class Customer {
    private int id;
    private String name;
    private int discount;

    // constructor

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    // getter, setter

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    // method
    public String toString(){
        return String.format("%s(%d)(%d%%)",this.name, this.id, this.discount);
    }
}

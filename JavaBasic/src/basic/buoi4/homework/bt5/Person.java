package basic.buoi4.homework.bt5;

public class Person {
    private String name;
    private String address;

    // constuctor

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // getter, setter

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // method
    public String toString() {
        return String.format("Person[name=%s,address=%s]", this.name, this.address);
    }
}

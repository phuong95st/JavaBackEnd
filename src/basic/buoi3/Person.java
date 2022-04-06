package basic.buoi3;

public class Person {
    private String name;
    private String designation;

    // contructor
    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public Person() {
    }

    // getter, setter
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // tao phuong thuc
    public void learn(){
        System.out.println("learn");
    }
    public void walk(){
        System.out.println("walk");
    }
    public void eat(){
        System.out.println("eat");
    }
}

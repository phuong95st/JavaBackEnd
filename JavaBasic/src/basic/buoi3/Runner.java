package basic.buoi3;

import basic.buoi3.Programmer;

public class Runner {
    public static void main(String[] args) {
        // tạo đối tuong Programmer
        Programmer programmer = new Programmer("Phuong","Nguyen Huu", "Luvina JSC");

        programmer.eat();
        programmer.learn();
        programmer.walk();
        programmer.coding();
        System.out.println("Name: "+programmer.getName() + ", desig: " + programmer.getDesignation() + ", company: " + programmer.getCompanyName());
    }
}
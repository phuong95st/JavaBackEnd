package basic.buoi4.homework.bt5;

public class Staff extends Person{
    private String school;
    private double pay;

    // constuctor

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    // getter, setter

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    // method
    public String toString(){
        return String.format("Staff["+super.toString()+",school=%s,pay=%.2f]",this.school, this.pay);
    }
}

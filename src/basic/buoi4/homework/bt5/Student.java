package basic.buoi4.homework.bt5;

public class Student extends Person{
    private  String program;
    private int year;
    private double fee;

    // constuctor

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    // getter, setter

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    // method
    public String toString(){
        return String.format("Student["+super.toString()+",program=%s,year=%d,fee=%.2f]",this.program, this.year, this.fee);
    }
}

package basic;

public class Teacher {
    private int age;
    private String fullName;

    private int major;

    // age
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    // fullName
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public String getFullName(){
        return this.fullName;
    }

    // major
    public void setMajor(int major){
        this.major = major;
    }
    public int getMajor(){
        return this.major;
    }

    public void info(){
        System.out.println("Name: " + this.getFullName() + ", Age: " + this.getAge() + ", Major: " + this.getMajor());
    }

    public static void main(String[] args) {
        Teacher teacherA = new Teacher();
        teacherA.setFullName("Tran Manh Chung");
        teacherA.setAge(31);
        teacherA.setMajor(40);
        teacherA.info();

        // khoi tao phd
        Phd p = new Phd();
        p.setFullName("Giao su");
        p.info();

    }
}

class Phd extends Teacher{

}

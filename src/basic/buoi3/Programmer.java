package basic.buoi3;

public class Programmer extends Person{
    private String companyName;

    // tao constructor


    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public Programmer(String companyName) {
        this.companyName = companyName;
    }

    public Programmer() {
    }

    // getter,setter
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    // phuong thuc
    public void coding(){
        System.out.println("coding");
    }
}

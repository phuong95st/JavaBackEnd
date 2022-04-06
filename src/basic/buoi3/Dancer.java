package basic.buoi3;

public class Dancer extends Person{
    private String groupName;

    // constuctor
    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public Dancer(String groupName) {
        this.groupName = groupName;
    }

    public Dancer() {
    }

    // getter, setter
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    // phuong thuc
    public void dancing(){
        System.out.println("dancing");
    }
}

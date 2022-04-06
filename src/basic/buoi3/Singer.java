package basic.buoi3;

public class Singer extends Person{
    private String bandName;

    // constuctor
    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public Singer(String bandName) {
        this.bandName = bandName;
    }

    public Singer() {
    }

    // getter, setter
    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    // phuong thuc
    public void singging(){
        System.out.println("singging");
    }
    public void playGitar(){
        System.out.println("play gitar");
    }
}

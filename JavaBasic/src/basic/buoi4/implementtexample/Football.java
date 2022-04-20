package basic.buoi4.implementtexample;

public class Football extends Ball{
    public Football(String brandName) {
        super(brandName);
    }

    public Football(){

    }

    // method
    public void toss(){
        System.out.println("toss Football");
    }

    public void bounce(){
        System.out.println("bounce Football");
    }
}

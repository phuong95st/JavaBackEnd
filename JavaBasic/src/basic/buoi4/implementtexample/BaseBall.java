package basic.buoi4.implementtexample;

public class BaseBall extends Ball{

    public BaseBall(String brandName) {
        super(brandName);
    }
    public BaseBall(){

    }

    // method
    public void toss(){
        System.out.println("toss BaseBall");
    }

    public void bounce(){
        System.out.println("bounce BaseBall");
    }

    public void bounce(double d){
        System.out.println(d);
    }
}

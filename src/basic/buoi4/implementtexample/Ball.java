package basic.buoi4.implementtexample;

public class Ball implements Tossable{
    private String brandName;

    public Ball(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    // method
    public void bounce(){
        System.out.println("bounce Ball");
    }

    @Override
    public void toss() {
        System.out.println("toss Ball");
    }
}

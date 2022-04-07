package basic.buoi4.abstractexample;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ball ojbect");
        Ball ball = new Ball("Nike");
        ball.toss();
        ball.bounce();

        System.out.println("-----------------");
        System.out.println("Ball ojbect");
        // Rock object
        new Rock().toss();

        System.out.println("-----------------");
        System.out.println("Football ojbect");
        // FootBall
        Football football = new Football("FiFa");
        football.bounce();
        football.toss();

        System.out.println("-----------------");
        System.out.println("Baseball ojbect");
        //Baseball object
        BaseBall baseBall = new BaseBall("Base ball");
        baseBall.bounce();
        baseBall.toss();
    }
}

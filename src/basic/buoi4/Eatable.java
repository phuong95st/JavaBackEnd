package basic.buoi4;

public interface Eatable {
    void eating();
}

interface Walkable{

}

interface Sleepable{

}

class Humman implements Eatable,Walkable,Sleepable{

    @Override
    public void eating() {
        System.out.println("Humman eating");
    }
}

class Pig implements Eatable,Walkable,Sleepable{

    @Override
    public void eating() {
        System.out.println("Pig eating");
    }
}

class Main{
    public static void main(String[] args) {
        new Humman().eating();
        new Pig().eating();
    }
}

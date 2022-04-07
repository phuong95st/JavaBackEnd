package basic.buoi4;

public interface Eatable {
    void eating();
}

interface Walkable{

}

interface Sleepable{

}

class Humman implements Eatable,Walkable,Sleepable{

}

class Pig implements Eatable,Walkable,Sleepable{

    @Override
    public void eating() {

    }
}

abstract class Abstraction {
    abstract void turnOn();
    abstract void turnOff();
}

class TVRemote extends Abstraction {
    @Override
    void turnOn() {
        System.out.println("TV is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Abstraction remote = new TVRemote();
        remote.turnOn();   
        remote.turnOff();  
    }
}



abstract class Appliance {
    abstract void turnOn();
}

class WashingMachine extends Appliance {
    @Override
    void turnOn() {
        System.out.println("Turning on Washing Machine...");
    }

    void wash() {
        System.out.println("Washing our clothes...");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();
        washingMachine.turnOn();
        washingMachine.wash();
    }
}


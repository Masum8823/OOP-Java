abstract class SmartDevice {
    abstract void turnOn();
    abstract void turnOff();
    abstract void showPowerUsage();
}

class Light extends SmartDevice {
    int power;

    void turnOn() {
        power = 50;
        System.out.println("Light is ON");
    }

    void turnOff() {
        power = 0;
        System.out.println("Light is OFF");
    }

    void showPowerUsage() {
        if (power > 0)
            System.out.println("Light Power Usage: " + power + "W");
        else
            System.out.println("Light is OFF (0W)");
    }
}

class Fan extends SmartDevice {
    int power;

    void turnOn() {
        power = 75;
        System.out.println("Fan is ON");
    }

    void turnOff() {
        power = 0;
        System.out.println("Fan is OFF");
    }

    void showPowerUsage() {
        if (power > 0)
            System.out.println("Fan Power Usage: " + power + "W");
        else
            System.out.println("Fan is OFF (0W)");
    }
}

class AirConditioner extends SmartDevice {
    int power;

    void turnOn() {
        power = 1500;
        System.out.println("AC is ON");
    }

    void turnOff() {
        power = 0;
        System.out.println("AC is OFF");
    }

    void showPowerUsage() {
        if (power > 0)
            System.out.println("AC Power Usage: " + power + "W");
        else
            System.out.println("AC is OFF (0W)");
    }
}

public class SmartHomePowerSystem {
    public static void main(String[] args) {

        SmartDevice light = new Light();
        SmartDevice fan = new Fan();
        SmartDevice ac = new AirConditioner();

        System.out.println("Turning ON all devices...\n");
        light.turnOn();
        fan.turnOn();
        ac.turnOn();

        System.out.println("\nPower Usage:");
        light.showPowerUsage();
        fan.showPowerUsage();
        ac.showPowerUsage();

        System.out.println("\nTurning OFF all devices...\n");
        light.turnOff();
        fan.turnOff();
        ac.turnOff();
    }
}
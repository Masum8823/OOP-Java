// Abstract Class
abstract class SmartDevice {
    abstract void turnOn();
    abstract void turnOff();
    abstract void showStatus();
}

// Light Class
class Light extends SmartDevice {
    int brightness;

    void turnOn() {
        brightness = 70;
        System.out.println("Light is ON");
    }

    void turnOff() {
        brightness = 0;
        System.out.println("Light is OFF");
    }

    void showStatus() {
        if (brightness > 0)
            System.out.println("Light brightness: " + brightness + "%");
        else
            System.out.println("Light is OFF");
    }
}

// Fan Class
class Fan extends SmartDevice {
    int speed;

    void turnOn() {
        speed = 3;
        System.out.println("Fan is ON");
    }

    void turnOff() {
        speed = 0;
        System.out.println("Fan is OFF");
    }

    void showStatus() {
        if (speed > 0)
            System.out.println("Fan speed: " + speed);
        else
            System.out.println("Fan is OFF");
    }
}

// Air Conditioner Class
class AirConditioner extends SmartDevice {
    int temperature;

    void turnOn() {
        temperature = 24;
        System.out.println("AC is ON");
    }

    void turnOff() {
        temperature = 0;
        System.out.println("AC is OFF");
    }

    void showStatus() {
        if (temperature > 0)
            System.out.println("AC temperature: " + temperature + "°C");
        else
            System.out.println("AC is OFF");
    }
}

// Main Class
public class SmartHome {
    public static void main(String[] args) {

        SmartDevice light = new Light();
        SmartDevice fan = new Fan();
        SmartDevice ac = new AirConditioner();

        // Turn ON all devices
        System.out.println("Turning ON all devices...\n");
        light.turnOn();
        fan.turnOn();
        ac.turnOn();

        System.out.println("\nDevice Status:");
        light.showStatus();
        fan.showStatus();
        ac.showStatus();

        // Turn OFF all devices
        System.out.println("\nTurning OFF all devices...\n");
        light.turnOff();
        fan.turnOff();
        ac.turnOff();
    }
}
package Seminar2.Animals;

import Seminar2.Animals.base.Bird;
import Seminar2.FlySpeed;
import Seminar2.RunSpeed;
import Seminar2.SwimSpeed;

public class Duck extends Bird implements RunSpeed, FlySpeed, SwimSpeed {
    public Duck(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Кря-кря";
    }

    @Override
    public String feed() {
        return "все подряд";
    }

    @Override
    public int getRunSpeed() {
        return 5;
    }

    @Override
    public String toString() {
        return String.format("Duck: %s, Speed: %d, FlySpeed: %d, SwimSpeed: %d", super.toString(), getRunSpeed(), getFlySpeed(), getSwimSpeed());
    }

    @Override
    public int getFlySpeed() {
        return 50;
    }

    @Override
    public int getSwimSpeed() {
        return 20;
    }
}

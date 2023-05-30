package Seminar2.Animals;

import Seminar2.Animals.base.Predator;
import Seminar2.RunSpeed;
import Seminar2.SwimSpeed;

public class Bear extends Predator implements RunSpeed, SwimSpeed {

    public Bear(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Rear";
    }

    @Override
    public String toString() {
        return String.format("Bear: %s, Speed: %d, SwimSpeed: %d", super.toString(), getRunSpeed(), getSwimSpeed());
    }

    @Override
    public int getRunSpeed() {
        return 40;
    }

    @Override
    public int getSwimSpeed() {
        return 25;
    }
}

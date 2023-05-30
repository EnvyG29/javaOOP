package Seminar2.Animals;

import Seminar2.Animals.base.Bird;
import Seminar2.FlySpeed;
import Seminar2.RunSpeed;

public class Owl extends Bird implements FlySpeed, RunSpeed {
    public Owl(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Угу";
    }

    @Override
    public String feed() {
        return "мыши";
    }

    @Override
    public int getFlySpeed() {
        return 60;
    }

    @Override
    public int getRunSpeed() {
        return 3;
    }

    @Override
    public String toString() {
        return String.format("Owl: %s, Speed: %d, FlySpeed: %d", super.toString(), getRunSpeed(), getFlySpeed());
    }
}

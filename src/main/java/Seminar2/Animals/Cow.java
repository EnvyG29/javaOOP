package Seminar2.Animals;

import Seminar2.Animals.base.Herbivores;
import Seminar2.RunSpeed;

public class Cow extends Herbivores implements RunSpeed {

    public Cow(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Moo";
    }

    @Override
    public String toString() {
        return String.format("Cow: %s, Speed: %d", super.toString(), getRunSpeed());
    }

    @Override
    public int getRunSpeed() {
        return 3;
    }
}

package seminar4.weapons.rangeWeapon;

public class Bow implements Range {
    @Override
    public int damage() {
        return 20;
    }

    @Override
    public int distance() {
        return 120;
    }

    @Override
    public String toString() {
        return String.format("Bow: %d", damage());
    }
}

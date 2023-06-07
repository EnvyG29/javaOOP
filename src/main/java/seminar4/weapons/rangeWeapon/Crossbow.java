package seminar4.weapons.rangeWeapon;

public class Crossbow implements Range {
    @Override
    public int damage() {
        return 25;
    }

    @Override
    public int distance() {
        return 100;
    }

    @Override
    public String toString() {
        return String.format("CrossBow: %d", damage());
    }

}

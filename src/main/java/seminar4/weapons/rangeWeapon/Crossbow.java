package seminar4.weapons.rangeWeapon;

public class Crossbow implements Range{
    @Override
    public int damage() {
        return 10;
    }

    @Override
    public int distance() {
        return 100;
    }
}

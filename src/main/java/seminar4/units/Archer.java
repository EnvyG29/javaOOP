package seminar4.units;

import seminar4.weapons.rangeWeapon.Range;

public class Archer extends Unit{
    public Archer(String name, int healsPoint, Range weapon) {
        super(name, healsPoint, weapon);
    }

    public int distance(){
        return ((Range)super.getWeapon()).distance();
    }
    @Override
    public String toString() {
        return String.format("Archer: %s, Distance: %d",super.toString(), distance());
    }
}

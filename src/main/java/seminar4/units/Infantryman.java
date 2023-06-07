package seminar4.units;

import seminar4.weapons.meleeWeapon.Melee;

public class Infantryman extends Unit{
    public Infantryman(String name, int healsPoint, Melee weapon) {
        super(name, healsPoint, weapon);
    }
    @Override
    public String toString() {
        return String.format("Infantryman: %s", super.toString());
    }
}

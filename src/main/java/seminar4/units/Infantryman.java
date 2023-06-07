package seminar4.units;

import seminar4.defenth.Armor;
import seminar4.defenth.Mail;
import seminar4.weapons.meleeWeapon.Axe;
import seminar4.weapons.meleeWeapon.Melee;

public class Infantryman extends Unit{
    public Infantryman(String name, int healsPoint, Melee weapon, Armor armor) {
        super(name, healsPoint, weapon, armor);
    }


    @Override
    public String toString() {
        return String.format("Infantryman: %s", super.toString());
    }
}

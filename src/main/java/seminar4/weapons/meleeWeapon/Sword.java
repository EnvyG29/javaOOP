package seminar4.weapons.meleeWeapon;

public class Sword implements Melee {
    @Override
    public int damage() {
        return 20;
    }

    @Override
    public String toString() {
        return String.format("Sword: %d", damage());
    }
}

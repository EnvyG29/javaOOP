package dz.dz2Terrarium.fauna;

import dz.dz2Terrarium.fauna.base.Amphibian;
import dz.dz2Terrarium.skills.IsPoisonous;
import dz.dz2Terrarium.skills.JumpDistance;
import dz.dz2Terrarium.skills.SpecialSkill;

public class Frog extends Amphibian  implements IsPoisonous, JumpDistance, SpecialSkill {

    public Frog(String name, int movementSpeed) {
        super(name, movementSpeed);
    }

    @Override
    public String toString() {
        return String.format("Лягушка: %s, Прыгает: %d, Питается: %s, Ядовитый: %b, Особый навык: %s", super.toString(), jumpDistance(), feed(), isPoisonous(), getSpecialSkill()) ;
    }
    @Override
    public boolean isPoisonous() {
        return true;
    }

    @Override
    public String getSpecialSkill() {
        return "передвигается по деревьям";
    }

    @Override
    public int jumpDistance() {
        return 2;
    }
}

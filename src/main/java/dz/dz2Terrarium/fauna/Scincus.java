package dz.dz2Terrarium.fauna;

import dz.dz2Terrarium.fauna.base.Reptile;
import dz.dz2Terrarium.skills.IsPoisonous;
import dz.dz2Terrarium.skills.SpecialSkill;

public class Scincus extends Reptile implements IsPoisonous, SpecialSkill {

    public Scincus(String name, int movementSpeed) {
        super(name, movementSpeed);
    }

    @Override
    public String toString() {
        return String.format("%s, Питается %s, Ядовитый: %b, Особые навыки %s",super.toString(), feed(), isPoisonous(), getSpecialSkill());
    }

    @Override
    public boolean isPoisonous() {
        return false;
    }

    @Override
    public String getSpecialSkill() {
        return "прикидываются мертвыми, имеют чешую с шипами";
    }
}

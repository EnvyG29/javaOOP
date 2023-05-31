package dz.dz2Terrarium.fauna;

import dz.dz2Terrarium.fauna.base.Amphibian;
import dz.dz2Terrarium.skills.IsPoisonous;
import dz.dz2Terrarium.skills.SpecialSkill;
import dz.dz2Terrarium.skills.SwimSpeed;

public class Salamander extends Amphibian implements IsPoisonous, SpecialSkill, SwimSpeed {

    public Salamander(String name, int movementSpeed) {
        super(name, movementSpeed);
    }
    @Override
    public String toString() {
        return String.format("Саламандра: %s, Скорость плавания %d, Питается: %s, Ядовитый: %b, Особый навык: %s", super.toString(), getSwimSpeed(), feed(), isPoisonous(), getSpecialSkill()) ;
    }

    @Override
    public boolean isPoisonous() {
        return false;
    }

    @Override
    public String getSpecialSkill() {
        return "отбрасывают хвост";
    }

    @Override
    public int getSwimSpeed() {
        return 5;
    }
}

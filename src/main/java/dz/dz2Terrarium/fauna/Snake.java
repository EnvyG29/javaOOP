package dz.dz2Terrarium.fauna;

import dz.dz2Terrarium.fauna.base.Reptile;
import dz.dz2Terrarium.skills.IsPoisonous;
import dz.dz2Terrarium.skills.SpecialSkill;
import dz.dz2Terrarium.skills.SwimSpeed;

public class Snake extends Reptile implements IsPoisonous, SpecialSkill, SwimSpeed {

    public Snake(String name, int movementSpeed) {
        super(name, movementSpeed);
    }

    @Override
    public String toString() {
        return String.format("Змея: %s, Скорость плавания %d, Питается: %s, Ядовитый: %b, Особый навык: %s", super.toString(), getSwimSpeed(), feed(), isPoisonous(), getSpecialSkill()) ;
    }

    @Override
    public boolean isPoisonous() {
        return true;
    }

    @Override
    public String getSpecialSkill() {
        return "гипноз";
    }


    @Override
    public int getSwimSpeed() {
        return 3;
    }
}

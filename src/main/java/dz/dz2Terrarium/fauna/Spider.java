package dz.dz2Terrarium.fauna;

import dz.dz2Terrarium.fauna.base.Arachnid;
import dz.dz2Terrarium.skills.IsPoisonous;
import dz.dz2Terrarium.skills.JumpDistance;
import dz.dz2Terrarium.skills.SpecialSkill;

public class Spider extends Arachnid implements SpecialSkill, IsPoisonous, JumpDistance {


    public Spider(String name, int movementSpeed) {
        super(name, movementSpeed);
    }

    @Override
    public String toString() {
        return String.format("Паук: %s, Питается: %s, Ядовитый: %b, Особый навык: %s , может прыгнуть на %d", super.toString(),feed(), isPoisonous(), getSpecialSkill(), jumpDistance()) ;
    }

    @Override
    public boolean isPoisonous() {
        return true;
    }

    @Override
    public String getSpecialSkill() {
        return "плетет паутину";
    }

    @Override
    public int jumpDistance() {
        return 1;
    }
}

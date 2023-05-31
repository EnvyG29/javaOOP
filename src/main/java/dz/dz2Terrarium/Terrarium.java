package dz.dz2Terrarium;

import dz.dz2Terrarium.fauna.base.Fauna;
import dz.dz2Terrarium.skills.IsPoisonous;
import dz.dz2Terrarium.skills.SwimSpeed;
import java.util.ArrayList;
import java.util.List;

public class Terrarium {
    List<Fauna> terrarium = new ArrayList<>();

    public Terrarium addFosterling(Fauna fosterling){
        terrarium.add(fosterling);
        return this;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("В террариуме:\n");
        for (Fauna fosterling: terrarium) {
            builder.append(fosterling).append("\n");
        }
        return builder.toString();
    }

    public List<IsPoisonous> poisonous() {
        List<IsPoisonous> poisonous = new ArrayList<>();
        for (Fauna fosterling: terrarium) {
            if (((IsPoisonous) fosterling).isPoisonous()){
                poisonous.add((IsPoisonous) fosterling);
            }
        }
        return poisonous;
    }


    public List<SwimSpeed> swimmers(){
        List<SwimSpeed> swimmers = new ArrayList<>();
        for (Fauna fosterling: terrarium) {
            if (fosterling instanceof SwimSpeed){
                swimmers.add((SwimSpeed) fosterling);
            }
        }
        return swimmers;
    }
    public SwimSpeed getSwimFaster(){
        List<SwimSpeed> swim = swimmers();
        SwimSpeed champ = swim.get(0);
        for (SwimSpeed item: swim) {
            if (champ.getSwimSpeed() < item.getSwimSpeed()){
                champ = item;
            }
        }
        return champ;
    }
}

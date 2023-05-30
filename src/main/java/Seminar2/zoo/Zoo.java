package Seminar2.zoo;

import Seminar2.Animals.base.Animal;
import Seminar2.FlySpeed;
import Seminar2.Radio;
import Seminar2.RunSpeed;
import Seminar2.SwimSpeed;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private Radio radio = new Radio();
    private List<Animal> zoo = new ArrayList<>();
    public Zoo addAnimal(Animal someAnimal){
        zoo.add(someAnimal);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("В зоопарке:\n");
        for (Animal an: zoo) {
            builder.append(an).append("\n");
        }
        return builder.toString();
    }

    private List<Soundable> getSoundable(){
        List<Soundable> result = new ArrayList<>(zoo);
        result.add(radio);
        return result;
    }

    public String getSound(){
        StringBuilder builder = new StringBuilder();
        for (Soundable sound: getSoundable()){
            builder.append(sound.sound()).append("\n");
        }
        return builder.toString();
    }

    public List<RunSpeed> runners(){
        List<RunSpeed> runners = new ArrayList<>();
        for (Animal animal: zoo) {
            if (animal instanceof RunSpeed){
                runners.add((RunSpeed) animal);
            }
        }
        return runners;
    }

    public RunSpeed getRunnerChampion(){
        List<RunSpeed> runners =runners();
        RunSpeed champ = runners.get(0);
        for (RunSpeed item: runners) {
            if (champ.getRunSpeed() < item.getRunSpeed()){
                champ = item;
            }
        }
        return champ;
    }
    public List<FlySpeed> flyers(){
        List<FlySpeed> flyers = new ArrayList<>();
        for (Animal animal: zoo) {
            if (animal instanceof FlySpeed){
                flyers.add((FlySpeed) animal);
            }
        }
        return flyers;
    }
    public List<SwimSpeed> swimmers(){
        List<SwimSpeed> swimmers = new ArrayList<>();
        for (Animal animal: zoo) {
            if (animal instanceof SwimSpeed){
                swimmers.add((SwimSpeed) animal);
            }
        }
        return swimmers;
    }
    public SwimSpeed getSwimChampion(){
        List<SwimSpeed> runners = swimmers();
        SwimSpeed champ = runners.get(0);
        for (SwimSpeed item: runners) {
            if (champ.getSwimSpeed() < item.getSwimSpeed()){
                champ = item;
            }
        }
        return champ;
    }

    public FlySpeed getFlyChampion(){
        List<FlySpeed> flyers = flyers();
        FlySpeed champ = flyers.get(0);
        for (FlySpeed item: flyers) {
            if (champ.getFlySpeed() < item.getFlySpeed()){
                champ = item;
            }
        }
        return champ;
    }
}

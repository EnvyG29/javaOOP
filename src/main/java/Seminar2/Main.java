package Seminar2;

import Seminar2.Animals.Duck;
import Seminar2.Animals.Owl;
import Seminar2.Animals.base.Animal;
import Seminar2.Animals.Bear;
import Seminar2.Animals.Cow;
import Seminar2.zoo.Zoo;

public class Main {
    public static void main(String[] args) {
        Animal bear = new Bear("Потапыч");
        Animal cow = new Cow("Мурка");


        Zoo zoo = new Zoo();
        zoo.addAnimal(bear).addAnimal(cow).addAnimal(new Duck("Дональд")).addAnimal(new Owl("Ёль"));
        System.out.println(zoo);

        System.out.println(zoo.getSound());

        RunSpeed champ = zoo.getRunnerChampion();
        System.out.println("Чемпион бегун");
        System.out.println(champ);

        System.out.println("Чемпион пловец");
        System.out.println(zoo.getSwimChampion());

        System.out.println("Чемпион летун");
        System.out.println(zoo.getFlyChampion());

        System.out.println("Бегуны");
        for (RunSpeed runner: zoo.runners()) {
            System.out.println(runner);
        }
        System.out.println("Летуны");
        for (FlySpeed fly: zoo.flyers()) {
            System.out.println(fly);
        }
        System.out.println("Плавуны");
        for (SwimSpeed swim: zoo.swimmers()) {
            System.out.println(swim);
        }
    }
}
